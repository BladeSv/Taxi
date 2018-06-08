package by.htp.Taxi.entity;

public class BaseOrder {
private Order[] baseOrede;
private int index=0;

public Order[] getBaseOrede() {
	return baseOrede;
}


public void setBaseOrede(Order[] baseOrede) {
	this.baseOrede = baseOrede;
}

public void addOrder (Order order) {
	Order[] temp =new Order[index+1];
	for(int i=0;i<index;i++) {
		temp[i]=baseOrede[i];
		baseOrede=temp;
		index++;
		}
}
}
