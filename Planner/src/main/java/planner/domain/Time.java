package planner.domain;

/**
 * Luokka säilyttää aikatietoja.
 */
public class Time {

    private int hours;
    private int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(int hours) {
        this(hours, 0);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    /**
     * Metodi palauttaa ajan minuuteina.
     *
     * @return aika minuuteina.
     */
    public int getTimeInMinutes() {
        return hours * 60 + minutes;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes;
    }

}
