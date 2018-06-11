package pl.springintroduction.service;

import org.springframework.stereotype.Service;
import pl.springintroduction.exception.UnreachableException;
import pl.springintroduction.model.ChargeResult;
import pl.springintroduction.repository.ChargeResultRepository;

@Service
public class DatabaseTransactionLog implements TransactionLog {

    private final ChargeResultRepository chargeResultRepository;

    public DatabaseTransactionLog(ChargeResultRepository chargeResultRepository) {
        this.chargeResultRepository = chargeResultRepository;
    }

    public void logChargeResult(ChargeResult result) {
        chargeResultRepository.save(result);

    }

    public void logConnectException(UnreachableException e) {
        //zapisz informację o błędzie do bazy danych

    }
}
