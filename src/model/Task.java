package service;

import enums.Priority;
import enums.Status;


public class Task {
    private int id;
    private String title;
    private String description;
    private Status status;
    private Priority priority;

public Task (int id, String title, String description, Status status, Priority priority) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.status = status;
    this.priority = priority;
}

public int getId() {
    return id;
}

public String getTitle() {
    return title;
}

public String getDescription() {
    return description;
}

public Status getStatus() {
    return status;
}

public Priority getPriority() {
    return priority;
}

}