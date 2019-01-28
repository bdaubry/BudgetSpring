package com.brianaubry.budget.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Transaction {

    @Id
    @GeneratedValue
    private int transactionId;

    @NotNull
    private double amount;

    @Size(min=1, message="Description can't be empty")
    private String description;
    //private Account account;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private Date date;

    public Transaction() {
    }

    public Transaction(double amount, String description) {
        this.amount = amount;
        this.description = description;
        //this.account = account;
        this.date = new Date();
        System.out.println(date);
    }

    public int getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
