package com.cursor.homework19.domain.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Data
@Entity
@Table (name = "profiles_table")
public class Profile {

    @OneToOne(mappedBy = "account_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username", nullable = false, unique = true)
    private String userName;

    @Column(name = "job_title", nullable = false)
    private String jobTitle;

    private String department;
    private String company;
    private String skill;

    @Getter(AccessLevel.NONE)
    @OneToOne
    @JoinTable(name = "account_profile",
            joinColumns = @JoinColumn(name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "profile_id"))
    private Profile profile;

    public Profile(int id, String userName, String jobTitle, String department, String company, String skill) {
        this.id = id;
        this.userName = userName;
        this.jobTitle = jobTitle;
        this.department = department;
        this.company = company;
        this.skill = skill;
    }
}
