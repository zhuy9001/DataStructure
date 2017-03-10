package weather;

import java.util.ArrayList;

/**
 * @Title: WeatherData.java
 * @Package weather
 * @Description: TODO
 * @author zhuy
 * @date 2017年2月23日 下午3:03:36
 * @version V1.0
 */
public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		if (o == null)
			return;
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}

	}

	@Override
	public void notifyObserver() {
		for (Observer o : observers) {
			o.update(temperature, humidity, pressure);
		}

	}

	public void measurementsChanged() {
		notifyObserver();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
