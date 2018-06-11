package pl.springintroduction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.springintroduction.model.Receipt;

public interface ReceiptRepository extends JpaRepository<Receipt, Long> {
}
