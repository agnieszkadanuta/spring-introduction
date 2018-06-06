package pl.springintroduction.service;

import pl.springintroduction.model.ChargeResult;
import pl.springintroduction.model.CreditCard;

import java.math.BigDecimal;

public interface CreditCardProcessor {

    ChargeResult charge(CreditCard creditCard, BigDecimal amount);
}
