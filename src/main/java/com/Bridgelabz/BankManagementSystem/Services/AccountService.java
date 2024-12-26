package com.Bridgelabz.BankManagementSystem.Services;

import com.Bridgelabz.BankManagementSystem.Entity.Account;
import com.Bridgelabz.BankManagementSystem.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public Account addAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account getAccountByNo(Long accNo) {
        return accountRepository.findById(accNo).get();
    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public void deleteAccountByNo(Long accNo) {
         accountRepository.deleteById(accNo);
    }

    public Account updateAccountbyNo(Account correctAccount , Long accNo) {
        Account account = accountRepository.findById(accNo).get();
        if(account.getAccNo() != 0)
        {
            account.setAccNo(correctAccount.getAccNo());
        }
        if(account.getAccHolderName() != null)
        {
            account.setAccHolderName(correctAccount.getAccHolderName());
        }
        if(account.getBankName() !=null)
        {
            account.setBankName(correctAccount.getBankName());
        }
        if(account.getBankType() != null)
        {
            account.setBankType(correctAccount.getBankType());
        }
        if(account.getAccBalance() != 0)
        {
            account.setAccBalance(correctAccount.getAccBalance());
        }
        return accountRepository.save(account);
    }

}
