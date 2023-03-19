package com.bank.profile.repository;

import com.bank.profile.entity.passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepository extends JpaRepository<passport, Long> {
}