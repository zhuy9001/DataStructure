package weather;
/**   
* @Title: WeatherStation.java
* @Package weather
* @Description: TODO
* @author zhuy  
* @date 2017��2��23�� ����3:41:40
* @version V1.0   
*/
public class WeatherStation {
	public static void main(String[] args) {

        // ����WeatherData����
        WeatherData weatherData = new WeatherData();

        // ����Ŀǰ״�������
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        // ģ���µ��������
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
	}

}
