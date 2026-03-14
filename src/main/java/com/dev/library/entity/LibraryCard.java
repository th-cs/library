package com.dev.library.entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import lombok.Data;

@Entity
@Table(name = "tb_library_cards")
@Data
public class LibraryCard {

	// Entity attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cardNumber;

	@Column(nullable = false)
	private LocalDate issueDate;

	@Column(nullable = false)
	private boolean isValid;

	// Table relationship
	@OneToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
}
