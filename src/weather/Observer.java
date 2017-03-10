package weather;
/**   
* @Title: Observer.java
* @Package weather
* @Description: TODO
* @author zhuy  
* @date 2017年2月23日 下午3:00:28
* @version V1.0   
*/
public interface Observer {

	
	public void update(float temp, float humidity, float pressure);
}
