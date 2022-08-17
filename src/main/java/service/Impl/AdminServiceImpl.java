package service.Impl;

import entity.Drug;
import entity.Prescription;
import service.AdminService;

import java.util.List;

public class AdminServiceImpl implements AdminService {
    @Override
    public List<Prescription> SeeAllPrescriptions() {

        return null;
    }

    @Override
    public void acceptPrescription(List<Prescription> prescriptions) {

    }

    @Override
    public boolean checkDrugExist(List<Prescription> prescriptions) {
        return false;
    }

    @Override
    public boolean setPriceForDrug(Drug drug) {
        return false;
    }
}
