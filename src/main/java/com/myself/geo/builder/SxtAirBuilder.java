package com.myself.geo.builder;

public class SxtAirBuilder implements AirShipBuilder {
    public Engine createEngin(){
        System.out.println("创建发动机");
        return new Engine();
    }

    public EscapeTower createEscapeTower(){
        System.out.println("创建逃离仓");
        return new EscapeTower();
    }

    public OrbitalModule createOrbitalModule(){
        System.out.println("创建轨道");
        return new OrbitalModule();
    }
}
