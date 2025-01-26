package main.patientmanagement;

import java.util.ArrayList;
import java.util.List;

public class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;
    private List<String> medicalHistory;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
        this.medicalHistory = new ArrayList<>();
    }

    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    public List<String> viewRecords() {
        return medicalHistory;
    }
}
