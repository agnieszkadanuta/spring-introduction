package pl.springintroduction.service;

import org.springframework.stereotype.Component;
import pl.springintroduction.exception.UnreachableException;
import pl.springintroduction.model.ChargeResult;

@Component
public class DatabaseTransactionLog implements TransactionLog {

    public DatabaseTransactionLog() {
        System.out.println("DataBaseTransactionLog");
    }

    public void logChargeResult(ChargeResult result) {
        //zapisz do bazy danych

    }

    public void logConnectException(UnreachableException e) {
        //zapisz informację o błędzie do bazy danych

    }
}
