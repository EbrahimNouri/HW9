package menu;

import entity.Admin;
import service.ApplicationConstant;

import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException {
        while (true) {
            Printer.firstMenu();
            String input = ApplicationConstant.getInput();
            switch (input) {
                case "1" -> patientMenu();
                case "2" -> adminLogin();
                case "3" -> System.exit(1);
            }
        }
    }

    private static void patientMenu() {
        Printer.getMainMenu();
    }

    public static Admin adminLogin() throws SQLException {
        Printer.getMainMenu();
        String[] input = ApplicationConstant.getInput().split(" ");
        if(ApplicationConstant.getAdminServiceImpl().isExistAdmin(input[0], input[1])){
            adminMenu();
        }else {
            System.out.println("invalid username password");
        }
        return ApplicationConstant.getAdminRepositoryImpl().findByUsername();
    }
    public static void adminMenu() throws SQLException {
        Printer.adminMenuPrinter();
        switch (ApplicationConstant.getInput()){
            case "1" -> ApplicationConstant.getAdminServiceImpl().SeeAllPrescriptions();
            case "2" -> ApplicationConstant.getAdminServiceImpl().acceptPrescription();



        }
    }

    public static void adminMenuChoose(){

    }
}