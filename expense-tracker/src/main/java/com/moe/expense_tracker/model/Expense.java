package com.moe.expense_tracker.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String description;

    private double amount;

    @ManyToOne
    private User user;

    public Expense() {}

    public Expense(String description, double amount, User user) {
        this.description = description;
        this.amount = amount;
        this.user = user;
    }

    // getters & setters
    public Long getId() { return id; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}

