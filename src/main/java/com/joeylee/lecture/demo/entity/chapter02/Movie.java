package com.joeylee.lecture.demo.entity.chapter02;

import java.time.Duration;

public class Movie {
    private String title;
    private Duration runngingTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runngingTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runngingTime = runngingTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
