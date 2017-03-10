package weather;

import java.util.Observable;

/**   
* @Title: CurrentConditionsDisplay.java
* @Package weather
* @Description: TODO
* @author zhuy  
* @date 2017年2月23日 下午3:34:55
* @version V1.0   
*/
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	private Subject weatherData;
	
	private float temperature;
	private float humidity;
	
	

	public CurrentConditionsDisplay(Subject weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.registerObserver((weather.Observer) this);
	}

	@Override
	public void display() {
		 System.out.println("Cuttent conditions:" + temperature + "F degrees and " + humidity + "% humidity");

	}



	@Override
	public void update(float temp, float humidity, float pressure) {
		 this.temperature = temp;
	        this.humidity = humidity;
	        display();
		
	}

}
