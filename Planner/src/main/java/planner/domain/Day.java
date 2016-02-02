package planner.domain;

public enum Day {

    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
    
    private int ordNumber;

    private Day(int ordNumber) {
        this.ordNumber = ordNumber;
    }

    public int getOrdNumber() {
        return ordNumber;
    }

    
    
}
