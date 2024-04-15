public class Utilisateur {

private String FirstName;

private String LastName;

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getMail() {
        return mail;
    }

    private String mail;
    public Utilisateur(String Firstname, String lastName, String mail) {
        this.FirstName = Firstname;
        this.LastName = lastName;
        this.mail = mail;
    }

}
