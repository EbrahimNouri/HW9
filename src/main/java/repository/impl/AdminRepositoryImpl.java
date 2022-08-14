package repository.impl;

import entity.*;
import repository.AdminRepository;
import repository.BaseRepository;
import service.ApplicationConstant;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AdminRepositoryImpl implements AdminRepository, BaseRepository<Admin> {
    @Override
    public List<Prescription> addPrescription(Peron peron) {
        if(peron.getUserType() == UserType.ADMIN){
            
        }
        return null;
    }

    @Override
    public boolean confirmed(Prescription prescription) {
        return false;
    }

    @Override
    public boolean doesExist(Drug drug) {
        return false;
    }

    @Override
    public boolean addDrug(Drug drug) {
        return false;
    }

    @Override
    public Admin Create(Admin admin) {
        return null;
    }

    @Override
    public Admin Read(Admin admin) {
        return null;
    }

    @Override
    public void Update(Admin admin) {

    }

    @Override
    public void Delete(Admin admin) {

    }

    @Override
    public void creatTable() throws SQLException {
        String query = """
                create table if not exists person(
                id serial primary key,
                name varchar(127),
                username varchar(127),
                password varchar(127),
                user_type varchar(255),
                prescriptions bigint references prescription(id))
                """;
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(query);
        ps.executeUpdate();
    }
}