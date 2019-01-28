package com.brianaubry.budget.models.data;

import com.brianaubry.budget.models.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface TransactionDao extends CrudRepository<Transaction, Integer> {
    public List<Transaction> findAllByOrderByDateAsc();
    public List<Transaction> findAllByOrderByDateDesc();
}
