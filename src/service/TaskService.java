package service;

import enums.Priority;
import enums.Status;
import java.util.ArrayList;
import model.Task;

public class TaskService {
    private final ArrayList<Task> tasks;

    public TaskService() {
        tasks = new ArrayList<>();
    }
    public void addTask(Task task) {
        tasks.add(task);
    }
    public ArrayList<Task> getAllTasks() {
        return tasks;
    }
    
    public void deleteTask(int id) {
        boolean found = false;

        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);

            if (task.getId() == id) {
                tasks.remove(i);
                found = true;
                break;
            } 
            
        }
        if (!found) {
            System.out.println("Invalid ID");
        }
    }

    public Task getTaskById(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);

            if (task.getId() == id) {
                return task;
            }
        }
        System.out.println("Invalid ID");
        return null;

    }

    public void updateTask(int id, String newTitle) {
        boolean found = false;


        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            

            if (task.getId() == id) {
                task.setTitle(newTitle);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid ID");
        }
    }

    public void updateStatus(int id, Status newStatus) {
        boolean found = false;


        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            

            if (task.getId() == id) {
                task.setStatus(newStatus);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid ID");
        }
    }

    public void updatePriority(int id, Priority newPriority) {
        boolean found = false;


        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            

            if (task.getId() == id) {
                task.setPriority(newPriority);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid ID");
        }
    }

    public void updateDescription(int id, String newDescription) {
        boolean found = false;


        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            

            if (task.getId() == id) {
                task.setDescription(newDescription);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid ID");
        }
    }

    
}