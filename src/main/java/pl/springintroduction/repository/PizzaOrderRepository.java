package pl.springintroduction.repository;

import pl.springintroduction.model.PizzaOrder;

import java.util.List;

public interface PizzaOrderRepository {

    List<PizzaOrder> findAll();
    PizzaOrder findById(Long id);
    PizzaOrder save(PizzaOrder pizzaOrder);
    List<PizzaOrder> searchByCompleted(boolean completed);
    void delete(Long id);
}
