package HOme;

public class ToDoMain {

    public static void main(String[] args) {

        ToDoList toDoList = new ToDoList();
        Task t1 = new Task(1, "Cleaning", false);
        Task t2 = new Task(2, "Shopping", true);
        Task t3 = new Task(3, "Walk with dog", false);
        Task t4 = new Task(4, "delete", true);
        Task t5 = new Task(5, "Cooking", true);
        toDoList.add(t1);
        toDoList.add(t2);
        toDoList.add(t3);
        toDoList.add(t4);
        toDoList.add(t5);
        System.out.println("---------PRINT 1.--------");
        toDoList.print();

        System.out.println("---------PRINT AFTER REMOVE--------");
        toDoList.remove(t4);
        System.out.println();
        toDoList.print();

        System.out.println("---------GET TASK BY ID--------");
        System.out.println(toDoList.getTaskById(2));
        System.out.println();
        System.out.println("---------GET TASK BY DONE--------");
        System.out.println(toDoList.getTaskByDone(true));
        System.out.println();

    }
}
