package com.div.models;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "User")
@Table(name = "users" , schema ="bank")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "fin", nullable = false, unique = true)
    private String fin;
    @Column(name = "first_name",nullable = false)
    private String firstName;
    @Column(name = "last_name",nullable = false)
    private String lastName;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
    @Column(name = "user_role_id", nullable = false)
    @OneToOne
    private Role userRoleId;
    @OneToMany(mappedBy = "user")
    private Loan loanId;

    @OneToOne(mappedBy = "user")
    private Account accountId;

  /*  @ManyToOne()
    @JoinColumn(name = "library_id")
    private Library library;
    @ManyToMany
    @JoinColumn(name = "author_id")
    @JoinTable(schema = "library_data",
            name = "books_authors",
            joinColumns = @JoinColumn(
                    name = "books_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "authors_id", referencedColumnName = "id"
            ))
    private List<Author> author;

   */




}
