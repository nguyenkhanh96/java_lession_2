package models;

import java.util.Scanner;

/**
 * Student
 */
public class Student {

    private String id;
    private String name;
    private int age;
    private String course;
    private String address;
    private String school;
    private float mediumScore;
    private String classification;

    public Student() {
    }

    public Student(String id, String name, int age, String course, String address, String school, float mediumScore) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.address = address;
        this.school = school;
        this.mediumScore = mediumScore;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public float getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(float mediumScore) {
        this.mediumScore = mediumScore;
    }

    public String getClassification() {
        return classification;
    }

    private void setClassification(float poin) {
        if (poin >= 4 && poin < 6) {
            classification = "weak";
        } else if (poin >= 6 && poin < 8) {
            classification = "medium";
        } else if (poin >= 8 && poin <= 10) {
            classification = "good";
        } else {
            classification = "unknown";
        }
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào ID : ");
        this.id = sc.next();

        System.out.println("Nhập vào Name : ");
        this.name = sc.next();

        System.out.println("Nhập vào Age : ");
        this.age = sc.nextInt();

        System.out.println("Nhập vào Khoá học : ");
        this.course = sc.next();

        System.out.println("Nhập vào Địa chỉ : ");
        this.address = sc.next();

        System.out.println("Nhập vào Tên trường : ");
        this.school = sc.next();

        System.out.println("Nhập vào Điểm trung bình : ");
        this.mediumScore = sc.nextFloat();
        setClassification(mediumScore);
    }

    public void displayDetail() {
        System.out.println("-----------------------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Address: " + address);
        System.out.println("School: " + school);
        System.out.println("Medium score: " + mediumScore);
        System.out.println("Classification:" + classification);
    }

}