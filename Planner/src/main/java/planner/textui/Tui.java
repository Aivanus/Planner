package planner.textui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import planner.domain.Task;
import planner.domain.Time;

public class Tui {

    private List<Task> tasks;
    private Scanner reader;

    public Tui(Scanner reader) {
        this.tasks = new ArrayList<>();
        this.reader = reader;
    }

    public void start() {
        printWelcome();
        while (true) {

            String command = reader.nextLine();
            System.out.println("");
            
            if (command.equals("0")) {
                break;
            }
            if (command.equals("1")) {
                if (createTask()){
                    System.out.println("Task created successfully");
                }
            }

            if (command.equals("2")) {
                listTasks();
            }
            
            System.out.println("");
            printWelcome();
        }
    }

    private void printWelcome() {
        System.out.println("Choose an action\n"
                + "(1) Create task\n"
                + "(2) List tasks\n"
                + "(0) Exit");
        System.out.println("");
    }

    private boolean createTask() {
        int start = -1;
        int end = -1;
        
        System.out.print("Name: ");
        String name = reader.nextLine();
        System.out.print("Day: ");
        String day = reader.nextLine();
        System.out.print("Starting hour: ");
        
        try{
            start = Integer.parseInt(reader.nextLine());
        } catch(Exception e){
            System.out.println("input not valid");
            return false;
        }
        System.out.print("Ending hour: ");
        try{
            end = Integer.parseInt(reader.nextLine());
        }catch (Exception e){
            System.out.println("Input not valid");
            return false;
        }
        tasks.add(new Task(name, new Time(start), new Time(end), day));
        
        return true;
    }

    private void listTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

}
