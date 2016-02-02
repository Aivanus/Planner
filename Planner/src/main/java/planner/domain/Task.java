package planner.domain;

public class Task {

    private String name;
    private Time start;
    private Time end;
    private Day day;

    public Task(String name, Time start, Time end, Day day) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.day = day;
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

    public int getDay() {
        return day.getOrdNumber();
    }

    @Override
    public String toString() {
        return name + ", " + day + ", " + start + "-" + end;
    }

}
