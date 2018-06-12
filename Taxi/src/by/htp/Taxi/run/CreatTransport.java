package by.htp.Taxi.run;

import by.htp.Taxi.entity.Transport;
import by.htp.Taxi.entity.TransportType;

public class CreatTransport {

	public static Transport creatRandTranport() {
		Transport transport = new Transport();

		transport.setName("Transport" + ((int) (Math.random() * 100)));
		switch (((int) (Math.random() * 3 + 1))) {
		case 1:
			transport.setTransprtType(TransportType.AutoTransport);
			break;
		case 2:
			transport.setTransprtType(TransportType.RwTransport);
			break;
		case 3:
			transport.setTransprtType(TransportType.AirTransport);
			break;
		case 4:
			transport.setTransprtType(TransportType.SeaTransport);
			break;

		}

		transport.setSpeed(((int) (Math.random() * 200 + 50)));

		transport.setFuel(((int) (Math.random() * 60)));

		transport.setRate((Math.random() * 10));

		transport.setPriceKm((Math.random() * 3));

		System.out.println("Транспорт создан");
		return transport;

	}

	public static Transport creatTranport() {
		Transport transport = new Transport();
		System.out.println("Введите назвение транспорта:");
		transport.setName(Scan.sc.nextLine());
		System.out.println("Выберите тип транспорта");
		System.out.println("1. Автомобильный");
		System.out.println("2. Железнодорожный");
		System.out.println("3. Воздушиный");
		System.out.println("4. Морской");
		switch (Integer.parseInt(Scan.sc.nextLine())) {
		case 1:
			transport.setTransprtType(TransportType.AutoTransport);
			break;
		case 2:
			transport.setTransprtType(TransportType.RwTransport);
			break;
		case 3:
			transport.setTransprtType(TransportType.AirTransport);
			break;
		case 4:
			transport.setTransprtType(TransportType.SeaTransport);
			break;
		}
		System.out.println("Введите максимальную скорость транспорта, в км/ч:");
		transport.setSpeed((Integer.parseInt(Scan.sc.nextLine())));
		System.out.println("Введите объем топлива в баке транспорта, в л:");
		transport.setFuel(Integer.parseInt(Scan.sc.nextLine()));
		System.out.println("Введите расход топлива транспорта на 100км, в л:");
		transport.setRate(Double.parseDouble(Scan.sc.nextLine()));
		System.out.println("Введите стоимость 1 км, в бел. руб");
		transport.setPriceKm((Double.parseDouble(Scan.sc.nextLine())));
		return transport;

	}

}
