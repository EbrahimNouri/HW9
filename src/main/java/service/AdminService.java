package service;

import entity.Admin;
import entity.Drug;
import entity.Prescription;

import java.sql.SQLException;
import java.util.List;

public interface AdminService {
    void SeeAllPrescriptions() throws SQLException;
    void acceptPrescription(Prescription prescription) throws SQLException;
    boolean checkDrugExist(Drug drug) throws SQLException;
    void setPriceForDrug(Drug drug, double price) throws SQLException;
    boolean isExistAdmin(String username, String password) throws SQLException;
}
