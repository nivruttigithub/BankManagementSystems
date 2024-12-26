package com.Bridgelabz.BankManagementSystem.Controllers;

import com.Bridgelabz.BankManagementSystem.Entity.Account;
import com.Bridgelabz.BankManagementSystem.Services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping("/addAccount")
    public Account addAccount(@RequestBody Account account)
    {
        return accountService.addAccount(account);
    }

    @GetMapping("/getAccountByNo/{accNo}")
    public Account getAccountByNo(@PathVariable Long accNo)
    {
        return accountService.getAccountByNo(accNo);
    }

    @GetMapping("/getAllAccounts")
    public List<Account> getAllAccounts()
    {
        return accountService.getAllAccounts();
    }
    @DeleteMapping("/deleteAccount/{accNo}")
    public String deleteAccount(@PathVariable Long accNo)
    {
         accountService.deleteAccountByNo(accNo);
         return "Account Deleted Successfully";
    }

    @PutMapping("/updateAccount/{accNo}")
    public Account updateAccount(@RequestBody Account account,@PathVariable Long accNo)
    {
        return accountService.updateAccountbyNo(account,accNo);
    }
}
