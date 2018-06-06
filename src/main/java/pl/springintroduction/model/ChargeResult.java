package pl.springintroduction.model;

public class ChargeResult {

    private final boolean successful;
    private final String declineMessage;

    public ChargeResult(boolean successful, String declineMessage) {
        this.successful = successful;
        this.declineMessage = declineMessage;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public String getDeclineMessage() {
        return declineMessage;
    }
}
