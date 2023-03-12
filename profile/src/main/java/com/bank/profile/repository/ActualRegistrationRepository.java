package com.bank.profile.repository;

import com.bank.profile.entity.ActualRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActualRegistrationRepository extends JpaRepository<ActualRegistration, Long> {
}
