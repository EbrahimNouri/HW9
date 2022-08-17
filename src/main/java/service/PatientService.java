package service;

import entity.Patient;
import entity.Prescription;

public interface PatientService {
    Prescription addPrescription(Prescription prescription);
    Prescription readPrescription(Patient username);

}
