import java.io.Serializable;

public class Contact implements Serializable {
    private static final long serialVersionUID = 1L; // Ensures version compatibility during serialization
    private String name;
    private String phoneNumber;
    private String emailAddress;

    public Contact(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Phone: " + phoneNumber + " | Email: " + emailAddress;
    }
}
