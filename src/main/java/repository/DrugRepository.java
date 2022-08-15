package repository;

import entity.Drug;

import java.sql.SQLException;

public interface DrugRepository{
    void creatTable() throws SQLException;
    Drug findById(long id) throws SQLException;
}
