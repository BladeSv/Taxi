package by.htp.Taxi.run;

import java.util.Arrays;

import by.htp.Taxi.entity.Client;
import by.htp.Taxi.entity.Transport;

public class ChooseTransport {
	private Client client;
	private Transport[] chooseTpark;
	private Transport[] temp;
	private double[] time=new double[1];
	
	public Transport[] getChooseTpark() {
		return chooseTpark;
	}
	public void setChooseTpark(Transport[] chooseTpark) {
		this.chooseTpark = chooseTpark;
	}
	public double[] getTime() {
		return time;
	}
	public void setTime(double[] time) {
		this.time = time;
	}
	public double[] getPrice() {
		return price;
	}
	public void setPrice(double[] price) {
		this.price = price;
	}
	private double[] price=new double[1];
	
	
	public void chooseTranport( Client client, Transport[] Tpark){
		int index=0;
	
		for (int i=0; i<Tpark.length;i++ ) {
		double km=Tpark[i].getFuel()/Tpark[i].getRate();
		 time[i]= client.getDistance()/Tpark[i].getSpeed();
		 price[i]=client.getDistance()/Tpark[i].getPriceKm();
		if(km>=client.getDistance()){
			if(client.getMoney()>=price[i]) {
			addChooseTransport(Tpark[i], index);	
			addTime(time[i], index);
			addPrice( price[i], index);
				index++;
			}
		}		
							
		}	
		
		}
		private void addChooseTransport (Transport transport, int index) {
			Transport[] temp =new Transport[index+1];
			for(int i=0;i<index;i++) {
				temp[i]=chooseTpark[i];
				}
			temp[(index+1)]=transport;
		
			chooseTpark=temp;
	}
		private void addTime (double times, int index) {
			double[]  temp =new double[index+1];
			for(int i=0;i<index;i++) {
				temp[i]=time[i];
				}
			temp[(index+1)]=times;
		
			time=temp;
		}
		private void addPrice (double prices, int index) {
			double[]  temp =new double[index+1];
			for(int i=0;i<index;i++) {
				temp[i]=time[i];
				}
			temp[(index+1)]=prices;
		
			time=temp;
		}
		@Override
		public String toString() {
			return "ChooseTransport [client=" + client + ", chooseTpark=" + Arrays.toString(chooseTpark) + ", temp="
					+ Arrays.toString(temp) + ", time=" + Arrays.toString(time) + ", price=" + Arrays.toString(price)
					+ "]";
		}
	
	
}
