package com.neophob.udp2i2c.model;

import java.util.List;

import com.pi4j.io.i2c.I2CBus;

public class I2cConfig {

	private final I2CBus i2cBus;
	private final List<Integer> i2cAddress;
	
	public I2cConfig(I2CBus i2cBus, List<Integer> i2cAddress) {
		this.i2cBus = i2cBus;
		this.i2cAddress = i2cAddress;
	}

	public I2CBus getI2cBus() {
		return i2cBus;
	}

	public List<Integer> getI2cAddress() {
		return i2cAddress;
	}
	

}
