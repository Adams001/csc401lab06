/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Scanner;

/**
 *
 * @author Abubakar Adamu
 */
public class TestEmployee3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        String name;
        double salary;
        
        System.out.print("Enter name for employee1: ");
        name = input.nextLine();
        System.out.print("Enter ID Number for employee1: ");
        number = input.nextInt();
        System.out.print("Enter Salary for employee 1: ");
        salary = input.nextDouble();
        
        Employee3 emp1 = new Employee3(number, name, salary);
        
        System.out.print("Enter ID Number for employee2: ");
        number = input.nextInt();
        System.out.print("Enter name for employee2: ");
        name = input.nextLine();
        
        
        Employee3 emp2 = new Employee3(name, number);
        emp2.setSalary(emp1.getSal());
        emp1.deductions(50);
        emp2.deductions(60, 40);
        
        System.out.print(emp1+"\n");
        System.out.print(emp2);
        
        
    }
}
