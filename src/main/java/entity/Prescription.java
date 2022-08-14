package entity;

import java.util.List;
import java.util.Objects;

public class Prescription {
    private Peron peron;
    private List<Drug> drugs;
    private boolean confirmation;

    public Prescription() {
    }

    public Prescription(Peron peron, List<Drug> drugs, boolean confirmation) {
        this.peron = peron;
        this.drugs = drugs;
        this.confirmation = confirmation;
    }

    public Peron getPeron() {
        return peron;
    }

    public void setPeron(Peron peron) {
        this.peron = peron;
    }

    public List<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<Drug> drugs) {
        this.drugs = drugs;
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
        return confirmation == that.confirmation && Objects.equals(peron, that.peron) && Objects.equals(drugs, that.drugs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peron, drugs, confirmation);
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "peron=" + peron +
                ", drugs=" + drugs +
                ", confirmation=" + confirmation +
                '}';
    }
}
