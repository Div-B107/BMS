package com.div.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "User")
@Getter
@NoArgsConstructor
@Table(name = "users" , schema ="bank")
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
    @ManyToMany
    @JoinColumn(name = "user_role_id")
    @JoinTable(schema = "bank",
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "user_roles_id", referencedColumnName = "id"
            ))
    private List<Role> userRoleId;

    @OneToMany(mappedBy = "loan_id")
    private List<Loan> loanId;

    @OneToOne(mappedBy = "user")
    private Account accountId;
    @Column(name = "create_at" , updatable = false)
    private LocalDateTime createAt;
    @Column(name = "update_at")
    private LocalDateTime updateAt;
    @Column(name = "status")
    private boolean status;

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setFin(String fin) {
        if (fin.length() <= 7) {
            this.fin = fin;
        }else {
            System.out.println("Invalid fin");
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUserRoleId(List<Role> userRoleId) {
        this.userRoleId = userRoleId;
    }

    public void setLoanId(List<Loan> loanId) {
        this.loanId = loanId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }
}
