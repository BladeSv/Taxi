package by.htp.Taxi.run;

import by.htp.Taxi.entity.BaseOrder;
import by.htp.Taxi.entity.TransportPark;

public class MainMenu {
	TransportPark transportPark= new TransportPark();
	CreatTransport creatTransport =new CreatTransport();
	BaseOrder baseOrder =new BaseOrder();
	CreatOrder creatOrder =new CreatOrder();
	Sort sort =new Sort();

public void mainMenu() {
	do {
	System.out.println("��� ������������ ����� \"����� ����� ������� ����!\"");
	System.out.println("�������� ����� ����:");
	System.out.println("1. �������� �����.");
	System.out.println("2. ������� ���������� ������� ����������.");
	System.out.println("3. ������������� �������� �� ������� ��������.");
	System.out.println("4. ������������� �������� �� ��������� ������.");
	System.out.println("5. �������� ��������� � �������� �����.");
	System.out.println("6. ����� �� ����.");
	switch(Integer.parseInt(Scan.sc.nextLine())) {
	case 1:
		baseOrder.addOrder((creatOrder.creatOrder(transportPark)));
	break;
	case 2:	
		System.out.println(baseOrder.getBaseOrede()[0]);
	break;
	case 3:
		sort.sortTime(baseOrder.getBaseOrede()[0].getChooseTransport()); 
	break;	
	case 4: 
				sort.sortPrice(baseOrder.getBaseOrede()[0].getChooseTransport());
				break;
	case 5:
		transportPark.addTranport(creatTransport.creatTranport());
		break;
	case 6:
		System.out.println("�� �������, ��� ������ ����� �� ����? (y)");
		if( "y".equals(Scan.sc.hasNextLine())) {
			System.exit(0);
		} 
		}
	}while(true);
	
	
	
}
	
	
}
