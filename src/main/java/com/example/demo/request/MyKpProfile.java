package com.example.demo.request;

public class MyKpProfile {

    private String name;

    public MyKpProfile(String name, String nuId, String employeeId, String managerName) {
        this.name = name;
        this.nuId = nuId;
        this.employeeId = employeeId;
        this.managerName = managerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNuId() {
        return nuId;
    }

    public void setNuId(String nuId) {
        this.nuId = nuId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    private String nuId;

    private String employeeId;

    private String managerName;
}
