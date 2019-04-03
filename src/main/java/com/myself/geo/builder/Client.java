package com.myself.geo.builder;

public class Client {
    public static void main(String[] args) {
        AirShipBuilder airBuilder = new SxtAirBuilder();

        AirShipDirector airShipDirector = new SxtAirShipDirector(airBuilder);
        AirShip airShip = airShipDirector.createAirShip();


    }
}
