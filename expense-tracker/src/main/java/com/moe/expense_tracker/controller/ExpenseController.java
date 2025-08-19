package com.moe.expense_tracker.controller;



import com.moe.expense_tracker.model.Expense;
import com.moe.expense_tracker.model.User;
import com.moe.expense_tracker.repository.ExpenseRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseRepository expenseRepository;

    public ExpenseController(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @GetMapping
    public ResponseEntity<List<Expense>> getExpenses(@AuthenticationPrincipal User user) {
        return ResponseEntity.ok(expenseRepository.findByUser(user));
    }

    @PostMapping
    public ResponseEntity<Expense> addExpense(@AuthenticationPrincipal User user,
                                              @Valid @RequestBody Expense expense) {
        expense.setUser(user);
        return ResponseEntity.ok(expenseRepository.save(expense));
    }
}


