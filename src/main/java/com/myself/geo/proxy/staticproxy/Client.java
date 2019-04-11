package com.myself.geo.proxy.staticproxy;

public class Client {

    public static void main(String[] args) {
        Star real = new RealStar();
        ProxyStar proxyStar = new ProxyStar(real);
        proxyStar.confer();
        proxyStar.singContract();
        proxyStar.bookTicket();
        proxyStar.sign();
        proxyStar.collecMoney();
    }
}
