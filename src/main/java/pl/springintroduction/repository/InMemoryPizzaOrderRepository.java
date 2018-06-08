package pl.springintroduction.repository;

import org.springframework.stereotype.Repository;
import pl.springintroduction.exception.PizzaOrderNotFoundException;
import pl.springintroduction.model.PizzaOrder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryPizzaOrderRepository implements PizzaOrderRepository {

    List<PizzaOrder> pizzaOrders;

    public InMemoryPizzaOrderRepository() {
        pizzaOrders = new ArrayList<>();
        pizzaOrders.add(new PizzaOrder(1L, "Pizza Margherita", new BigDecimal(25)));
        pizzaOrders.add(new PizzaOrder(2L, "Pizza Neapolitana", new BigDecimal(20)));
        pizzaOrders.add(new PizzaOrder(3L, "Pizza Spicy", new BigDecimal(30)));
    }

    public List<PizzaOrder> findAll(){
        return pizzaOrders;
    }

    public PizzaOrder findById(Long id){
        return pizzaOrders.stream().filter(pizzaOrder -> pizzaOrder.getId().equals(id))
                .findFirst().orElseThrow(() -> new PizzaOrderNotFoundException());

    }

    @Override
    public PizzaOrder save(PizzaOrder pizzaOrder) {
        Long maxId = pizzaOrders.stream().mapToLong(PizzaOrder::getId).max().orElse(1);
        pizzaOrder.setId(maxId + 1);
        pizzaOrders.add(pizzaOrder);
        return pizzaOrder;
    }
}
