package entity;

import java.util.Objects;

public class Patient extends Person {
    private Prescription prescription;


    public Patient(long id, String name, String username, String password, UserType userType, Prescription prescription) {
        super(id, name, username, password, userType);
        this.prescription = prescription;
    }

    public Patient() {
        super();
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Patient patient = (Patient) o;
        return Objects.equals(prescription, patient.prescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), prescription);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "prescription=" + prescription +
                '}';
    }
}
