package planner.domain;

public class Task {

    private String name;
    private Time start;
    private Time end;
    private String day;

    public Task(String name, Time start, Time end, String day) {
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

    public String getDay() {
        return day;
    }
    
    

    @Override
    public String toString() {
        return name + ", " + day + ", " + start + "-" + end;
    }
    
    

}
