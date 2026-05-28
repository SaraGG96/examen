package com.springfield.powerplant.model;

public final class Employee {

    private String name;
    private String id;
    private Department department;
    private ExperienceLevel experienceLevel;
    private Shift shift;



    public Employee(String name, String id, Department department, ExperienceLevel experienceLevel, Shift shift) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.experienceLevel = experienceLevel;
        this.shift = shift;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public Department getDepartment() {
        return this.department;
    }

    public ExperienceLevel getExperienceLevel() {
        return this.experienceLevel;
    }

    public Shift getShift() {
        return this.shift;
    }

    public void SetExperienceLevel(ExperienceLevel newLevel) {
        this.experienceLevel = newLevel;
    }
    
     @Override
     public String toString() {
        return "ID: " + this.id + "Nivel: " + this.experienceLevel + "Turno: " + this.shift;
     }
     
}
