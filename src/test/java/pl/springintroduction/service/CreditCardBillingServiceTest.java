package pl.springintroduction.service;

import org.junit.Assert;
import org.junit.Test;
import pl.springintroduction.factory.CreditCardProcessorFactory;
import pl.springintroduction.factory.TransactionLogfactory;
import pl.springintroduction.model.CreditCard;
import pl.springintroduction.model.PizzaOrder;
import pl.springintroduction.model.Receipt;

import java.math.BigDecimal;

public class CreditCardBillingServiceTest {

    @Test
    public void shouldCreateReceiptForProperOrder() {

        CreditCardProcessorFactory.setInstance(new TestCreditCardProcessor());
        TransactionLogfactory.setInstance(new TestTransactionLog());

        CreditCardBillingService creditCardBillingService = new CreditCardBillingService();

        PizzaOrder pizzaOrder = new PizzaOrder("description", BigDecimal.TEN);
        CreditCard creditCard = new CreditCard();
        Receipt actualReceipt = creditCardBillingService.chargeOrder(pizzaOrder, creditCard);

        Assert.assertTrue(actualReceipt.isSuccessful());
        Assert.assertTrue(actualReceipt.getAmount().equals(BigDecimal.TEN));
    }

}
