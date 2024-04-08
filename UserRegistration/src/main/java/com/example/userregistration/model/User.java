package com.example.userregistration.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;
    private String password;
    private String Address;
    private String Zipcode;
    private String contact;
    private String fullname;

    public User() {
        super();
    }

    public User(String email, String password, String Address, String Zipcode,String contact,String fullname) {

        this.email = email;
        this.password = password;
        this.Address = Address;
        this.Zipcode = Zipcode;
        this.contact = contact;
        this.fullname = fullname;
    }

}