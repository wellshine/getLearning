package beans;

public class Node {
	private int numid;//id
	private int temperature;//�¶�
	private float humidity;//ʪ��
//	private float concentration;//Ũ��
	private String date;//ʱ��
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getNumid() {
		return numid;
	}
	public void setNumid(int numid) {
		this.numid = numid;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
//	public float getConcentration() {
//		return concentration;
//	}
//	public void setConcentration(float concentration) {
//		this.concentration = concentration;
//	}
}
