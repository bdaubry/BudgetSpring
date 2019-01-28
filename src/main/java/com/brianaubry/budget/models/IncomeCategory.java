package com.brianaubry.budget.models;

public enum IncomeCategory {
    PAYCHECK ("Paycheck"),
    INVESTMENT ("Investment"),
    REFUND ("Refund"),
    BONUS ("Bonus"),
    INTEREST ("Interest"),
    REIMBURSEMENT ("Reimbursement"),
    RENTAL ("Rental"),
    MISC ("Miscellaneous");


    private final String name;

    IncomeCategory(String name) { this.name = name;}

    public String getName() { return name; }

}
