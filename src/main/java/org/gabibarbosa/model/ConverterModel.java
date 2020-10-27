package org.gabibarbosa.model;

public class ConverterModel {
	private double usd;
	private double brl;
	
	public ConverterModel() {
	}
	
	public ConverterModel(double usd, double brl) {
		this.usd = usd;
		this.brl = brl;
	}

	public double getUsd() {
		return usd;
	}

	public void setUsd(double usd) {
		this.usd = usd;
	}

	public double getBrl() {
		return brl;
	}

	public void setBrl(double brl) {
		this.brl = brl;
	}

}
