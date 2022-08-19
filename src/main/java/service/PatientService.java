package service;

import entity.Patient;
import entity.Prescription;

import java.sql.SQLException;

public interface PatientService {
    Prescription addPrescription(Prescription prescription) throws SQLException;
    void readPrescription(Patient patient, String date) throws SQLException;
    void editPrescription(Prescription prescription, long id) throws SQLException;
    void deletePrescription(Prescription prescription) throws SQLException;
}