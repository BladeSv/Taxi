package by.htp.Taxi.entity;

public class Transport extends TransportPark {

	private int speed;
	private int fuel;
	private double rate;
	private double priceKm;
	private TransportType transType;
	public TransportType getTransType() {
		return transType;
	}

	public void setTransType(TransportType transType) {
		this.transType = transType;
	}

	public double getPriceKm() {
		return priceKm;
	}

	public void setPriceKm(double priceKm) {
		this.priceKm = priceKm;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	private TransportType  transprtType;

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public TransportType getTransprtType() {
		return transprtType;
	}

	public void setTransprtType(TransportType transprtType) {
		this.transprtType = transprtType;
	}

	@Override
	public String toString() {
		return this.getName()+": Скорость=" + speed + "км.ч, Обеъем топлива=" + fuel + "л, Расход топлива на 100км.=" + String.format("%.3f",rate) + "л, Стоимость 1-го км=" + String.format("%.3f",priceKm) + "бел.руб.";
	}
	
}
