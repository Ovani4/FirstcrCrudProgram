package main.java.com.ovani4.crudprogram.model;

import java.util.ArrayList;
import java.util.List;


public class User {
    private Integer id;
    private String firstName;
    private String lastName;
    private List<Integer> posts;
    private Integer region;

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getRegion() {
        return region;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosts(List<Integer> posts) {
        this.posts = posts;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", posts=" + posts +
                ", region=" + region +
                '}';
    }
}
