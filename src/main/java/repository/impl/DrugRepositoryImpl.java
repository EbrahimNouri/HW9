package repository.impl;

import entity.Drug;
import repository.BaseRepository;
import repository.DrugRepository;
import service.ApplicationConstant;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DrugRepositoryImpl implements DrugRepository, BaseRepository<Drug> {
    @Override
    public Drug Create(Drug drug) throws SQLException {
        String sql = "insert into drug(name, price,does_exist)values (?,?,?)";
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(sql);
        ps.setString(1, drug.getName());
        ps.setDouble(2, drug.getPrice());
        ps.setBoolean(3, drug.isDoesExist());
        ps.executeUpdate();
        return drug;
    }

    @Override
    public Drug Read(Drug drug) throws SQLException {
        String sql = "select * from drug where id = ?";
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(sql);
        ps.setLong(1, drug.getId());
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            drug.setId(rs.getLong(1));
            drug.setName(rs.getString(2));
            drug.setPrice(rs.getDouble(3));
        }
        return drug;
    }

    @Override
    public void Update(Drug drug) throws SQLException {
        String sql = "update drug set name = ?, price = ? where id = ?";
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(sql);
        ps.setLong(1, drug.getId());
        ps.executeUpdate();
    }

    @Override
    public void Delete(Drug drug) throws SQLException {
        String sql = "delete from drug where id = ?";
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(sql);
        ps.setLong(1, drug.getId());
        ps.executeUpdate();
    }

    @Override
    public void creatTable() throws SQLException {
        String query = "create table if not exists drug(id serial primary key , name varchar(255), price float, does_exist bool)";
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(query);
        ps.executeUpdate();
    }

    @Override
    public Drug findById(long id) throws SQLException {
        Drug drug = null;
        String sql = "select * from drug where id = ?";
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(sql);
        ps.setLong(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            drug.setId(rs.getLong(1));
            drug.setName(rs.getString(2));
            drug.setPrice(rs.getDouble(3));
            drug.setDoesExist(rs.getBoolean(4));
        }

        return drug;
    }

    @Override
    public boolean checkExist(long id) throws SQLException {
        String sql = "select does_exist from drug where id = ?";
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(sql);
        ps.setLong(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getBoolean("does_exist");
        } else {
            System.out.println("does not exist");
            return false;
        }
    }

    @Override
    public double checkPrice(long id) throws SQLException {
        String sql = "select price from drug where id = ?";
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(sql);
        ps.setLong(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getFloat(1);
        }
        System.out.println("dont exist returned 0");
        return 0;
    }

    public void setPriceForDrug(Drug drug, double price) throws SQLException {
        String sql = "update drug set price = ? where id = ?";
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(sql);
        ps.setDouble(1, price);
        ps.setLong(2, drug.getId());
        ps.executeUpdate();
    }
}