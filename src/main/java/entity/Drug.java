package entity;

import java.util.Objects;

public class Drug {
    private long id;
    private String name;
    private double price;
    private boolean doesExist;

    public Drug() {
    }

    public Drug(long id, String name, double price, boolean doesExist) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.doesExist = doesExist;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDoesExist() {
        return doesExist;
    }

    public void setDoesExist(boolean doesExist) {
        this.doesExist = doesExist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drug drug = (Drug) o;
        return id == drug.id && Double.compare(drug.price, price) == 0 && doesExist == drug.doesExist && Objects.equals(name, drug.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, doesExist);
    }

    @Override
    public String toString() {
        return "Drug{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", doesExist=" + doesExist +
                '}';
    }
}
