package by.htp.Taxi.run;

import by.htp.Taxi.entity.BaseOrder;
import by.htp.Taxi.entity.Transport;
import by.htp.Taxi.entity.TransportPark;

public class Output {
	
	public static void output(TransportPark transport) {
		
			System.out.println(transport.getName());
			for(Transport tr: transport.getTpark()) {
				System.out.println(tr);
			}
			
		}
	public static void output(ChooseTransport transport) {
		System.out.println("���������� ������������ ��������");
		for(int i=0;i<transport.getChooseTpark().length;i++) {
			System.out.println(transport.getChooseTpark()[i]+"����� �������="+String.format("%.3f",( transport.getTime()[i]*60))+"���., ��������� ������:"+String.format("%.3f",transport.getPrice()[i])+"���.���");
		}
			
		}
		
	public static void output(BaseOrder transport) {
		
		
		System.out.println("���������� ������������ ��������");
		for(int i=0;i<transport.getBaseOrede().length;i++) {
			System.out.println(transport.getBaseOrede()[i].getClient());
			for(int j=0;j<transport.getBaseOrede()[i].getChooseTransport().getChooseTpark().length;j++)
			
			System.out.println(transport.getBaseOrede()[i].getChooseTransport().getChooseTpark()[j]+"����� �������="+String.format("%.3f",( transport.getBaseOrede()[i].getChooseTransport().getTime()[j]*60))+"���., ��������� ������:"+String.format("%.3f",transport.getBaseOrede()[i].getChooseTransport().getPrice()[j])+"���.���");
		}
			
		}
		
		
		
		
		
		
	}	
	

