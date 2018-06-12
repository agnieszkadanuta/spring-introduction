package pl.springintroduction.service;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.springintroduction.model.ChargeRequest;
import pl.springintroduction.model.ChargeResult;
import pl.springintroduction.model.CreditCard;

import java.math.BigDecimal;

@Component
public class PaypalCreditCardProcessor implements CreditCardProcessor {

    private static final String CHARGE_SERVICE_URL = "http://localhost:9090/chargeRequests";

    public ChargeResult charge(CreditCard creditCard, BigDecimal amount) {
        ChargeRequest chargeRequest = new ChargeRequest(creditCard, amount);

        RestTemplate restTemplate = new RestTemplate();
        ChargeResult chargeResult = restTemplate.postForObject(CHARGE_SERVICE_URL, chargeRequest, ChargeResult.class);

        return chargeResult;
        //obciążenie karty poprzez system PayPal
    }
}
