package org.academiadecodigo.bootcamp.hackathon.showMeTheWorldUser.model;

import javax.persistence.*;

/**
 * Created by codecadet on 17/04/2019.
 */
@Entity
@Table(name = "guides")
public class Guide {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "language1", nullable = false)
    private String language1;
    @Column(name = "language2", nullable = false)
    private String language2;
    @Column(name = "local", nullable = false)
    private String local;
    @Column(name = "rating", nullable = false)
    private Integer rating;
    @Column(name = "phone", nullable = false)
    private Integer phone;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "tag1", nullable = false)
    private String tag1;
    @Column(name = "tag2", nullable = false)
    private String tag2;
    @Column(name = "tag3", nullable = false)
    private String tag3;
    @Column(name = "tag4", nullable = false)
    private String tag4;
    @Column(name = "tag5", nullable = false)
    private String tag5;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLanguage1() {
        return language1;
    }

    public void setLanguage1(String language1) {
        this.language1 = language1;
    }

    public String getLanguage2() {
        return language2;
    }

    public void setLanguage2(String language2) {
        this.language2 = language2;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTag1() {
        return tag1;
    }

    public void setTag1(String tag1) {
        this.tag1 = tag1;
    }

    public String getTag2() {
        return tag2;
    }

    public void setTag2(String tag2) {
        this.tag2 = tag2;
    }

    public String getTag3() {
        return tag3;
    }

    public void setTag3(String tag3) {
        this.tag3 = tag3;
    }

    public String getTag4() {
        return tag4;
    }

    public void setTag4(String tag4) {
        this.tag4 = tag4;
    }

    public String getTag5() {
        return tag5;
    }

    public void setTag5(String tag5) {
        this.tag5 = tag5;
    }
}
