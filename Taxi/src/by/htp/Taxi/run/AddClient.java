package by.htp.Taxi.run;

import java.util.Scanner;

import by.htp.Taxi.entity.Client;

public class AddClient {
	private static Client client;

	public static Client addClient() {
		client = new Client();
		System.out.println("Введите ваше имя:");
		client.setName(Scan.sc.nextLine());
		System.out.println("Введите растояние до вашего пункта назначения, в км:");
		client.setDistance(Double.parseDouble(Scan.sc.nextLine()));
		System.out.println("Введи сумму денег которой распологаете, в бел.руб.:");
		client.setMoney(Double.parseDouble(Scan.sc.nextLine()));
		;
		return client;
	}

}
