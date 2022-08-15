package repository;

import entity.Drug;
import entity.Person;
import entity.Prescription;

import java.sql.SQLException;
import java.util.List;

public interface AdminRepository {
    List<Prescription> addPrescription(Person person);
    boolean confirmed(Prescription prescription);
    boolean doesExist(Drug drug);
    boolean addDrug(Drug drug);
    void creatTable() throws SQLException;
}
