package com.brianaubry.budget.models;

public enum ExpenseCategory {
    ENTERTAINMENT ("Entertainment"),
    EDUCATION ("Education"),
    SHOPPING ("Shopping"),
    PERSONAL_CARE ("Personal Care"),
    HEALTHCARE ("Healthcare"),
    CHILDREN ("Children"),
    FOOD ("Food/Groceries"),
    GIFT ("Gift"),
    INVESTMENT ("Investment"),
    BILL ("Bills"),
    AUTOMOTIVE ("Automotive"),
    TRAVEL ("Travel"),
    FEE ("Fees/charges"),
    TAXES ("Taxes");


    private final String name;

    ExpenseCategory(String name) { this.name = name; };

    public String getName() {return name;}

}
