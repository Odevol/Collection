package Task1;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private int workAge;

    public Employee() {}

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public void printEmployee(){
        System.out.println(this.getSurname() + " " + this.getName() + " " + this.getPatronymic() + "стаж работы " + this.getWorkAge());
    }


}

