package menu;

import service.ApplicationConstant;

import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException {
        ApplicationConstant.getConnection();
        ApplicationConstant.getAdminRepositoryImpl().creatTable();
        ApplicationConstant.getPrescriptionRepository().creatTable();
    }
}
