package com.balsani.dioapisantanderaccount.domain.model;

import jakarta.persistence.*;

import java.util.List;
@Entity(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private AccountType accountType;
    @Enumerated(EnumType.STRING)
    private CardType cardType;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<SavingsAccountBenefits> benefitsPackages;

    public User() {
    }

    public User(String name, AccountType accountType, CardType cardType, List<SavingsAccountBenefits> benefitsPackages) {
        this.name = name;
        this.accountType = accountType;
        this.cardType = cardType;
        this.benefitsPackages = benefitsPackages;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public CardType getCardType() {
        return cardType;
    }

    public List<SavingsAccountBenefits> getBenefitsPackages() {
        return benefitsPackages;
    }
}
