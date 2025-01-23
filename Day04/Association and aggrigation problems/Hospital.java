import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor doctor1 = new Doctor("Dr. Smith", "Cardiologist");
        Doctor doctor2 = new Doctor("Dr. Johnson", "Neurologist");

        // Create patients
        Patient patient1 = new Patient("Alice", 30);
        Patient patient2 = new Patient("Bob", 40);
        Patient patient3 = new Patient("Charlie", 50);

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);

        // Perform consultations
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient2);
        doctor2.consult(patient3);

        // Display hospital details
        hospital.displayDetails();

        // Display patients consulted by each doctor
        doctor1.displayPatients();
        doctor2.displayPatients();

        // Display doctors consulted by each patient
        patient1.displayDoctors();
        patient2.displayDoctors();
        patient3.displayDoctors();
    }
}



class Hospital {
    private String name;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Add a patient to the hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Display all doctors and patients in the hospital
    public void displayDetails() {
        System.out.println("Hospital: " + name);

        System.out.println("\nDoctors:");
        for (Doctor doctor : doctors) {
            System.out.println(" - " + doctor.getName());
        }

        System.out.println("\nPatients:");
        for (Patient patient : patients) {
            System.out.println(" - " + patient.getName());
        }
    }
}

class Doctor {
    private String name;
    private String specialization;
    private ArrayList<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        // Create an association between the doctor and the patient
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // Ensure bidirectional association
        }
        System.out.println("Doctor " + name + " is consulting Patient " + patient.getName());
    }

    public void displayPatients() {
        System.out.println("Patients consulted by Dr. " + name + ":");
        for (Patient patient : patients) {
            System.out.println(" - " + patient.getName());
        }
    }

    public String getName() {
        return name;
    }
}

class Patient {
    private String name;
    private int age;
    private ArrayList<Doctor> doctors;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        // Create an association between the patient and the doctor
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void displayDoctors() {
        System.out.println("Doctors consulted by Patient " + name + ":");
        for (Doctor doctor : doctors) {
            System.out.println(" - " + doctor.getName());
        }
    }

    public String getName() {
        return name;
    }
}


