package com.arclaudio.banking.mapper;

import com.arclaudio.banking.dto.TransactionDto;
import com.arclaudio.banking.entity.Transaction;

public class TransactionMapper {

    public static Transaction mapToTransaction(TransactionDto transactionDto) {

        return new Transaction(
                transactionDto.id(),
                transactionDto.accountId(),
                transactionDto.amount(),
                transactionDto.transactionType(),
                transactionDto.timestamp()
        );
    }

    public static TransactionDto mapToTransactionDto(Transaction transaction) {
        return new TransactionDto(
                transaction.getId(),
                transaction.getAccountId(),
                transaction.getAmount(),
                transaction.getTransactionType(),
                transaction.getTimestamp()
        );
    }
}


