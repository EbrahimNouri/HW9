package entity;

import java.util.List;
import java.util.Objects;

public class Admin extends Peron{
    private List<Prescription> prescriptions;

    public Admin(String name, String username, String password, UserType userType, List<Prescription> prescriptions) {
        super(name, username, password, userType);
        this.prescriptions = prescriptions;
    }

    public Admin(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Admin admin = (Admin) o;
        return Objects.equals(prescriptions, admin.prescriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), prescriptions);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "prescriptions=" + prescriptions +
                '}';
    }
}

