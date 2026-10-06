package ru.vsu.cs.oop26.g42.nazencev_n_yu.taskmanager;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TaskList {
    private String name;
    private LocalDateTime time;

    public TaskList(String name, LocalDateTime time){
        this.name = name;
        this.time = time;
    }
    public String getName() {
        return name;
    }
    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String ConsoleOut(int index) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return String.format("%d. [%s] %s", index, time.format(formatter), name);
    }
}

