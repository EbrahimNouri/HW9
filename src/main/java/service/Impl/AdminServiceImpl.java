package service.Impl;

import entity.Drug;
import entity.Prescription;
import service.AdminService;
import service.ApplicationConstant;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminServiceImpl implements AdminService {
    @Override
    public void SeeAllPrescriptions() throws SQLException {
        List<Prescription> prescriptions = ApplicationConstant.getPrescriptionRepositoryImpl().foundAllPrescription();
        for (int i = 0; i < prescriptions.size(); i++) {
            System.out.println(ApplicationConstant.getPrescriptionRepository().foundAllPrescription());
            System.out.println();
        }
    }

    @Override
    public void acceptPrescription(Prescription prescription) throws SQLException {
        List<Prescription> prescriptions = ApplicationConstant.getPrescriptionRepositoryImpl().findByUserId(prescription.getId(), prescription.getDate());
        for (Prescription prescription1 : prescriptions) {
            ApplicationConstant.getPrescriptionRepositoryImpl().trueSetConfig(prescription1);
        }
    }

    @Override
    public boolean checkDrugExist(Drug drug) throws SQLException {
        return ApplicationConstant.getDrugRepositoryIml().checkExist(drug.getId());
    }

    public void changeExistPrescription(List<Prescription> prescriptions) throws SQLException {
        List<Prescription> prescriptionList = new ArrayList<>();
        List<Drug> drugs;
        Prescription prescription;
        for (
                int i = 0; i < prescriptions.size(); i++) {
            prescription = prescriptions.get(i);
            drugs = prescription.getDrugs();
            for (int j = 0; j < drugs.size(); j++) {
                boolean check = ApplicationConstant.getDrugRepositoryIml().checkExist(prescription.getDrugs().get(j).getId());
            }
        }
    }

    @Override
    public void setPriceForDrug(Drug drug, double price) throws SQLException {
        ApplicationConstant.getDrugRepositoryIml().setPriceForDrug(drug, price);
    }

    @Override
    public boolean isExistAdmin(String username, String password) throws SQLException {
        if (ApplicationConstant.getAdminRepositoryImpl().findByUsername(username, password) == null) {
            return false;
        } else return true;
    }

}