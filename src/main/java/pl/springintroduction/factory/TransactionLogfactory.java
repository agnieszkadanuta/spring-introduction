package pl.springintroduction.factory;

import pl.springintroduction.service.TransactionLog;

public class TransactionLogfactory {

    private static TransactionLog instance;

    public static void setInstance(TransactionLog transactionLog){
        instance = transactionLog;
    }

    public static TransactionLog getInstance() {
        return instance;
    }
}
