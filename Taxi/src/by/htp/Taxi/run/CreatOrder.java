package by.htp.Taxi.run;

import by.htp.Taxi.entity.*;

public class CreatOrder {
	
private Client client;
private ChooseTransport chooseTransport;
private TransportPark transportPark;


public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
}
	 
public Order creatOrder (TransportPark transportPark) {
	
	Order order=new Order();
	
	chooseTransport = new ChooseTransport();
	order.setClient(AddClient.addClient());	
	chooseTransport.chooseTranport(client, transportPark.getTpark());
	order.setChooseTransport(chooseTransport);
	return order;
	
	
	
	
}




}
