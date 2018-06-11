package pl.springintroduction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.springintroduction.model.PizzaOrder;

import java.util.List;

public interface PizzaOrderRepository extends JpaRepository<PizzaOrder, Long> {

    List<PizzaOrder> findByCompleted(boolean completed);

}
