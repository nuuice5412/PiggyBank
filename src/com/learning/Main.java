package com.learning;

public class Main {
    public static void main(String[] args) {
        PiggyBank bank = new PiggyBank("น้องพอใจ");

        bank.showMoney();

        bank.addMoney(40);
        bank.addMoney(80);
        bank.addMoney(120);

        bank.showMoney();
    }
}
