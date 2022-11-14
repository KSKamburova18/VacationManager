package com.example.vacationmanager.model;

public class User {
    private String username;
    private String password;
    private String name;

    private String lastName;
    private String role;
    private String team;

    public User() {

    }

    public User(String username, String password, String name, String lastName, String role, String team) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.role = role;
        this.team = team;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {

        return "Users{" +

                "nickname='" + username + '\'' +

                ", password='" + password + '\'' +

                ", firstName='" + name + '\'' +

                ", lastName='" + lastName + '\'' +

                ", role='" + role + '\'' +

                ", team='" + team + '\'' +

                '}';

    }
}

