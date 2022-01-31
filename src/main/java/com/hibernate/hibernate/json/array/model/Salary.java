package com.hibernate.hibernate.json.array.model;

import java.util.Objects;

public class Salary {

    private Long amount;

    private String currency;

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(amount + currency);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
