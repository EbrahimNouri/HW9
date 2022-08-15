package repository.impl;

import entity.*;
import entity.Person;
import repository.AdminRepository;
import repository.BaseRepository;
import service.ApplicationConstant;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AdminRepositoryImpl implements AdminRepository, BaseRepository<Admin> {
    @Override
    public List<Prescription> addPrescription(Person person) {
        if (person.getUserType() == UserType.ADMIN) {

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
    public Admin Create(Admin admin) throws SQLException {
//        String sql = "insert into person( name, username, password, user_type) values (?,?,?,?)";
//        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(sql);
//        ps.setString(1, admin.getName());
//        ps.setString(2, admin.getUsername());
//        ps.setString(3, admin.getPassword());
//        ps.setString(4, admin.getUserType().toString());
        return admin;
    }

    @Override
    public Admin Read(Admin admin) throws SQLException {
//        String sql = "select * from person where id = ?";
//        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(sql);
//        ps.setLong(1, admin.getId());
//        ResultSet rs = ps.executeQuery();
//        if(rs.next()){
//            admin.setName(rs.getString(2));
//            admin.setUsername(rs.getString(3));
//            admin.setPassword(rs.getString(4));
//            UserType userType = UserType.valueOf(rs.getString(5));
//            admin.setUserType(userType);
//            admin.setName(rs.getString(6));
//        }
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
                user_type varchar(255))
                """;
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(query);
        ps.executeUpdate();
    }
}