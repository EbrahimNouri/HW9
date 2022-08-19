package service.Impl;

import entity.Patient;
import entity.Prescription;
import service.ApplicationConstant;
import service.PatientService;

import java.sql.SQLException;

public class PatientServiceImpl implements PatientService {
    @Override
    public Prescription addPrescription(Prescription prescription) throws SQLException {
        ApplicationConstant.getPrescriptionRepositoryImpl().prescriptionsCreate(prescription);
        return prescription;
    }

    @Override
    public void readPrescription(Patient patient, String date) throws SQLException {

        System.out.println(ApplicationConstant.getPrescriptionRepositoryImpl().findByUserId(patient.getId(), date));
    }

    @Override
    public void editPrescription(Prescription prescription, long id) throws SQLException {
       ApplicationConstant.getPrescriptionRepositoryImpl().update(prescription, id);
    }

    @Override
    public void deletePrescription(Prescription prescription) throws SQLException {
        ApplicationConstant.getPrescriptionRepositoryImpl().Delete(prescription);
    }

}
