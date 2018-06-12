package pl.springintroduction.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChargeRequest {

    private CreditCard creditCard;
    private BigDecimal amount;
}
