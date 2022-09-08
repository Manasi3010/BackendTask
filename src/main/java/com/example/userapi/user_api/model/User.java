package com.example.userapi.user_api.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;
    @Column(name = "gender")
    private String gender;
    @Column(name = "age")
    private int age;
    @Column(name = "bday")
    private String bday;

    @Column(name = "username")
    private String username;

    @Column(name = "imageurl")
    private String imageurl;

    @Column(name = "password")
    private String password;

    @Column(name = "domain")
    private String domain;

    @Column(name = "ip")
    private String ip;

    @Column(name = "macAddress")
    private String macAddress;

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

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Column(name = "university")
    private String university;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_details_id", referencedColumnName = "id")
    private user_detail uDetail;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_Bank_id", referencedColumnName = "id")
    private UserBank uBank;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_Company_id", referencedColumnName = "id")
    private UserCompany uCompany;

    public user_detail getuDetail() {
        return uDetail;
    }

    public UserBank getuBank() {
        return uBank;
    }

    public void setuBank(UserBank uBank) {
        this.uBank = uBank;
    }

    public UserCompany getuCompany() {
        return uCompany;
    }

    public void setuCompany(UserCompany uCompany) {
        this.uCompany = uCompany;
    }

    public void setuDetail(user_detail uDetail) {
        this.uDetail = uDetail;
    }

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "User [age=" + age + ", bday=" + bday + ", domain=" + domain + ", email=" + email + ", firstName="
                + firstName + ", gender=" + gender + ", id=" + id + ", imageurl=" + imageurl + ", ip=" + ip
                + ", lastName=" + lastName + ", macAddress=" + macAddress + ", password=" + password + ", uDetail="
                + uDetail + ", university=" + university + ", username=" + username + ",uBank="
                + uBank + ",uCompany="
                + uCompany + "]";
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

    public User(String firstName, String lastName, String email, String gender, int age, String bday, String username,
            String imageurl, String password, String domain, String ip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.bday = bday;
        this.username = username;
        this.imageurl = imageurl;
        this.password = password;
        this.domain = domain;
        this.ip = ip;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

}
