package pl.springintroduction.service;

import org.junit.Test;
import pl.springintroduction.factory.CreditCardProcessorFactory;
import pl.springintroduction.factory.TransactionLogfactory;
import pl.springintroduction.model.CreditCard;
import pl.springintroduction.model.PizzaOrder;
import pl.springintroduction.model.Receipt;

public class CreditCardBillingServiceTest {

    @Test
    void shouldCreateReceiptForProperOrder() {

        CreditCardProcessorFactory.setInstance(new TestCreditCardProcessor());
        TransactionLogfactory.setInstance(new TestTransactionLog());

        CreditCardBillingService creditCardBillingService = new CreditCardBillingService();

        PizzaOrder pizzaOrder = new PizzaOrder();
        CreditCard creditCard = new CreditCard();
        Receipt actualReceipt = creditCardBillingService.chargeOrder(pizzaOrder, creditCard);

    }

}
