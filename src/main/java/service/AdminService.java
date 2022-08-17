package service;

import entity.Drug;
import entity.Prescription;

import java.util.List;

public interface AdminService {
    List<Prescription> SeeAllPrescriptions();
    void acceptPrescription(List<Prescription> prescriptions);
    boolean checkDrugExist(List<Prescription> prescriptions);
    boolean setPriceForDrug(Drug drug);
}
