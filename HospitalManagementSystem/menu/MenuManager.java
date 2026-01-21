package menu;

import model.*;
import exception.InvalidInputException;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuManager implements Menu {
    private final ArrayList<Person> people = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void displayMenu() {
        System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");
        System.out.println("1. Add Doctor");
        System.out.println("2. Add Patient");
        System.out.println("3. View All People");
        System.out.println("4. Polymorphism Demo (work)");
        System.out.println("5. Treating Demo");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
    }
    public void testData() {
        people.add(new Doctor(1, "Dr. Kasym", 45, "Upper", "Cardiology", 15));
        people.add(new Doctor(2, "Dr. Nazira", 67, "Lower", "Lungs", 15));
        people.add(new Patient(3, "Miras Sayat", 23, "Upper", "Cancer", true));
        people.add(new Patient(4, "Dilnaz Marat", 19, "lower", "Asthma", true));
    }
    @Override
    public void run() {
        boolean running = true;
        testData();
        while (running) {
            try {
                displayMenu();
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1: addDoctor(); break;
                    case 2: addPatient(); break;
                    case 3: viewAllPeople(); break;
                    case 4: demonstrateWork(); break;
                    case 5: demonstrateTreating(); break;
                    case 0:
                        System.out.println("Exiting...");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
            catch (Exception e){
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    private void addDoctor() {
        try {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Department: ");
            String dept = scanner.nextLine();

            System.out.print("Specialization: ");
            String spec = scanner.nextLine();

            System.out.print("Experience years: ");
            int exp = scanner.nextInt();

            people.add(new Doctor(id, name, age, dept, spec, exp));
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void addPatient() {
        try {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Department: ");
            String dept = scanner.nextLine();

            System.out.print("Illness: ");
            String illness = scanner.nextLine();

            System.out.print("Checked (true/false): ");
            boolean checked = scanner.nextBoolean();

            people.add(new Patient(id, name, age, dept, illness, checked));
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void viewAllPeople() {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    private void demonstrateWork() {
        for (Person p : people) {
            p.work();
        }
    }

    private void demonstrateTreating() {
        for (Person p : people) {
            if (p instanceof Treating) {
                Treating t = (Treating) p;
                t.treat();
            }
        }
    }
}
