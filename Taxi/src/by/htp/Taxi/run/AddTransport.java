package by.htp.Taxi.run;

import by.htp.Taxi.entity.Transport;
import by.htp.Taxi.entity.TransportType;

public class AddTransport {
	private static Transport transport;
	private TransportType  transprtType;
	
	public static Transport addTranport() {
		
		System.out.println("������� �������� ����������:");
		transport.setName(Scan.sc.nextLine());
		System.out.println("�������� ��� ����������");
		System.out.println("1. �������������");
		System.out.println("2. ���������������");
		System.out.println("3. ���������");
		System.out.println("4. ������");
		switch(Integer.parseInt(Scan.sc.nextLine())) {
		case 1:
			transprtType= TransportType.AirTransport;
		
		}
		transprtType= TransportType[Integer.parseInt(Scan.sc.nextLine())]
		
		
		client.setDistance(Double.parseDouble(Scan.sc.nextLine()));
		System.out.println("������� ����� ������� ������������, � ���.���.:");	
		client.setMoney(Double.parseDouble(Scan.sc.nextLine()));;	
			return transport;
		
		
	}
	
	
	
	
	
}
