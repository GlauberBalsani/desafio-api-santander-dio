package com.balsani.dioapisantanderaccount.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_savings_account_benefits")
public class SavingsAccountBenefits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String description;

    public SavingsAccountBenefits() {
    }

    public SavingsAccountBenefits(String description) {
        this.description = description;
    }


    public String description() {
        return this.description;
    }
}
