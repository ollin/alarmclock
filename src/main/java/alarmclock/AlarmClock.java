package alarmclock;

import java.time.LocalTime;
import java.util.function.Supplier;

public class AlarmClock {

    private final LocalTime alarmTime;
    private boolean ringing;

    public AlarmClock(LocalTime alarmTime) {
        this.alarmTime = alarmTime;
    }

    // 1. Aufgabe - Testen der Logik
    boolean isReadyToRing() {
        LocalTime now = LocalTime.now();

        if (alarmTime.getHour() == now.getHour()
                &&
                alarmTime.getMinute() == now.getMinute()) {

            return true;
        }

        return false;
    }

    public boolean isRinging() {
        return ringing;
    }

    // 2. Aufgabe - Testen der Logik
    void turnOn() {
        do {
            // wait
        } while (!isReadyToRing());

        ringing = true;
    }
}
