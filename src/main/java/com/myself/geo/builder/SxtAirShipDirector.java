package com.myself.geo.builder;

public class SxtAirShipDirector implements AirShipDirector {

    private AirShipBuilder airShipBuilder;
    public SxtAirShipDirector(AirShipBuilder airShipBuilder){
        this.airShipBuilder = airShipBuilder;
    }
    @Override
    public AirShip createAirShip() {
        AirShip airShip = new AirShip();
        airShip.setEngine(airShipBuilder.createEngin());
        airShip.setEscapeTower(airShipBuilder.createEscapeTower());
        airShip.setOrbitalModule(airShipBuilder.createOrbitalModule());
        return airShip;
    }
}
