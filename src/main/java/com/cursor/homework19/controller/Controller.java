package com.cursor.homework19.controller;

import com.cursor.homework19.domain.model.Account;
import com.cursor.homework19.domain.model.Profile;
import com.cursor.homework19.service.AccountService;
import com.cursor.homework19.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Controller {
    private final static int ID = 500;
    private final AccountService accountService;
    private final ProfileService profileService;
    private Account account;
    private Profile profile;

    @Autowired
    public Controller(AccountService accountService, ProfileService profileService) {
        this.accountService = accountService;
        this.profileService = profileService;
    }

    @Transactional
    public void executeSequenceOfCrudOperation() {
        printAccountAndProfile();
        saveAccountAndProfile();
        printAllAccountsAndProfiles();
        removeAccountAndProfile();
    }

    private void saveAccountAndProfile() {
        createAccountAndProfile();
        accountService.save(account);
        profileService.save(profile);
    }

    private void printAccountAndProfile() {
        System.err.println(accountService.findAccountById(ID) + "\n" + profileService.findProfileById(ID));
    }

    private void printAllAccountsAndProfiles() {
        printAllAccounts();
        printAllProfiles();
    }

    private void printAllProfiles() {
        System.out.println("All profiles:");
        profileService.findAll().forEach(System.out::println);
    }

    private void printAllAccounts() {
        System.out.println("All accounts:");
        accountService.findAll().forEach(System.out::println);
    }

    private void createAccountAndProfile() {
        this.account = new Account(1001, "Tetyana", "Bakhmat", "Lviv",
                "Female", "rona_t");
        this.profile = new Profile(1001, "shovkova", "master",
                "Fairy Tales", "Cursor", "magician");
    }

    private void removeAccountAndProfile() {
        accountService.removeAccountById(account.getId());
        profileService.removeProfileById(profile.getId());
    }
}
