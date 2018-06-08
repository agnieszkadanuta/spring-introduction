package pl.springintroduction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.springintroduction.controller.PizzaOrderController;
import pl.springintroduction.model.PizzaOrder;
import pl.springintroduction.repository.PizzaOrderRepository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class PizzaOrderServiceImpl implements PizzaOrderService {

    @Autowired
    private PizzaOrderRepository pizzaOrderRepository;

    @Override
    public List<PizzaOrder> findAll() {
        return pizzaOrderRepository.findAll();
    }

    @Override
    public PizzaOrder findById(Long id) {
        return pizzaOrderRepository.findById(id);
    }

    @Override
    public PizzaOrder create(PizzaOrder pizzaOrder) {
        pizzaOrder.setOrderDateTime(LocalDateTime.now());
        return pizzaOrderRepository.save(pizzaOrder);
    }

    @Override
    public PizzaOrder completeOrder(Long id) {
        PizzaOrder pizzaOrder = pizzaOrderRepository.findById(id);
        pizzaOrder.setCompleted(true);
        pizzaOrder.setCompleteDateTime(LocalDateTime.now());
        return pizzaOrderRepository.save(pizzaOrder);
    }
}
