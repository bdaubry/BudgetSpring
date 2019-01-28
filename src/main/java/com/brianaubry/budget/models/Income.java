package com.brianaubry.budget.models;

import javax.persistence.Entity;

@Entity
public class Income extends Transaction {

    private IncomeCategory category;
    private String type = "Income";

    public IncomeCategory getCategory() {
        return category;
    }

    public void setCategory(IncomeCategory category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }
}
