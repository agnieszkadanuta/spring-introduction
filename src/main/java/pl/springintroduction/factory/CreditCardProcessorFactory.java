package pl.springintroduction.factory;

import pl.springintroduction.service.CreditCardProcessor;

public class CreditCardProcessorFactory {

    private static CreditCardProcessor instance;

    public static void setInstance(CreditCardProcessor creditCardProcessor){
        instance = creditCardProcessor;
    }

    public static CreditCardProcessor getInstance() {
        return instance;
    }
}
