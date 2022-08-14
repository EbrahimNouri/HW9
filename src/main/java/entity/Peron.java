package entity;

import java.util.Objects;

public abstract class Peron {
    private long id;
    private String name;
    private String username;
    private String password;
    private UserType userType;

    public Peron(long id, String name, String username, String password, UserType userType) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.userType = userType;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peron peron = (Peron) o;
        return id == peron.id && Objects.equals(name, peron.name) && Objects.equals(username, peron.username) && Objects.equals(password, peron.password) && userType == peron.userType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, username, password, userType);
    }

    @Override
    public String toString() {
        return "Peron{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userType=" + userType +
                '}';
    }
}
