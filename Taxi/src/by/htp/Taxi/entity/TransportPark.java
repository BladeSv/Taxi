package by.htp.Taxi.entity;

public class TransportPark {
	private Transport[] Tpark;
	private Transport[] temp;
	private String name;
	private static int index =0;

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
		if (index==0) {
			Tpark=new Transport[1];
			Tpark[0]=transport;
			index++;
			
		}
		Transport[] temp =new Transport[index+1];
		for(int i=0;i<index;i++) {
			temp[i]=Tpark[i];
			}
		temp[(index)]=transport;
		index++;
		Tpark=temp;
	}
	
//	{Tpark[0]=new Transport(); 
//	Tpark[0].setName("Мазда-929");; 
//	
//	
//	}
	
	
	
	
}
