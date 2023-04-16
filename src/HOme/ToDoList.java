package HOme;

import java.util.ArrayList;

public class ToDoList {

    private ArrayList<Task> tasks = new ArrayList<>();

    public void add(Task t) {
        tasks.add(t);
    }

    public void remove(Task t) {
        tasks.remove(t);
    }

    public void print() {
        tasks.forEach((t) -> System.out.println(t));
        System.out.println();
    }

    public Task getTaskById(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                return tasks.get(i);
            }
        }
        return null;
    }

    public Task getTaskByDone(boolean done){
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).isDone()==done){
                return tasks.get(i);
            }
        }
        return null;
    }
}