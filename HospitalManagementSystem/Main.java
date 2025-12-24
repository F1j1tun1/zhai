import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Patient> patients = new ArrayList<>();
    private static final ArrayList<Doctor> doctors = new ArrayList<>();
    private static final ArrayList<Appointment> appointments = new ArrayList<>();

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        patients.add(new Patient(1, "Yerkingali Saruar", 18, "A+"));
        doctors.add(new Doctor(1, "Dr. Kazybek", "Cardiology", 12));
        appointments.add(new Appointment(1, "Yerkingali Saruar",
                "Dr. Kazybek", "2025-03-10"));

        boolean status = true;

        while (status) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch  (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    viewAllPatients();
                    break;
                case 3:
                    addDoctor();
                    break;
                case 4:
                    viewAllDoctors();
                    break;
                case 5:
                    addAppointment();
                    break;
                case 6:
                    viewAllAppointments();
                    break;
                case 0:
                    status = false;
                    System.out.println("Programm finished");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        if (status) {
            System.out.println("\nPress Enter to continue...");
            scanner.nextLine();
        }
    }

    private static void displayMenu() {
        System.out.println("\n==============================");
        System.out.println(" HOSPITAL MANAGEMENT SYSTEM");
        System.out.println("==============================");
        System.out.println("1. Add Patient");
        System.out.println("2. View All Patients");
        System.out.println("3. Add Doctor");
        System.out.println("4. View All Doctors");
        System.out.println("5. Add Appointment");
        System.out.println("6. View All Appointments");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
    }

    private static void addPatient() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Blood type: ");
        String blood = scanner.nextLine();

        patients.add(new Patient(id, name, age, blood));
        System.out.println("Patient added.");
    }

    private static void viewAllPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients.");
            return;
        }

        for (Patient p : patients) {
            System.out.println(p);
        }
    }

    private static void addDoctor() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Specialization: ");
        String spec = scanner.nextLine();

        System.out.print("Experience years: ");
        int exp = scanner.nextInt();
        scanner.nextLine();

        doctors.add(new Doctor(id, name, spec, exp));
        System.out.println("Doctor added.");
    }

    private static void viewAllDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors.");
            return;
        }

        for (Doctor d : doctors) {
            System.out.println(d);
        }
    }

    private static void addAppointment() {
        System.out.print("Appointment ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Patient name: ");
        String patient = scanner.nextLine();

        System.out.print("Doctor name: ");
        String doctor = scanner.nextLine();

        System.out.print("Date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        appointments.add(new Appointment(id, patient, doctor, date));
        System.out.println("Appointment added.");
    }

    private static void viewAllAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments.");
            return;
        }

        for (Appointment a : appointments) {
            System.out.println(a);
        }
    }
}



