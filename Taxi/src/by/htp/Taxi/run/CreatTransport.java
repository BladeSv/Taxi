package by.htp.Taxi.run;

import by.htp.Taxi.entity.Transport;
import by.htp.Taxi.entity.TransportType;

public class CreatTransport {
	private static Transport transport;
	
	
	public static Transport creatTranport() {
		transport=new Transport();
		System.out.println("Введите название транспорта:");
		transport.setName(Scan.sc.nextLine());
//		System.out.println("Выберите тип транспорта");
//		System.out.println("1. Автомобильный");
//		System.out.println("2. Железнодорожный");
//		System.out.println("3. Воздушный");
//		System.out.println("4. Водный");
//		switch(Integer.parseInt(Scan.sc.nextLine())) {
//		case 1:
//			TransportType transportType = TransportType.AirTransport;
//			break;
//		case 2:
//			TransportType transportType = TransportType.RwTransport;
//		break;
//		}
		System.out.println("Веедите максимальную скорость транспорта, в км/ч:");
		transport.setSpeed((Integer.parseInt(Scan.sc.nextLine())));
		System.out.println("Веедите объем топлива в транспорте, в л:");
		transport.setFuel(Integer.parseInt(Scan.sc.nextLine()));
		System.out.println("Веедите расход топлива в транспорте на 100км, в л:");
		transport.setRate(Double.parseDouble(Scan.sc.nextLine()));
		System.out.println("Веедите стоимость 1 км, в бел. руб:");
		transport.setPriceKm((Double.parseDouble(Scan.sc.nextLine())));		
		return transport;
		
		
	}
	
	
	
	
	
}
