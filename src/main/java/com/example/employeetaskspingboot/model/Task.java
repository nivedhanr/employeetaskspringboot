package com.example.employeetaskspingboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tasks1")
public class Task {
    @Id
    @GeneratedValue
    private int id;
    private int empcode;

    private String task;

    public Task() {
    }

    public Task(int id, int empcode, String task) {
        this.id = id;
        this.empcode = empcode;
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpcode() {
        return empcode;
    }

    public void setEmpcode(int empcode) {
        this.empcode = empcode;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
