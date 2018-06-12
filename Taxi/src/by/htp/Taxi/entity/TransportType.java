package by.htp.Taxi.entity;

public enum TransportType {
	AutoTransport("Автомобильный"), RwTransport("Железнодорожный"), AirTransport("Воздушный"), SeaTransport("Морской");

	private String type;

	TransportType(String type) {
		this.type = type;

	}

	public String getType() {
		return type;
	}

}