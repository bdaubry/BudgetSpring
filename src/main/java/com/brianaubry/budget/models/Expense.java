package com.brianaubry.budget.models;

import javax.persistence.Entity;

@Entity
public class Expense extends Transaction {

    private ExpenseCategory category;
    private String type = "Expense";

    public ExpenseCategory getCategory() {
        return category;
    }

    public void setCategory(ExpenseCategory category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }
}
