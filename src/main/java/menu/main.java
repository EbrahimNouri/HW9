package menu;

import service.ApplicationConstant;
import service.Printer;

import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException {
        ApplicationConstant.getConnection();
        ApplicationConstant.getDrugRepositoryIml().creatTable();

        ApplicationConstant.getAdminRepositoryImpl().creatTable();
        ApplicationConstant.getPrescriptionRepository().creatTable();
        Printer.printTable();
        String input = ApplicationConstant.getInput();
    }
}
