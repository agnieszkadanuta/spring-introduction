package pl.springintroduction;

import pl.springintroduction.model.CreditCard;
import pl.springintroduction.model.PizzaOrder;
import pl.springintroduction.model.Receipt;
import pl.springintroduction.service.BillingService;
import pl.springintroduction.service.CreditCardBillingService;

public class Application {

    public static void main(String[] args) {

        BillingService billingService = new CreditCardBillingService();

        PizzaOrder pizzaOrder = new PizzaOrder();
        CreditCard creditCard = new CreditCard();

        Receipt receipt = billingService.chargeOrder(pizzaOrder, creditCard);

        System.out.println(receipt);
    }

}
