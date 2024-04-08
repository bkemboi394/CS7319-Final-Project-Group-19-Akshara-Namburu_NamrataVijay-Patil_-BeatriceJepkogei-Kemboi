package com.example.userregistration.DTO;


public class UserDto {

    private String email;
    private String password;
    private String Address;
    private String Zipcode;
    private String contact;
    private String fullname;

    public UserDto(String email, String password, String Address, String Zipcode,String contact,String fullname) {
        super();
        this.email = email;
        this.password = password;
        this.Address = Address;
        this.Zipcode = Zipcode;
        this.contact = contact;
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return Address;
    }
    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String Zipcode) {
        this.Zipcode = Zipcode;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }


    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }






}
