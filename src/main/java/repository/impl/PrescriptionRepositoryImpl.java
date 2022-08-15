package repository.impl;

import entity.Drug;
import entity.Patient;
import entity.Prescription;
import repository.BaseRepository;
import repository.PrescriptionRepository;
import service.ApplicationConstant;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PrescriptionRepositoryImpl implements PrescriptionRepository, BaseRepository<Patient> {

    @Override
    public Patient Create(Patient patient) {

        return null;
    }

    @Override
    public Patient Read(Patient patient) {
        return null;
    }

    @Override
    public void Update(Patient patient) {
        String sql ="update prescription set drug_id = ?,  ";
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(sql);
        ps.setLong(1,patient.getId());
        ps.executeUpdate();
    }

    @Override
    public void Delete(Patient patient) throws SQLException {
        String sql ="delete from prescription where id = ?";
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(sql);
        ps.setLong(1,patient.getId());
        ps.executeUpdate();
    }

    @Override
    public void creatTable() throws SQLException {
        String query = """
                create table if not exists prescription(
                id serial primary key,
                drug_id bigint references drug(id),
                person_id bigint references person(id),
                date date,
                confirmation bool
                )
                """;
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(query);
        ps.executeUpdate();
    }

    public List<Prescription> findByUserId(long id, String date) throws SQLException {
        String sql = "select drug_id from prescription where id = ? and date = to_date(?,'yyy,mm,dd')";
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(sql);
        ps.setLong(1, id);
        ps.setString(2, date);
        ResultSet rs = ps.executeQuery();
        List<Prescription> prescriptions = new ArrayList<>();
        while (rs.next()) {
            Prescription prescription = null;
            prescription.setId(rs.getLong(1));
            prescription.setDrugs(drugsInPrescription(drugsInPrescriptionById(rs.getLong(2))));
            prescription.setDate(rs.getString(3));
            prescription.setConfirmation(rs.getBoolean(4));
            prescriptions.add(prescription);
        }
        return prescriptions;
    }

    public List<Long> drugsInPrescriptionById(long personId) throws SQLException {
        String sql = "select drug_id from prescription where person_id = ?";
        PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(sql);
        ps.setLong(1, personId);
        ResultSet rs = ps.executeQuery();
        List<Long> drugs = new ArrayList<>();
        if (rs.next()) {
            drugs.add(rs.getLong(1));
        }
        return drugs;
    }

    public List<Drug> drugsInPrescription(List<Long> DrugId) throws SQLException {
        List<Drug> drugsList = new ArrayList<>();
        for (long i = 0; i < DrugId.size(); i++) {
            Drug drug = null;
            String sql = "select * from drug where id = ?";
            PreparedStatement ps = ApplicationConstant.getConnection().prepareStatement(sql);
            ps.setLong(1, DrugId.indexOf(i));
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                drug.setId(rs.getLong(1));
                drug.setName(rs.getString(2));
                drug.setPrice(rs.getDouble(3));
                drugsList.add(drug);
            }
        }
        return drugsList;

    }

}
