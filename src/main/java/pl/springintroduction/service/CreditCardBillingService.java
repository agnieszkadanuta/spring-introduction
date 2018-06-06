package pl.springintroduction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.springintroduction.exception.UnreachableException;
import pl.springintroduction.factory.CreditCardProcessorFactory;
import pl.springintroduction.factory.TransactionLogfactory;
import pl.springintroduction.model.ChargeResult;
import pl.springintroduction.model.CreditCard;
import pl.springintroduction.model.PizzaOrder;
import pl.springintroduction.model.Receipt;

@Component
public class CreditCardBillingService implements BillingService {

    private final CreditCardProcessor creditCardProcessor;
    private final TransactionLog transactionLog;

    @Autowired
    //oznacza, że przy wywołaniu konstruktora wywoływane są Beany określonych typów
    public CreditCardBillingService(CreditCardProcessor creditCardProcessor, TransactionLog transactionLog) {
        System.out.println("CreditCardBillingservice");
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
