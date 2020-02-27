package com.cursor.homework19.domain.model.repository;

import com.cursor.homework19.domain.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    Optional<Account> findById(Integer id);

    List<Account> findAccountByFirstName(String firstName);

    List<Account> findByLastName(String lastName);

    List<Account> findAccountByCity(String city);

    List<Account> getAllAccounts();

    List<Account> findByGenderAndAndCity(String gender, String city);

    List<Account> findByUserName(String userName);
}
