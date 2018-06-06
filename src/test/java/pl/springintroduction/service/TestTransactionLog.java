package pl.springintroduction.service;

import pl.springintroduction.exception.UnreachableException;
import pl.springintroduction.model.ChargeResult;

public class TestTransactionLog implements TransactionLog {

    private ChargeResult chargeResult;

    public void logChargeResult(ChargeResult result) {
        chargeResult = result;

    }

    public void logConnectException(UnreachableException e) {

    }
}
