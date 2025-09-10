package CP.day1;
// 3. Hospital, Doctors, and Patients
import java.util.*;
class Patient {
    private String name;
    private List<Doctor> consultedDoctors = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor doctor) {
        if (!consultedDoctors.contains(doctor)) {
            consultedDoctors.add(doctor);
        }
    }

    public String getName() {
        return name;
    }
public void showConsultedDoctors() {
        System.out.println(name + " has consulted:");
        for (Doctor d : consultedDoctors) {
            System.out.println("- Dr. " + d.getName());
        }
    }
}

class Doctor {
    private String name;
    private List<Patient> patientsSeen = new ArrayList<>();

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting patient " + patient.getName());
        if (!patientsSeen.contains(patient)) {
            patientsSeen.add(patient);
        }
        patient.addDoctor(this); 
    }
public String getName() {
        return name;
    }

    public void showPatientsSeen() {
        System.out.println("Dr. " + name + " has seen:");
        for (Patient p : patientsSeen) {
            System.out.println("- " + p.getName());
        }
    }
}

class Hospital {
    private String hospitalName;
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }
public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getName());
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}

