package weather;
/**   
* @Title: Subject.java
* @Package weather
* @Description: TODO
* @author zhuy  
* @date 2017年2月23日 下午2:59:42
* @version V1.0   
*/
public interface Subject {

	public void registerObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notifyObserver();
}
