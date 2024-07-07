package com.arclaudio.banking.mapper;

import com.arclaudio.banking.dto.AccountDto;
import com.arclaudio.banking.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto) {

        return new Account(
                accountDto.id(),
                accountDto.accountHolderName(),
                accountDto.balance()
        );
    }

    public static AccountDto mapToAccountDto(Account account) {
        return new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
    }
}
