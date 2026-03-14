package com.dev.library.repository;

import com.dev.library.entity.LibraryCard;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface LibraryCardRepository extends JpaRepository<LibraryCard, Long> {

}
