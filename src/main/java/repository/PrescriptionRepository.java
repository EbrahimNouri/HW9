package repository;

import entity.Drug;
import entity.Prescription;

import java.sql.SQLException;

public interface PrescriptionRepository{
    void prescriptionsCreate(Prescription prescription) throws SQLException;
    void creatTable() throws SQLException;
}
