package planner.domain;

import java.awt.Color;

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

    public int getDay() {
        return day.getOrdNumber();
    }

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
