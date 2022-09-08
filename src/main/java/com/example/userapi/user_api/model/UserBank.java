package com.example.userapi.user_api.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "UserBank")
public class UserBank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "cardExpire")
    private String cardExpire;
    @Column(name = "cardNumber")
    private String cardNumber;
    @Column(name = "cardType")
    private String cardType;
    @Column(name = "currency")
    private String currency;
    @Column(name = "iban")
    private String iban;
    @JsonIgnore
    @OneToOne(mappedBy = "uBank", cascade = CascadeType.ALL)
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardExpire() {
        return cardExpire;
    }

    public void setCardExpire(String cardExpire) {
        this.cardExpire = cardExpire;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "UserBank [cardExpire=" + cardExpire + ", cardNumber=" + cardNumber + ", cardType=" + cardType
                + ", currency=" + currency + ", iban=" + iban + ", id=" + id + ", user=" + user + "]";
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserBank() {
    }

    public UserBank(String cardExpire, String cardNumber, String cardType, String currency, String iban) {
        this.cardExpire = cardExpire;
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.currency = currency;
        this.iban = iban;

    }

}
