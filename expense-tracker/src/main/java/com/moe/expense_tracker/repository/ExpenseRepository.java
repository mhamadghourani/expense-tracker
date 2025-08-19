package com.moe.expense_tracker.repository;

import com.moe.expense_tracker.model.Expense;
import com.moe.expense_tracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findByUser(User user);
}