package cardata;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		Car c4=new Car();
		Car c5=new Car();
		
		Driver d=new Driver();
		Driver d1=new Driver();
		Driver d2=new Driver();
		Driver d3=new Driver();
		Driver d4=new Driver();
		Driver d5=new Driver();
				
		d.setId(1);
		d.setName("praveen");
		
		d1.setId(2);
		d1.setName("kishore");
		
		d2.setId(3);
		d2.setName("srinivasa");
		
		d3.setId(4);
		d3.setName("rahul");
		
		d4.setId(5);
		d4.setName("keerthan");
		
		d5.setId(6);
		d5.setName("teja");
		
		c.setDriver(d);
		c1.setDriver(d1);
		c2.setDriver(d2);
		c3.setDriver(d3);
		c4.setDriver(d4);
		c5.setDriver(d5);
		
		c.carObjectCount=9;
		c.setcarNumber("TN35DK8337");
		c.setcarMaxSpeedLimit(100);
		c.setcarFuelCapacity(65);
		c.setstartTiming("9'clock");
		c.setheadLights(true);
		c.setfuelInTank(30);
		c.setfrom("Kamalapuram");
		c.setdestination("Ramapuram");
		c.setrunningSpeed(40);
		
		c1.carObjectCount=10;
		c1.setcarNumber("KL01CC50");
		c1.setcarMaxSpeedLimit(110);
		c1.setcarFuelCapacity(95);
		c1.setstartTiming("11'clock");
		c1.setheadLights(false);
		c1.setfuelInTank(50);
		c1.setfrom("Kamalapuram");
		c1.setdestination("Kadapa");
		c1.setrunningSpeed(40);
		
		c2.carObjectCount=9;
		c2.setcarNumber("MH01AE8017");
		c2.setcarMaxSpeedLimit(120);
		c2.setcarFuelCapacity(75);
		c2.setstartTiming("3'clock");
		c2.setheadLights(true);
		c2.setfuelInTank(20);
		c2.setfrom("Kadapa");
		c2.setdestination("Ramapuram");
		c2.setrunningSpeed(60);
		
		c3.carObjectCount=9;
		c3.setcarNumber("MH13BK7788");
		c3.setcarMaxSpeedLimit(90);
		c3.setcarFuelCapacity(65);
		c3.setstartTiming("5'clock");
		c3.setheadLights(true);
		c3.setfuelInTank(30);
		c3.setfrom("Hyderabad");
		c3.setdestination("Ramapuram");
		c3.setrunningSpeed(40);
		
		c4.carObjectCount=9;
		c4.setcarNumber("TN45BK9199");
		c4.setcarMaxSpeedLimit(105);
		c4.setcarFuelCapacity(65);
		c4.setstartTiming("7'clock");
		c4.setheadLights(true);
		c4.setfuelInTank(30);
		c4.setfrom("Ramapuram");
		c4.setdestination("Kurnool");
		c4.setrunningSpeed(65);
		
		c5.carObjectCount=9;
		c5.setcarNumber("KL65K7111");
		c5.setcarMaxSpeedLimit(100);
		c5.setcarFuelCapacity(65);
		c5.setstartTiming("10'clock");
		c5.setheadLights(true);
		c5.setfuelInTank(40);
		c5.setfrom("Ramapuram");
		c5.setdestination("Hyderabad");
		c5.setrunningSpeed(55);
		
		
		c.fillFuel(5);
		c.accelerator(5);
		c.isLightsOn();
		c.printCarStatus();
		
		
		
		c1.fillFuel(5);
		c1.accelerator(10);
		c1.isLightsOn();
		
		Car[] a=new Car[6];
		a[0]=c;
		a[1]=c1;
		a[2]=c2;
		a[3]=c3;
		a[4]=c4;
		a[5]=c5;
		
		Main l=new Main();
		
		l.findCars(a,"Kamalapuram");
		
		

	}

public static Car[] findCars(Car[] a,String destination)
{
	int c=0;
	String s="";
	for(int i=0;i<a.length;i++)
	{
		if(a[i].getfrom()=="Kadapa" && a[i].getdestination()=="Ramapuram")
		{
		s=a[i].getstartTiming()+" "+a[i].getcarNumber()+" ";
		c++;	
		}
	}
	if(c>=1)
	{
	System.out.println(s);
	}
	else
	{
		System.out.println("no cars are available");
	}
	
	return a;
}
	

}
