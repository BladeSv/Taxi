package by.htp.Taxi.run;

import java.util.Scanner;

import by.htp.Taxi.entity.Client;

public class AddClient {
	private static Client client;
	

	
	
public static Client addClient() {
	client =new Client();
System.out.println("Введите Ваше имя:");
client.setName(Scan.sc.nextLine());
System.out.println("Введите сколько киломметров до пункта назначения:");
client.setDistance(Double.parseDouble(Scan.sc.nextLine()));
System.out.println("Веедите сумму которой распологаете, в бел.руб.:");	
client.setMoney(Double.parseDouble(Scan.sc.nextLine()));;	
	return client;
}
	
	
}
