package by.htp.Taxi.run;

import by.htp.Taxi.entity.Transport;
import by.htp.Taxi.entity.TransportType;

public class CreatTransport {
	private static Transport transport;
	private static TransportType tranType;
	
	public static Transport creatRandTranport() {
		transport=new Transport();
	
		transport.setName("Transport"+((int)(Math.random()*100)));

		transport.setSpeed(((int)(Math.random()*200+50)));
		
		transport.setFuel(((int)(Math.random()*60)));
	
		transport.setRate((Math.random()*10));
		
		transport.setPriceKm((Math.random()*3));	
		
		System.out.println("авто создан");
		return transport;
		
		
	}
	
	public static Transport creatTranport() {
		transport=new Transport();
		System.out.println("Введите название транспорта:");
		transport.setName(Scan.sc.nextLine());
		System.out.println("Выберите тип транспорта");
		System.out.println("1. Автомобильный");
		System.out.println("2. Железнодорожный");
		System.out.println("3. Воздушный");
		System.out.println("4. Водный");
		switch(Integer.parseInt(Scan.sc.nextLine())) {
		case 1:
			transport.setTransprtType(TransportType.AirTransport); 
			break;
		case 2:
			transport.setTransprtType(TransportType.RwTransport);
		break;
		case 3:
			transport.setTransprtType(TransportType.RwTransport);
			System.out.println(TransportType.values());
		
		}
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
