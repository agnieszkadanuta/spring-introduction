package pl.springintroduction.service;

import pl.springintroduction.exception.UnreachableException;
import pl.springintroduction.model.ChargeResult;

public interface TransactionLog {

    void logChargeResult(ChargeResult result);

    void logConnectException(UnreachableException e);
}
