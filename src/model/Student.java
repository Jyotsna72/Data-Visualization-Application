package model;

public class Student {

    private int id;
    private String name;
    private String department;
    private double cgpa;
    private String gender;
    private String placed;

    public Student(int id, String name, String department,
                   double cgpa, String gender, String placed) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        this.gender = gender;
        this.placed = placed;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getGender() {
        return gender;
    }

    public String getPlaced() {
        return placed;
    }
}