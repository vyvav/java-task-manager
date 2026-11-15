import enums.Priority;
import enums.Status;
import java.util.Scanner;
import model.Task;
import service.TaskService;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskService taskService = new TaskService();
        int nextId = 1;
        String nextTitle = "";
        String nextDescription = "";
        Status nextStatus = Status.TODO;
        Priority nextPriority = Priority.LOW;
        

        while (true) { 
            System.out.println("===== TASK MANAGER =====");
            System.out.println("1. Add task");
            System.out.println("2. Show all tasks");
            System.out.println("3. Find task by ID");
            System.out.println("4. Delete task");
            System.out.println("5. Exit");

            System.out.println("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                
                System.out.println("===== ADD TASK =====");
                
                System.out.println("Title: ");
                nextTitle = sc.nextLine();
                System.out.println("Description: ");
                nextDescription = sc.nextLine();

                Task task = new Task(nextId, nextTitle, nextDescription, nextStatus, nextPriority);
                taskService.addTask(task);
                nextId++;
                System.out.println("Task successfully added!");
            } else if (choice == 2) {
                System.out.println("===== SHOW ALL TASKS =====");
                for (Task task : taskService.getAllTasks()) {
                    System.out.println("");
                    System.out.println("Id: " + task.getId());
                    System.out.println("Title: " + task.getTitle());
                    System.out.println("Description: " + task.getDescription());
                    System.out.println("Status: " + task.getStatus());
                    System.out.println("Priority: " + task.getPriority());
                }
            } else if (choice == 3) {
                System.out.println("===== FIND TASK BY ID =====");
                int searchId = sc.nextInt();
                Task foundTask = taskService.getTaskById(searchId);



                if (foundTask != null) {
                    System.out.println("Title: " + foundTask.getTitle());
                    System.out.println("Description: " + foundTask.getDescription());
                    System.out.println("Status: " + foundTask.getStatus());
                    System.out.println("Priority: " + foundTask.getPriority());
                }
            } else if (choice == 4) {
                System.out.println("===== DELETE TASK =====");
                int searchId = sc.nextInt(); 
                sc.nextLine();
                taskService.deleteTask(searchId);
                if (taskService.getAllTasks().isEmpty()) {
                    System.out.println("No tasks found.");
                }
                

            } else if (choice== 5) {
                break;
            }
            
        }
        
        
        
        
    }
}