package com.example.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Double daily_income;

    private Integer days;

    public Payment(){}

    public Payment(String name, Double daily_income, Integer days) {
        this.name = name;
        this.daily_income = daily_income;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDaily_income() {
        return daily_income;
    }

    public void setDaily_income(Double daily_income) {
        this.daily_income = daily_income;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

     public Double getTotal(){
        return days*daily_income;
     }


}
