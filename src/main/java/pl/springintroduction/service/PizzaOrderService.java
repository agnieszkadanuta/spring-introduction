package pl.springintroduction.service;

import pl.springintroduction.model.CreditCard;
import pl.springintroduction.model.PizzaOrder;
import pl.springintroduction.model.Receipt;

import java.util.List;

public interface PizzaOrderService {

    List<PizzaOrder> findAll();

    PizzaOrder findById(Long id);

    PizzaOrder create(PizzaOrder pizzaOrder);

    PizzaOrder completeOrder(Long id);

    List<PizzaOrder> searchPizzaOrders(boolean completed);

    void deleteById(Long id);

    Receipt chargeOrder(Long id, CreditCard creditCard);
}
