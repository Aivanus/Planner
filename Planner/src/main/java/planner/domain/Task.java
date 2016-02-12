package planner.domain;

import java.awt.Color;

/**
 * Luokka säilyttää ja palauttaa yhteen "tehtävään" liityyää tietoa.
 */
public class Task {

    private String name;
    private Time start;
    private Time end;
    private Day day;
    private Color color;

    public Task(String name, Time start, Time end, Day day) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.day = day;
        this.color = Color.white;
    }

    /**
     * Konstruktori, joka luo uuden tehtävän.
     *
     * @param name tehtävän nimi
     * @param start tehtävän alkamisaika
     * @param end tehtävän loppumisaika
     * @param day päivä, jolle tehtävä merkitään
     * @param color minkä värinen taulukon solusta tulee, kun tehtävä lisätään
     * taulukkoon
     */
    public Task(String name, Time start, Time end, Day day, Color color) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.day = day;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getStartTime() {
        return start.getHours();
    }

    public int getEndTime() {
        return end.getHours();
    }

    /**
     * Metodi palauttaa tehtävälle merkatun päivän järjestysnumeron.
     *
     * @return päivän järjestysnumero
     */
    public int getDay() {
        return day.getOrdNumber();
    }

    /**
     * Metodi palauttaa tehtävän keston tunteina.
     *
     * @return tehtävän kesto tunteina
     */
    public int getDuration() {
        return end.getHours() - start.getHours();
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return name + ", " + day + ", " + start + "-" + end;
    }

}
