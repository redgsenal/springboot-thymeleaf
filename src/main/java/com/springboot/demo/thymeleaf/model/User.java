package com.springboot.demo.thymeleaf.model;

import java.io.Serializable;

import org.thymeleaf.util.StringUtils;

public class User implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String role;
    private boolean isAdmin;

    public User() {
    }

    public User(String firstName, String lastName, String email, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = !StringUtils.isEmpty(role) ? role.toUpperCase() : "";
        this.isAdmin = role.equalsIgnoreCase("Admin");
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

}
