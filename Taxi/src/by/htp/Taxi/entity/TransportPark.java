package by.htp.Taxi.entity;

import java.util.Arrays;

public class TransportPark {
	private Transport[] Tpark;
	private Transport[] temp;
	private String name;
	//private static int index =0;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Transport[] getTpark() {
		return Tpark;
	}

	public void setTpark(Transport[] tpark) {
		Tpark = tpark;
	}
	public void addTranport (Transport transport) {
		if (Tpark==null) {
			Tpark=new Transport[1];
			Tpark[0]=transport;
	
			
		}
		Transport[] temp =new Transport[Tpark.length+1];
		for(int i=0;i<(Tpark.length);i++) {
			temp[i]=Tpark[i];
			}
		temp[Tpark.length]=transport;
		
		Tpark=temp;
	}

	@Override
	public String toString() {
		return "TransportPark [Tpark=" + Arrays.toString(Tpark) + "]";
	}
	
//	{Tpark[0]=new Transport(); 
//	Tpark[0].setName("�����-929");; 
//	
//	
//	}
	
	
	
	
}
