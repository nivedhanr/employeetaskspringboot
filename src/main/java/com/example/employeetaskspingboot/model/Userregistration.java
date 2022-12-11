package com.example.employeetaskspingboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Userregistration {

    @Id
    @GeneratedValue
    private int id;
    private int empcode;
    private String name;

    private String address;

    private String phn;

    private String email;

    private String department;
    private String password;
    private String confirmpass;

    public Userregistration() {
    }

    public Userregistration(int id, int empcode, String name, String address, String phn, String email, String department, String password, String confirmpass) {
        this.id = id;
        this.empcode = empcode;
        this.name = name;
        this.address = address;
        this.phn = phn;
        this.email = email;
        this.department = department;
        this.password = password;
        this.confirmpass = confirmpass;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpass() {
        return confirmpass;
    }

    public void setConfirmpass(String confirmpass) {
        this.confirmpass = confirmpass;
    }
}
