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
	System.out.println("Вас приведствует такси \"Кручу верчу довезти хочу!\"");
	System.out.println("Выбериту пункт меню:");
	System.out.println("1. Оформить заказ.");
	System.out.println("2. Вывести подходящие вариаты транспорта.");
	System.out.println("3. Отсортировать траспорт по времены доставки.");
	System.out.println("4. Отсортировать траспорт по стоимости заказа.");
	System.out.println("5. Добавить транспорт в автопарк такси.");
	System.out.println("6. Выход из меню.");
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
		System.out.println("Вы уверены, что хотите выйти из меню? (y)");
		if( "y".equals(Scan.sc.hasNextLine())) {
			System.exit(0);
		} 
		}
	}while(true);
	
	
	
}
	
	
}
