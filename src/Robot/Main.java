package Robot;

public class Main {

	public static void main(String[] args) {
		SensorManager pr = new SensorManager();
		pr.readingSensores();
		pr.saveSensores();
	}	 
}
