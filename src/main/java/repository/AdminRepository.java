package repository;

import entity.Drug;
import entity.Person;
import entity.Prescription;

import java.sql.SQLException;
import java.util.List;

public interface AdminRepository {
    List<Prescription> addPrescription(Person person);
    boolean confirmed(Prescription prescription) throws SQLException;


    void creatTable() throws SQLException;
}
