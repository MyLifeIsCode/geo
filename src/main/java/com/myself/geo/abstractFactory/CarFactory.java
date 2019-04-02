package com.myself.geo.abstractFactory;

public interface CarFactory {
	Engine createEngine();
	Seat createSeat();
	Tyre createTyre();
}

