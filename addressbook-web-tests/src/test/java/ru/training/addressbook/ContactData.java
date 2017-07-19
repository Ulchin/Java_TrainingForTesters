package ru.training.addressbook;

public class ContactData {
    private final String name;
    private final String midname;
    private final String lastname;
    private final String email;
    private final String mobile;

    public ContactData(String name, String midname, String lastname, String email, String mobile) {
        this.name = name;
        this.midname = midname;
        this.lastname = lastname;
        this.email = email;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public String getMidname() {
        return midname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }
}
