package pl.springintroduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import pl.springintroduction.factory.CreditCardProcessorFactory;
import pl.springintroduction.factory.TransactionLogfactory;
import pl.springintroduction.model.CreditCard;
import pl.springintroduction.model.PizzaOrder;
import pl.springintroduction.model.Receipt;
import pl.springintroduction.service.*;

import java.math.BigDecimal;

@ComponentScan
public class Application {

    public static void main(String[] args) {
        //obiekty zostaną utworzone w kontenerze Springa
       /* CreditCardProcessor creditCardProcessor = new PaypalCreditCardProcessor();
        TransactionLog transactionLog = new DatabaseTransactionLog();*/

       //trzeba utworzyć applicationContext
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);

        BillingService billingService = applicationContext.getBean(CreditCardBillingService.class);

        PizzaOrder pizzaOrder = new PizzaOrder("Pizza Margherita", new BigDecimal(25));
        CreditCard creditCard = new CreditCard();

        Receipt receipt = ((CreditCardBillingService) billingService).chargeOrder(pizzaOrder, creditCard);

        System.out.println(receipt);
    }

}
