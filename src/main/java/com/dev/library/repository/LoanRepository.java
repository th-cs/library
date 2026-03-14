package com.dev.library.repository;

import com.dev.library.entity.Loan;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {

}
