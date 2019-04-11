package com.myself.geo.proxy.staticproxy;

public class ProxyStar implements Star {
    private Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("proxy confer");
    }

    @Override
    public void singContract() {
        System.out.println("proxy singContract");
    }

    @Override
    public void bookTicket() {
        System.out.println("proxy bookTicket");
    }

    @Override
    public void sign() {
        star.sign();
    }

    @Override
    public void collecMoney() {
        System.out.println("proxy confer");
    }
}
