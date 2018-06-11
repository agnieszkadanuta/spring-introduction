package pl.springintroduction.model;


import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class PizzaOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime orderDateTime;
    private LocalDateTime completeDateTime;
    private boolean completed;
    @Singular
    @OneToMany(mappedBy = "pizzaOrder", cascade = CascadeType.ALL, orphanRemoval = true) //jeśli usuwwmy pizzaorder to automatycznie zostaną usunięte powiązane z nią orderitemy
    private List<OrderItem> orderitems;
    private BigDecimal amount;

}
