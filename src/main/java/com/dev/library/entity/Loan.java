package com.dev.library.entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.Data;

@Entity
@Table(name = "tb_loans")
@Data
public class Loan {

	// Entity attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private LocalDate loanDate;

	@Column(nullable = false)
	private LocalDate returnDate;

	// Table relationship
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
}
