package com.example.lab4;

public class StudentMod {


    int id;
    int age;
    String name;


    public StudentMod() {
    }

    public StudentMod( int id , String name, int age ) {
        this.name = name;
        this.age = age;
        this.id= id;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentMod{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


