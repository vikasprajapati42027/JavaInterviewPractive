package org.example.collections.practice.lamdaExpretionDate20240723;

import java.util.List;

public class User {

    private String name;
    private String number;
    private List<String> email;

    public User(String name, String number, List<String> email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }
}
