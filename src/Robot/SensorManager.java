//Juan Pablo Carmona Muñoz

package Robot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.TreeSet;

public class SensorManager {
	
	private TreeSet<Sensores> sensor;
	
	public SensorManager() {
		this.sensor = new TreeSet<Sensores>();
	}

	public TreeSet<Sensores> getSensor() {
		return sensor;
	}

	public void setSensor(TreeSet<Sensores> sensor) {
		this.sensor = sensor;
	}

	public void readingSensores() {
		try {
			Scanner sc = new Scanner(new File("sensors.txt"));
			while(sc.hasNext()) {
				String line = sc.nextLine();
				Sensores p = splitRecord(line);
				p.sensorTipo();
				this.sensor.add(p);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private Sensores splitRecord(String line) {
		
		Scanner sc = new Scanner(line);
		sc.useDelimiter(",");
		String sensorld = sc.next();
		String type = sc.next();
		double value = sc.nextDouble();
		Sensores p = new Sensores(sensorld,type,value);
		/*
		if(type.equals("digital")) {
		double value = sc.nextDouble();
		p = new Sensores(sensorld,type,value);
		sc.close();
		}else if(type.equals("analog")) {
			double value = sc.nextDouble();
			p = new Sensores(sensorld,type,value);
			sc.close();
		}else if(type.equals("mixed")){
			String setup = sc.next().trim();
			double value = sc.nextDouble();
			p = new Sensores(sensorld,type,setup,value);
			sc.close();
		}
		*/
		sc.close();
		return p;
	}
	
	public void saveSensores() {
		PrintWriter writer;
		try {
			writer = new PrintWriter("output.txt", "UTF-8");
			for(Sensores p : this.getSensor()) {
				writer.println(p.toSave());
			}
			writer.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
