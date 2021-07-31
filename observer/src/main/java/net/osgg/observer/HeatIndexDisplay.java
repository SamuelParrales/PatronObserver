package net.osgg.observer;

import java.text.DecimalFormat;

public class HeatIndexDisplay implements Observer, DisplayElement {


	private double headIndex;
    private WeatherData weatherData;
	
	public HeatIndexDisplay(WeatherData weatherData)
	{
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		  headIndex =  16.923 + 1.85212 * Math.pow(10,-1) * temp + 5.37941 * humidity
				-1.00254 * Math.pow(10, -1) * temp * humidity + 9.41695 * Math.pow(10, -3)
				* Math.pow(temp,2) + 7.28898 * Math.pow(10,-3)* Math.pow(humidity, 2) + 
				3.45372 * Math.pow(10, -4) * Math.pow(temp, 2) * humidity - 8.14971 * Math.pow(10, -4)
				* temp * Math.pow(humidity, 2) + 1.02102 * Math.pow(10, -5) * Math.pow(temp, 2)
				* Math.pow(humidity, 2) - 3.8646 * Math.pow(10, -5) * Math.pow(temp, 3)
				+ 2.91583 * Math.pow(10, -5) * Math.pow(humidity, 3)+ 1.42721 *
				Math.pow(10, -6)* Math.pow(temp, 3) * humidity + 1.97483 * Math.pow(10, -7)
				* temp * Math.pow(humidity, 3) - 2.18429 * Math.pow(10, -8) * Math.pow(temp, 3)
				* Math.pow(humidity, 2) + 8.43296 * Math.pow(10, -10) * Math.pow(temp, 2) *
				Math.pow(humidity, 3) - 4.81975 * Math.pow(10, -11) * Math.pow(temp, 3)
				* Math.pow(humidity, 3);
		  display();
	}
	
	public void display() {
		DecimalFormat df = new DecimalFormat("#.000000");
		System.out.println("Heat index is = " + df.format(headIndex));
		// TODO Auto-generated method stub
		
	}

}
