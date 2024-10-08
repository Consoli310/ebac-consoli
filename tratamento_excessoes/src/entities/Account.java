package entities;

import model.exceptions.DomainException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Double balance, Double withDrawLimit, Integer number, String holder) {
        this.balance = balance;
        this.withdrawLimit = withDrawLimit;
        this.number = number;
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) {
        if (amount > balance) {
            throw new DomainException("Withdraw error: Not enough balance");
        } else if (amount > withdrawLimit) {
            throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
        } else {
            balance -= amount;
        }
    }
}
