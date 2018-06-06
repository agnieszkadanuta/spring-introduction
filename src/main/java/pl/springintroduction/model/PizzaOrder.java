package pl.springintroduction.model;

import java.math.BigDecimal;

public class PizzaOrder {

    private String description;
    private BigDecimal amount;

    public PizzaOrder(String description, BigDecimal amount) {
        this.description = description;
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
