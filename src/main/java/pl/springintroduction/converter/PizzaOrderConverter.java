package pl.springintroduction.converter;

import org.springframework.stereotype.Component;
import pl.springintroduction.model.OrderItem;
import pl.springintroduction.model.PizzaOrder;
import pl.springintroduction.model.PizzaOrderDTO;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PizzaOrderConverter {

    public PizzaOrder convert(PizzaOrderDTO pizzaOrderDTO) {
        PizzaOrder pizzaOrder = new PizzaOrder();

        List<OrderItem> orderItemList = pizzaOrderDTO.getItems().stream()
                .map(description-> new OrderItem(pizzaOrder, description)).collect(Collectors.toList());
        pizzaOrder.setOrderitems(orderItemList);
        pizzaOrder.setAmount(pizzaOrderDTO.getAmount());

        return pizzaOrder;
    }
}
