package pl.springintroduction.converter;

import org.springframework.stereotype.Component;
import pl.springintroduction.model.PizzaOrder;
import pl.springintroduction.model.PizzaOrderDTO;

@Component
public class PizzaOrderConverter {

    public PizzaOrder convert(PizzaOrderDTO pizzaOrderDTO) {
        PizzaOrder pizzaOrder = new PizzaOrder();

        pizzaOrder.setDescription(pizzaOrderDTO.getDescription());
        pizzaOrder.setAmount(pizzaOrderDTO.getAmount());

        return pizzaOrder;
    }
}
