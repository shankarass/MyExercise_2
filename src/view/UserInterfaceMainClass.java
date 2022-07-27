package view;

import dao.ProcessEmpDataV2;
import model.Employee;

import java.util.List;
import java.util.Scanner;

public class UserInterfaceMainClass {

    private List<ProcessEmpDataV2> processData;

    public UserInterfaceMainClass(List<ProcessEmpDataV2> processData) {
        this.processData = processData;
    }

    public int getAge() {
        return processData.stream().mapToInt(ProcessEmpDataV2::getAge).sum();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the employee name");
        String name = scan.nextLine();

        System.out.println("Enter the employee age");
        int age = scan.nextInt();
        Employee emp = new Employee();
        emp.setName(name);
        emp.setAge(age);
        // rest of the logic
    }
}
