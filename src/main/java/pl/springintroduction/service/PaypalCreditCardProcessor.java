package pl.springintroduction.service;

import org.springframework.stereotype.Component;
import pl.springintroduction.model.ChargeResult;
import pl.springintroduction.model.CreditCard;

import java.math.BigDecimal;

@Component
public class PaypalCreditCardProcessor implements CreditCardProcessor {

    public ChargeResult charge(CreditCard creditCard, BigDecimal amount) {
        return new ChargeResult(true, "");
        //obciążenie karty poprzez system PayPal
    }
}
