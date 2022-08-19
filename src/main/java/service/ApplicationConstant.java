package service;

import repository.impl.*;
import service.Impl.AdminServiceImpl;

import java.sql.Connection;
import java.util.Scanner;

public class ApplicationConstant {
    private static Connection connection = new DatabaseHelper().connect();
    public static Connection getConnection() {
        return connection;
    }
    private static AdminRepositoryImpl adminRepositoryImpl = new AdminRepositoryImpl();
    public static AdminRepositoryImpl getAdminRepositoryImpl() {
        return adminRepositoryImpl;
    }
    private static DrugRepositoryImpl drugRepositoryIml = new DrugRepositoryImpl();
    public static DrugRepositoryImpl getDrugRepositoryIml() {
        return drugRepositoryIml;
    }
    public static PrescriptionRepositoryImpl getPrescriptionRepositoryImpl() {
        return prescriptionRepositoryImpl;
    }
    private static PrescriptionRepositoryImpl prescriptionRepositoryImpl = new PrescriptionRepositoryImpl();
    public static PrescriptionRepositoryImpl getPrescriptionRepository() {
        return prescriptionRepositoryImpl;
    }
    private static PatientRepositoryImpl patientRepository = new PatientRepositoryImpl();
    public static PatientRepositoryImpl getPatientRepository() {
        return patientRepository;
    }
    private static PersonRepositoryImpl personRepositoryImpl= new PersonRepositoryImpl();
    public static PersonRepositoryImpl getPersonRepository() {
        return personRepositoryImpl;
    }
    private static Printer printer = new Printer();
    public static Printer getPrinter() {
        return printer;
    }
    public static Scanner scanner = new Scanner(System.in);

    public static String  getInput() {
        return scanner.nextLine();
    }
    private DrugRepositoryImpl drugRepository = new DrugRepositoryImpl();


    public static Scanner getScanner() {
        return scanner;
    }

    public static DrugRepositoryImpl getDrugRepository() {
        return drugRepositoryIml;
    }
    private static PatientRepositoryImpl patientRepositoryImpl = new PatientRepositoryImpl();

    public static PersonRepositoryImpl getPersonRepositoryImpl() {
        return personRepositoryImpl;
    }

    public static PatientRepositoryImpl getPatientRepositoryImpl() {
        return patientRepositoryImpl;
    }
    private static AdminServiceImpl adminServiceImpl = new AdminServiceImpl();

    public static AdminServiceImpl getAdminServiceImpl() {
        return adminServiceImpl;
    }
}
