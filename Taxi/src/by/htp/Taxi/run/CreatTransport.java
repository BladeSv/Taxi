package by.htp.Taxi.run;

import by.htp.Taxi.entity.Transport;
import by.htp.Taxi.entity.TransportType;

public class CreatTransport {
	private static Transport transport;
	
	
	public static Transport creatRandTranport() {
		transport=new Transport();
		//System.out.println("������� �������� ����������:");
		transport.setName("Transport"+((int)(Math.random()*100)));
//		System.out.println("�������� ��� ����������");
//		System.out.println("1. �������������");
//		System.out.println("2. ���������������");
//		System.out.println("3. ���������");
//		System.out.println("4. ������");
//		switch(Integer.parseInt(Scan.sc.nextLine())) {
//		case 1:
//			TransportType transportType = TransportType.AirTransport;
//			break;
//		case 2:
//			TransportType transportType = TransportType.RwTransport;
//		break;
//		}
		//System.out.println("������� ������������ �������� ����������, � ��/�:");
		transport.setSpeed(((int)(Math.random()*200+50)));
		//System.out.println("������� ����� ������� � ����������, � �:");
		transport.setFuel(((int)(Math.random()*60)));
		//System.out.println("������� ������ ������� � ���������� �� 100��, � �:");
		transport.setRate((Math.random()*10));
		//System.out.println("������� ��������� 1 ��, � ���. ���:");
		transport.setPriceKm((Math.random()*3));	
		//System.out.println("������� ������ ������� � ���������� �� 100��, � �:");
		System.out.println("���� ������");
		return transport;
		
		
	}
	
	public static Transport creatTranport() {
		transport=new Transport();
		//System.out.println("������� �������� ����������:");
		transport.setName(Scan.sc.nextLine());
//		System.out.println("�������� ��� ����������");
//		System.out.println("1. �������������");
//		System.out.println("2. ���������������");
//		System.out.println("3. ���������");
//		System.out.println("4. ������");
//		switch(Integer.parseInt(Scan.sc.nextLine())) {
//		case 1:
//			TransportType transportType = TransportType.AirTransport;
//			break;
//		case 2:
//			TransportType transportType = TransportType.RwTransport;
//		break;
//		}
		System.out.println("������� ������������ �������� ����������, � ��/�:");
		transport.setSpeed((Integer.parseInt(Scan.sc.nextLine())));
		System.out.println("������� ����� ������� � ����������, � �:");
		transport.setFuel(Integer.parseInt(Scan.sc.nextLine()));
		System.out.println("������� ������ ������� � ���������� �� 100��, � �:");
		transport.setRate(Double.parseDouble(Scan.sc.nextLine()));
		System.out.println("������� ��������� 1 ��, � ���. ���:");
		transport.setPriceKm((Double.parseDouble(Scan.sc.nextLine())));		
		return transport;
		
		
	}
	
	
	
}
