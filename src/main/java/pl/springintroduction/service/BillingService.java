package pl.springintroduction.service;

import pl.springintroduction.model.CreditCard;
import pl.springintroduction.model.PizzaOrder;
import pl.springintroduction.model.Receipt;

public interface BillingService {

    /**
     * Attempts to charge the order to the credit card. Both successful and
     * failed transactions will be recorded.
     *
     * @return a receipt of the transaction. If the charge was successful, the
     *      receipt will be successful. Otherwise, the receipt will contain a
     *      decline note describing why the charge failed.
     */


}
