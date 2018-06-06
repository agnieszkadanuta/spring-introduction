package pl.springintroduction.model;

public class Receipt {

    public static Receipt forSuccessfulCharge(Object amount) {
    }

    public static Receipt forDeclinedCharge(Object declineMessage) {
    }

    public static Receipt forSystemFailure(Object message) {
    }
}
