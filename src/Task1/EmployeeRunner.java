package Task1;

import Task1.Enums.Name;
import Task1.Enums.Surname;
import Task1.Enums.Patronymic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class EmployeeRunner {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            Employee e = new Employee();
            String eSurname = Surname.getRundomSurname();
            e.setSurname(eSurname);
            String eName = Name.getRundomName();
            e.setName(eName);
            String ePatronymic = Patronymic.getRundomPatronomic();
            e.setPatronymic(ePatronymic);
            e.setWorkAge(random.nextInt(50));
            employees.add(e);
            e.printEmployee();
        }
        System.out.println("--------------------------------------------------");
        printEmployeeWithWorkAge(employees, 20);
    }

    public static void printEmployeeWithWorkAge(ArrayList<Employee> employees, int workAge){
        for(Iterator<Employee> e = employees.iterator(); e.hasNext();){
            Employee em = e.next();
            if(em.getWorkAge() >= workAge){
                em.printEmployee();
            }
        }
    }
}

