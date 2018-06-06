package pl.springintroduction;

import pl.springintroduction.factory.CreditCardProcessorFactory;
import pl.springintroduction.factory.TransactionLogfactory;
import pl.springintroduction.model.CreditCard;
import pl.springintroduction.model.PizzaOrder;
import pl.springintroduction.model.Receipt;
import pl.springintroduction.service.BillingService;
import pl.springintroduction.service.CreditCardBillingService;
import pl.springintroduction.service.DatabaseTransactionLog;
import pl.springintroduction.service.PaypalCreditCardProcessor;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        CreditCardProcessorFactory.setInstance(new PaypalCreditCardProcessor());
        TransactionLogfactory.setInstance(new DatabaseTransactionLog());

        BillingService billingService = new CreditCardBillingService();

        PizzaOrder pizzaOrder = new PizzaOrder("Pizza Margherita", new BigDecimal(25));
        CreditCard creditCard = new CreditCard();

        Receipt receipt = ((CreditCardBillingService) billingService).chargeOrder(pizzaOrder, creditCard);

        System.out.println(receipt);
    }

}
