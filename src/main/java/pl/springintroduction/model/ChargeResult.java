package pl.springintroduction.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class ChargeResult {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime chargeDateTime;
    private boolean successful;
    private String declineMessage;

    public ChargeResult(boolean successful, String declineMessage) {
        this.chargeDateTime = LocalDateTime.now();
        this.successful = successful;
        this.declineMessage = declineMessage;
    }

    public LocalDateTime getChargeDateTime() {
        return chargeDateTime;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public String getDeclineMessage() {
        return declineMessage;
    }
}
