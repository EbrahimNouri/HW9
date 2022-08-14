package repository;

import entity.Admin;
import entity.Drug;
import entity.Peron;
import entity.Prescription;

import java.sql.SQLException;
import java.util.List;

public interface AdminRepository {
    List<Prescription> addPrescription(Peron peron);
    boolean confirmed(Prescription prescription);
    boolean doesExist(Drug drug);
    boolean addDrug(Drug drug);
    void creatTable() throws SQLException;
}
