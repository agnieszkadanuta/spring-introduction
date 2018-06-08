package pl.springintroduction.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PizzaOrder {

    private Long id;
    private LocalDateTime orderDateTime;
    private LocalDateTime completeDateTime;
    private boolean completed;
    private String description;
    private BigDecimal amount;

}
