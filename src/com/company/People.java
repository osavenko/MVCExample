package com.company;

public class People {
    private String name;
    private String surname;
    private boolean sex;

    public People(String name, String surname, boolean sex) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public People() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "["+(sex?"male":"female")+" -> ("+name+" "+surname+")]";
    }
}
