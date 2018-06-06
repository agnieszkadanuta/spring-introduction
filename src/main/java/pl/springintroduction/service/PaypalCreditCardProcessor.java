package pl.springintroduction.service;

import pl.springintroduction.model.ChargeResult;
import pl.springintroduction.model.CreditCard;

import java.math.BigDecimal;

public class PaypalCreditCardProcessor implements CreditCardProcessor {
    public ChargeResult charge(CreditCard creditCard, BigDecimal amount) {
        return null;
    }
}
