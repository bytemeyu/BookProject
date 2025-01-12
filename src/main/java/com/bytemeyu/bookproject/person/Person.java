package com.bytemeyu.bookproject.person;

public class Person implements PersonInterface {
    private String name;
    private int age;
    private String gender;

    public Person (String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void haveABirthday() {
        int age = this.getAge();
        this.setAge(age + 1);
        System.out.println(this.getName() + "had a birthday.");
    }
}
