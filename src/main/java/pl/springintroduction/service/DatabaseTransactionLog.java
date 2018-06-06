package pl.springintroduction.service;

import pl.springintroduction.exception.UnreachableException;
import pl.springintroduction.model.ChargeResult;

public class DatabaseTransactionLog implements TransactionLog {

    public void logChargeResult(ChargeResult result) {

    }

    public void logConnectException(UnreachableException e) {

    }
}
