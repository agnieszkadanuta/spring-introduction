package pl.springintroduction.service;

import pl.springintroduction.exception.UnreachableException;
import pl.springintroduction.factory.CreditCardProcessorFactory;
import pl.springintroduction.factory.TransactionLogfactory;
import pl.springintroduction.model.ChargeResult;
import pl.springintroduction.model.CreditCard;
import pl.springintroduction.model.PizzaOrder;
import pl.springintroduction.model.Receipt;

public class CreditCardBillingService implements BillingService {

    private final CreditCardProcessor creditCardProcessor;
    private final TransactionLog transactionLog;

    public CreditCardBillingService(CreditCardProcessor creditCardProcessor, TransactionLog transactionLog) {
        this.creditCardProcessor = creditCardProcessor;
        this.transactionLog = transactionLog;
    }

    public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {

        try {
            ChargeResult result = creditCardProcessor.charge(creditCard, order.getAmount());
            transactionLog.logChargeResult(result);

            return result.isSuccessful()
                    ? Receipt.forSuccessfulCharge(order.getAmount())
                    : Receipt.forDeclinedCharge(result.getDeclineMessage());
        } catch (UnreachableException e) {
            transactionLog.logConnectException(e);
            return Receipt.forSystemFailure(e.getMessage());
        }
    }

}
