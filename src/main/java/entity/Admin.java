package entity;

import java.util.List;
import java.util.Objects;

public class Admin extends Person {

    public Admin(long id, String name, String username, String password, UserType userType, List<Prescription> prescriptions) {
        super(id, name, username, password, userType);
    }

    public Admin() {
        super();
    }


}

