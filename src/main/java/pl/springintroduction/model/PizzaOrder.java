package pl.springintroduction.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PizzaOrder {

    private Long id;
    private String description;
    private BigDecimal amount;

}
