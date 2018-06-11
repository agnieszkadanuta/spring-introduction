package pl.springintroduction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.springintroduction.model.ChargeResult;

public interface ChargeResultRepository extends JpaRepository<ChargeResult, Long> {
}
