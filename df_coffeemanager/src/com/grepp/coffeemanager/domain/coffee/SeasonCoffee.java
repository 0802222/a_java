package com.grepp.coffeemanager.domain.coffee;

import java.time.LocalDate;
import java.time.Month;

public class SeasonCoffee extends Coffee {
    private Month[] season;

    // 🔹 Month 하나가 아니라 여러 개 받을 수 있도록 변경
    public SeasonCoffee(String name, int price, int purchasePrice, int stock, int safetyStock, Month[] season) {
        super(name, price, purchasePrice, stock, safetyStock);
        this.season = season; // 🔹 배열 그대로 저장
    }

    public boolean notSeason() {
        Month now = LocalDate.now().getMonth();
        for (Month month : season) {
            if (month.equals(now)) return false;
        }
        return true;
    }
}