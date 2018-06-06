package pl.springintroduction;

import pl.springintroduction.factory.CreditCardProcessorFactory;
import pl.springintroduction.factory.TransactionLogfactory;
import pl.springintroduction.model.CreditCard;
import pl.springintroduction.model.PizzaOrder;
import pl.springintroduction.model.Receipt;
import pl.springintroduction.service.*;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        CreditCardProcessor creditCardProcessor = new PaypalCreditCardProcessor();
        TransactionLog transactionLog = new DatabaseTransactionLog();

        BillingService billingService = new CreditCardBillingService(creditCardProcessor, transactionLog);

        PizzaOrder pizzaOrder = new PizzaOrder("Pizza Margherita", new BigDecimal(25));
        CreditCard creditCard = new CreditCard();

        Receipt receipt = ((CreditCardBillingService) billingService).chargeOrder(pizzaOrder, creditCard);

        System.out.println(receipt);
    }

}
