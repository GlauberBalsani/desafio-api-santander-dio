package com.balsani.dioapisantanderaccount.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity(name = "tb_account")
public class SavingsAccount implements Account{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String number;
    private String agency;
    @Column(precision = 13, scale = 2)
    private BigDecimal balance;
    @Column(name = "additional_limit",precision = 13, scale = 2)
    private BigDecimal limit;

    public SavingsAccount() {
    }

    public SavingsAccount(String number, String agency, BigDecimal balance, BigDecimal limit) {
        this.number = number;
        this.agency = agency;
        this.balance = balance;
        this.limit = limit;
    }

    @Override
    public String getNumber() {
        return this.number;
    }

    @Override
    public String getAgency() {
        return this.agency;
    }

    @Override
    public BigDecimal getBalnce() {
        return this.balance;
    }

    @Override
    public BigDecimal getLimit() {
        return this.limit;
    }
}
