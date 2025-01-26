package main.patientmanagement;

import java.util.*;

public class PatientManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        InPatient inPatient = new InPatient("P101", "Alice", 30, 5, 2000);
        inPatient.addRecord("Admitted for surgery.");
        patients.add(inPatient);

        OutPatient outPatient = new OutPatient("P202", "Bob", 45, 500);
        outPatient.addRecord("Consulted for fever.");
        patients.add(outPatient);

        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Bill: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                System.out.println("Medical Records: " + record.viewRecords());
            }
            System.out.println();
        }
    }
}
