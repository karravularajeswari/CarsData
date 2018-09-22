package cardata;

import java.net.StandardSocketOptions;

public class Car {
	final static String manufactureCompany="Maruthi motors";
	static int carObjectCount;
	private String carNumber;
	private int carFuelCapacity;
	private int carMaxSpeedLimit;
	private int runningSpeed;
	private int fuelInTank;
	boolean headLights;
	private Driver driver;
	private String destination;
	private String from;
	private String startTiming;
	public void fillFuel(int fuel)
	{
		if(fuelInTank < carFuelCapacity)
		{
			fuelInTank=fuelInTank+fuel;
			System.out.println(fuelInTank);
		}
		 if(fuelInTank == carFuelCapacity)
		{
			System.out.println("tank is full");
		}
		else
		{
			System.out.println("not equal");
		}
	}
	
	public void accelerator(int speed)
	{
		if(runningSpeed < carMaxSpeedLimit)
		{
			runningSpeed=runningSpeed+speed;
			fuelInTank--;
			System.out.println(runningSpeed);
			System.out.println(	fuelInTank);
		}
		 if(runningSpeed > carMaxSpeedLimit)
		{
			System.out.println("100 is car max speed ");
		}
		else
		{
			System.out.println("running and maxspeed is not equal");
		}
	}
	public void isLightsOn()
	{
		if(headLights==true)
		{
			System.out.println("car lights on");
		}
		else
		{
		System.out.println("false");
		}
		
	}
	
	
	 public void setcarObjectCount(int carObjectCount)
	 {
		 this.carObjectCount=carObjectCount;
	 }
	 public int getcarObjectCount()
	 {
		 return carObjectCount;
	 }
	 public void setcarNumber(String carNumber)
	 {
		 this.carNumber=carNumber;
	 }
	 public String getcarNumber()
	 {
		 return carNumber;
	 }
	 public void setcarFuelCapacity(int carFuelCapacity)
	 {
		 this.carFuelCapacity=carFuelCapacity;
	 }
	 public int getcarFuelCapacity()
	 {
		 return carFuelCapacity;
	 }
	 public void setcarMaxSpeedLimit(int carMaxSpeedLimit)
	 {
		 this.carMaxSpeedLimit=carMaxSpeedLimit;
	 }
	 public int getcarMaxSpeedLimit()
	 {
		 return carMaxSpeedLimit;
	 }
	 public void setrunningSpeed(int runningSpeed)
	 {
		 this.runningSpeed=runningSpeed;
	 }
	 public int getrunningSpeed()
	 {
		 return runningSpeed;
	 }
	 public void setfuelInTank(int fuelInTank)
	 {
		 this.fuelInTank=fuelInTank;
	 }
	 public int getfuelInTank()
	 {
		 return fuelInTank;
	 }
	 public void setheadLights(boolean headLights)
	 {
		 this.headLights=headLights;
	 }
	 public boolean getheadLights()
	 {
		 return headLights;
	 }
	public void setdestination(String destination)
	{
		this.destination=destination;
	}
	 public String getdestination()
	 {
		 return destination;
	 }
	 public void setfrom(String from)
		{
			this.from=from;
		}
		 public String getfrom()
		 {
			 return from;
		 }
		 public void setstartTiming(String startTiming)
			{
				this.startTiming=startTiming;
			}
		 public String getstartTiming()
			{
				 return startTiming;
			}
	 public void setDriver(Driver driver)
	 {
		 this.driver=driver;
	 }
	 public Driver getDriver()
	 {
		 return driver;
	 }
	 public void  printCarStatus( )
		{
			System.out.println(carObjectCount+" "+carNumber+" "+carFuelCapacity+" "+carMaxSpeedLimit+" "+runningSpeed+" "+fuelInTank+" "+headLights+" "+destination+" "+from+" "+startTiming);
		}
}
