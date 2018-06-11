package by.htp.Taxi.run;

import by.htp.Taxi.SQL.SQL;
import by.htp.Taxi.entity.BaseOrder;
import by.htp.Taxi.entity.TransportPark;
import by.htp.Taxi.entity.TransportType;

public class MainMenu {
	TransportPark transportPark= new TransportPark();

	BaseOrder baseOrder =new BaseOrder();
	


	

public void mainMenu() {
	do {
		System.out.println();
		System.out.println(TransportType.values());
	System.out.println("Вас приведствует такси \"Кручу верчу довезти хочу!\"");
	System.out.println("Выбериту пункт меню:");
	System.out.println("1. Оформить заказ.");
	System.out.println("2. Вывести подходящие вариаты транспорта.");
	System.out.println("3. Отсортировать траспорт по времены доставки.");
	System.out.println("4. Отсортировать траспорт по стоимости заказа.");
	System.out.println("5. Добавить транспорт в автопарк такси.");
	System.out.println("6. Добавить рандомный транспорт в автопарк такси.");
	System.out.println("7. Вывести авто в парке.");
	System.out.println("8. Вывести все заказы.");
	System.out.println("9. Загрузка базы данных.");
	System.out.println("10. Выход из меню.");
	
	switch(Integer.parseInt(Scan.sc.nextLine())) {
	case 1:
		baseOrder.addOrder((CreatOrder.creatOrder(transportPark)));
	break;
	case 2:	
		Output.output(baseOrder.getBaseOrede()[baseOrder.getBaseOrede().length-1].getChooseTransport());
	break;
	case 3:
		Sort.sortTime(baseOrder.getBaseOrede()[0].getChooseTransport()); 
	break;	
	case 4: 
		Sort.sortPrice(baseOrder.getBaseOrede()[0].getChooseTransport());
				break;
	case 5:
		transportPark.addTranport(CreatTransport.creatTranport());
	
		break;
	case 6: 
		transportPark.addTranport(CreatTransport.creatRandTranport());
		
		break;
	case 7:
		Output.output(transportPark);
		break;
	case 8:
		Output.output(baseOrder);
		break;
	case 9:
		new SQL().sql();
		
	case 10:
		System.out.println("Вы уверены, что хотите выйти из меню? (y)");
		if( ("y").equals(Scan.sc.nextLine())) {
			System.exit(0);
			break;
		} 
		}
	}while(true);
	
	
	
}
	
	
}
