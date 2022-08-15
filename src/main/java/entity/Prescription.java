package entity;

import java.util.List;
import java.util.Objects;

public class Prescription {
    private long id;
    private Person person;
    private List<Drug> drugs;
    private String date;
    private boolean confirmation;

    public Prescription() {
    }

    public Prescription(long id, Person person, List<Drug> drugs, String date, boolean confirmation) {
        this.id = id;
        this.person = person;
        this.drugs = drugs;
        this.date = date;
        this.confirmation = confirmation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Person getPeron() {
        return person;
    }

    public void setPeron(Person person) {
        this.person = person;
    }

    public List<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<Drug> drugs) {
        this.drugs = drugs;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isConfirmation() {
        return confirmation;
    }

    public void setConfirmation(boolean confirmation) {
        this.confirmation = confirmation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prescription that = (Prescription) o;
        return id == that.id && confirmation == that.confirmation && Objects.equals(person, that.person) && Objects.equals(drugs, that.drugs) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, person, drugs, date, confirmation);
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "id=" + id +
                ", person=" + person +
                ", drugs=" + drugs +
                ", date='" + date + '\'' +
                ", confirmation=" + confirmation +
                '}';
    }
}
