package contact;

public class Contact {
    String contactID;
    String firstName;
    String lastName;
    String phoneNumber;
    String address;

    public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
        super();
        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getContactID() {
        return contactID;
    }

    public void setContactID(String contactID) {
        this.contactID = contactID;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "Contact [contactID =" + contactID +", firstName = " + firstName + ", lastName =" + lastName + ", phoneNumber =" + phoneNumber + ", address =" + address +"]";
    }
}

