package pl.springintroduction.service;

import pl.springintroduction.model.PizzaOrder;

import java.util.List;

public interface PizzaOrderService {

    List<PizzaOrder> findAll();

    PizzaOrder findById(Long id);

    PizzaOrder create(PizzaOrder pizzaOrder);

    PizzaOrder completeOrder(Long id);
}
