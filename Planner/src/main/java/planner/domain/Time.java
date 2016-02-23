package planner.domain;

/**
 * Luokka säilyttää aikatietoja.
 */
public class Time {

    private int hours;
    private int minutes;

    /**
     * Konstruktori, joka luo olion.
     *
     * @param hours tunnit integerina
     * @param minutes minuutit integerina
     */
    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    /**
     * Konstruktori, jota käytetään, kun minuutteja ei tarvita.
     *
     * @param hours tunnit
     */
    public Time(int hours) {
        this(hours, 0);
    }

    public int getHours() {
        return hours;
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
