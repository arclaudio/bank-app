package com.arclaudio.banking.dto;

public record TransferFundDto(
        Long fromAccountId,
        Long toAccountId,
        double amount) {

}
