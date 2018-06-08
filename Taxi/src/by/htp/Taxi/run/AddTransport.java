package by.htp.Taxi.run;

import by.htp.Taxi.entity.Transport;
import by.htp.Taxi.entity.TransportType;

public class AddTransport {
	private static Transport transport;
	private TransportType  transprtType;
	
	public static Transport addTranport() {
		
		System.out.println("Введите название транспорта:");
		transport.setName(Scan.sc.nextLine());
		System.out.println("Выберите тип транспорта");
		System.out.println("1. Автомобильный");
		System.out.println("2. Железнодорожный");
		System.out.println("3. Воздушный");
		System.out.println("4. Водный");
		switch(Integer.parseInt(Scan.sc.nextLine())) {
		case 1:
			transprtType= TransportType.AirTransport;
		
		}
		transprtType= TransportType[Integer.parseInt(Scan.sc.nextLine())]
		
		
		client.setDistance(Double.parseDouble(Scan.sc.nextLine()));
		System.out.println("Веедите сумму которой распологаете, в бел.руб.:");	
		client.setMoney(Double.parseDouble(Scan.sc.nextLine()));;	
			return transport;
		
		
	}
	
	
	
	
	
}
