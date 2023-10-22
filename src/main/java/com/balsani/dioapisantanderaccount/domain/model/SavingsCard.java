package com.balsani.dioapisantanderaccount.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity(name = "tb_savings_card")
public class SavingsCard implements Card{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    @Column(name = "available_limit", precision = 13, scale = 2)
    private BigDecimal cardLimit;

    public SavingsCard() {
    }

    public SavingsCard(String number, BigDecimal cardLimit) {
        this.number = number;
        this.cardLimit = cardLimit;
    }

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public String number() {
        return null;
    }

    @Override
    public BigDecimal limit() {
        return null;
    }
}
