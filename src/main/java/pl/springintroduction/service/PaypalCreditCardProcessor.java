package pl.springintroduction.service;

import org.springframework.stereotype.Component;
import pl.springintroduction.model.ChargeResult;
import pl.springintroduction.model.CreditCard;

import java.math.BigDecimal;

@Component
public class PaypalCreditCardProcessor implements CreditCardProcessor {

    public PaypalCreditCardProcessor() {
        System.out.println("PayPalCreditCardProcessor");
    }

    public ChargeResult charge(CreditCard creditCard, BigDecimal amount) {
        return null;
        //obciążenie karty poprzez system PayPal
    }
}
