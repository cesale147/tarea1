package pweb.business;

import java.io.Serializable;

public class User implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String sexo;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        sexo = "";
    }

    public User(String firstName, String lastName, String email,String sexo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.sexo=sexo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
