package planner.domain;

/**
 * Luokka tarjoaa päivät toisten luokkien käyttöön.
 */
public enum Day {

    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

    private int ordNumber;

    private Day(int ordNumber) {
        this.ordNumber = ordNumber;
    }

    /**
     * Metodi palauttaa päivän järjestysnumeron.
     *
     * @return päivän järjestysnumero
     */
    public int getOrdNumber() {
        return ordNumber;
    }

}
