package planner.domain;

public enum Day {

    MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7), SUNDAY(8);
    
    private int ordNumber;

    private Day(int ordNumber) {
        this.ordNumber = ordNumber;
    }

    public int getOrdNumber() {
        return ordNumber;
    }

    
    
}
