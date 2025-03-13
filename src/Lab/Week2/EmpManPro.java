package Lab.Week2;

import java.util.Scanner;

class Employee{
    protected String name;
    protected int baseSalary;

    public Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int calculateSalary(){
        return baseSalary;
    }
    public void showSalary(){
        System.out.println("Total Salary: "+ calculateSalary());
    }

}

class Manager extends Employee{
    private int bonus;

    public Manager(String name, int baseSalary, int bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public int calculateSalary(){
        return baseSalary + bonus;
    }
}

class Programmer extends Employee{
    private int overtimePay;

    public Programmer(String name, int baseSalary, int overtimePay) {
        super(name, baseSalary);
        this.overtimePay = overtimePay;
    }

    @Override
    public int calculateSalary(){
        return baseSalary + overtimePay;
    }
}

public class EmpManPro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Manager's Name: ");
        String managerName = sc.nextLine();
        System.out.print("Enter Manager's Base Salary: ");
        int managerBaseSalary = sc.nextInt();
        System.out.print("Enter Manager's Bonus: ");
        int managerBonus = sc.nextInt();
        sc.nextLine();


        System.out.print("Enter Programmer's Name: ");
        String programmerName = sc.nextLine();
        System.out.print("Enter Programmer's Base Salary: ");
        int programmerBaseSalary = sc.nextInt();
        System.out.print("Enter Programmer's Overtime Pay: ");
        int programmerOvertimePay = sc.nextInt();


        Manager m = new Manager(managerName, managerBaseSalary, managerBonus);
        Programmer p = new Programmer(programmerName, programmerBaseSalary, programmerOvertimePay);

        System.out.println("Salary Details: ");
        m.showSalary();
        p.showSalary();
    }
}
