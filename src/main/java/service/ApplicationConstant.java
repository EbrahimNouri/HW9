package service;

import repository.impl.*;

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
    private static PersonRepositoryImpl personRepository= new PersonRepositoryImpl();

    public static PersonRepositoryImpl getPersonRepository() {
        return personRepository;
    }
    private static Printer printer = new Printer();

    public static Printer getPrinter() {
        return printer;
    }
    public static Scanner scanner = new Scanner(System.in);

    public static String  getInput() {
        return scanner.next();
    }
}
