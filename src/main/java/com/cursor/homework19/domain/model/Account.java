package com.cursor.homework19.domain.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Data
@Entity
@Table(name = "accounts")
public class Account {

    @OneToOne(mappedBy = "profile_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    private String city;

    private String gender;

    @Column(name = "username", nullable = false, unique = true)
    private String userName;

    @Getter(AccessLevel.NONE)
    @OneToOne
    @JoinTable(name = "account_profile",
            joinColumns = @JoinColumn(name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "profile_id"))
    private Account account;

    public Account(int id, String userName, String firstName, String lastName, String city, String gender) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.gender = gender;
    }
}
