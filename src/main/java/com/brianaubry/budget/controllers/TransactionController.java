package com.brianaubry.budget.controllers;


import com.brianaubry.budget.models.*;
import com.brianaubry.budget.models.data.TransactionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("transactions")
public class TransactionController {

    @Autowired
    private TransactionDao transactionDao;

    // Request path: /cheese
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("transactions", transactionDao.findAllByOrderByDateDesc());
        model.addAttribute("title", "Transaction List");

        return "transactions/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddIndex(Model model) {
        model.addAttribute("title", "Add a New Transaction");
        return "transactions/add/index";
    }

    //handle income transactions

    @RequestMapping(value = "add/income", method = RequestMethod.GET)
    public String displayAddIncomeForm(Model model) {
        model.addAttribute("title", "Add Income Transaction");
        model.addAttribute(new Income());
        model.addAttribute("incomeCategories", IncomeCategory.values());
        return "transactions/add/income";
    }

    @RequestMapping(value = "add/income", method = RequestMethod.POST)
    public String processAddIncomeForm(@ModelAttribute  @Valid Income newIncome,
                                       Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Income Transaction");
            model.addAttribute("incomeCategories", IncomeCategory.values());
            return "transactions/add/income";
        }

        transactionDao.save(newIncome);
        return "redirect:";
    }

    //handle expense transactions

    @RequestMapping(value = "add/expense", method = RequestMethod.GET)
    public String displayAddExpenseForm(Model model) {
        model.addAttribute("title", "Add Expense Transaction");
        model.addAttribute(new Expense());
        model.addAttribute("expenseCategories", ExpenseCategory.values());
        return "transactions/add/expense";
    }

    @RequestMapping(value = "add/expense", method = RequestMethod.POST)
    public String processAddExpenseForm(@ModelAttribute  @Valid Expense newExpense,
                                       Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Expense Transaction");
            model.addAttribute("expenseCategories", ExpenseCategory.values());
            return "transactions/add/expense";
        }

        transactionDao.save(newExpense);
        return "redirect:";
    }
}

