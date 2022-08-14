package repository.impl;

import entity.Patient;
import repository.BaseRepository;
import repository.PrescriptionRepository;
import service.ApplicationConstant;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrescriptionRepositoryImpl implements PrescriptionRepository , BaseRepository<Patient> {

    @Override
    public Patient Create(Patient patient) {
        return null;
    }

    @Override
    public Patient Read(Patient patient) {
        return null;
    }

    @Override
    public void Update(Patient patient) {

    }

    @Override
    public void Delete(Patient patient) {

    }

    @Override
    public void creatTable() throws SQLException {
        String query = """
                create table if not exists prescription(
                id serial primary key,
                name varchar(255),
                drug_id bigint references drug(id)
                )
                """;
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(query);
        ps.executeUpdate();
    }


}
