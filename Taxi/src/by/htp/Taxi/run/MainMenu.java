package by.htp.Taxi.run;

import by.htp.Taxi.SQL.SQL;
import by.htp.Taxi.entity.BaseOrder;
import by.htp.Taxi.entity.TransportPark;
import by.htp.Taxi.entity.TransportType;

public class MainMenu {
	TransportPark transportPark = new TransportPark();

	BaseOrder baseOrder = new BaseOrder();
	SQL sql = new SQL();

	public void mainMenu() {
		do {
			System.out.println();

			System.out.println("Здавствуйте Вас приведствует такси\"Кручу-верчу довезти хочу\"");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("Выберите пункт меню:");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("1. Оформить Заказ.");
			System.out.println("2. Вывести подходящий транспорт.");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("3. Отсортировать подходящий транспотр по времени доставки.");
			System.out.println("4. Отсортировать подходящий транспотр по стоимости поездки.");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("5. Добавить транспорт в автопарк.");
			System.out.println("6. Добавить рандомный транспорт в автопарк..");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("7. Вывести весь транспорт в автопарке.");
			System.out.println("8. Вывести весе Заказы.");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("9. Загрузить транспорт из базы в автопарк.");
			System.out.println("10. Сохранить в базе транспорт из автопарка.");
			System.out.println("11. Удалить последний транспорт в базе.");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("12. Выйти из меню.");

			switch (Integer.parseInt(Scan.sc.nextLine())) {
			case 1:
				baseOrder.addOrder((CreatOrder.creatOrder(transportPark)));
				break;
			case 2:
				Output.output(baseOrder.getBaseOrede()[baseOrder.getBaseOrede().length - 1].getChooseTransport());
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
				sql.sqlRead(transportPark);
				break;
			case 10:
				sql.sqlWrite(transportPark);
				break;
			case 11:
				sql.sqldel();
				break;

			case 12:
				System.out.println("Вы уверены, что хотите выйти из меню? (y)");
				if (("y").equals(Scan.sc.nextLine())) {
					System.exit(0);
					break;
				}
			}
		} while (true);

	}

}
