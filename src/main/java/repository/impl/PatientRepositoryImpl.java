package repository.impl;

import entity.Patient;
import entity.Prescription;
import entity.UserType;
import repository.BaseRepository;
import repository.PatientRepository;
import service.ApplicationConstant;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PatientRepositoryImpl implements PatientRepository, BaseRepository<Patient> {

    @Override
    public Patient Create(Patient patient) throws SQLException {
        String sql = "insert into person(name, username, password, user_type)values (?,?,?,?)";
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(sql);
        ps.setString(1, patient.getName());
        ps.setString(2, patient.getUsername());
        ps.setString(3, patient.getPassword());
        ps.setString(4, patient.getUserType().toString());
        ps.executeUpdate();
        return patient;
    }

    @Override
    public Patient Read(Patient patient) throws SQLException {
        String sql = "select * from person where id = ?";
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(sql);
        ps.setLong(1, patient.getId());
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            patient.setId(rs.getLong(1));
            patient.setName(rs.getString(2));
            patient.setUsername(rs.getString(3));
            patient.setPassword(rs.getString(4));
            UserType userType = UserType.valueOf(rs.getString(5));
            patient.setUserType(userType);
        }
        return patient;
    }

    @Override
    public void Update(Patient patient) throws SQLException {
        String sql = "update person set name = ?, username = ?, password = ?, user_type = ? where id = ?";
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(sql);
        ps.setString(1, patient.getName());
        ps.setString(2, patient.getUsername());
        ps.setString(3, patient.getPassword());
        ps.setString(4, patient.getUserType().toString());
        ps.setLong(5, patient.getId());
        ps.executeUpdate();
        System.out.println("Updated");
    }

    @Override
    public void Delete(Patient patient) throws SQLException {
        String sql = "delete from person where id = ?";
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(sql);
        ps.setLong(1, patient.getId());
        ps.executeUpdate();
    }

}
