package service;

import entity.Drug;
import entity.Patient;
import entity.Peron;
import entity.Prescription;
import repository.AdminRepository;
import repository.DrugRepository;
import repository.PatientRepository;
import repository.PrescriptionRepository;
import repository.impl.AdminRepositoryImpl;
import repository.impl.DrugRepositoryImpl;
import repository.impl.PatientRepositoryImpl;
import repository.impl.PrescriptionRepositoryImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

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
        return prescriptionRepository;
    }
    private static PatientRepositoryImpl patientRepository = new PatientRepositoryImpl();

    public static PatientRepositoryImpl getPatientRepository() {
        return patientRepository;
    }
}
