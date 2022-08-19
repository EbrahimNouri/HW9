package service.Impl;

import entity.Prescription;
import service.ApplicationConstant;
import service.PrescriptionService;

import java.sql.SQLException;

public class PrescriptionServiceImpl implements PrescriptionService {
    public void creat(Prescription prescription) throws SQLException {
        ApplicationConstant.getPrescriptionRepositoryImpl().prescriptionsCreate(prescription);
    }
    public Prescription read(Prescription prescription) throws SQLException {
        return ApplicationConstant.getPrescriptionRepositoryImpl().Read(prescription);
    }
    public void update(Prescription prescription, Long id) throws SQLException {
        ApplicationConstant.getPrescriptionRepositoryImpl().update(prescription, id);
    }
    public void delete(Prescription prescription) throws SQLException {
        ApplicationConstant.getPrescriptionRepositoryImpl().Delete(prescription);
    }

}
