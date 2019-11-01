import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

class Gigasecond {

    private LocalDateTime myDT;
    private Long oneGigaSecond = Long.valueOf("1000000000");

    Gigasecond(LocalDate moment) {
        addGigaSecond(moment.atTime(0, 0, 0));

    }

    Gigasecond(LocalDateTime moment) {
        addGigaSecond(moment);
    }

    private void addGigaSecond(LocalDateTime moment) {
        myDT = moment.plus(oneGigaSecond, ChronoUnit.SECONDS);
    }

    LocalDateTime getDateTime() {
        return myDT;
    }

}
