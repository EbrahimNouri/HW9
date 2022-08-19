package repository.impl;

import entity.Patient;
import entity.Person;
import entity.UserType;
import service.ApplicationConstant;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonRepositoryImpl {
    public Person findById(long id) throws SQLException {
        String sql = "select * from person where id = ?";
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(sql);
        ps.setLong(1, id);
        ResultSet rs = ps.executeQuery();
        Person person = new Patient();
        if (rs.next()) {
            person.setId(rs.getLong(1));
            person.setName(rs.getString(2));
            person.setUsername(rs.getString(3));
            person.setPassword(rs.getString(4));
            UserType userType = UserType.valueOf(rs.getString(5));
            person.setUserType(userType);
        }
        return person;
    }
}
