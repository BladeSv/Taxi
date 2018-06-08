package by.htp.Taxi.run;

import by.htp.Taxi.entity.*;

public class AddOrder {
	
private Client client;


public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
}
	 
public Order addOrder() {
	

	client=AddClient.addClient();
	
}




}
