import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    LocalDateTime myDT;

    Gigasecond(LocalDate moment) {
        myDT = moment.atTime(0, 0);
    }

    Gigasecond(LocalDateTime moment) {
        myDT = moment;
    }

    LocalDateTime getDateTime() {
        return myDT;
    }

}
