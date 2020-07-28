package com.myjava.ocp.lab16.exchange;

public class ExchangeClient {
    public static void main(String[] args) {
        System.out.printf("NTD $%.2f\n", new ExchangeService().totalBalance());
    }
}
