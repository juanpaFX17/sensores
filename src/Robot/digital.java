package Robot;

public class digital extends Sensores{

	public digital(String sensorld, String type, double value) {
		super(sensorld,type,value);
	}

	public void tipoSensor() {
		String sen = this.sensorld;
		double va = this.value;
		String sta = this.status;
		
		if(this.type.equals("digital")) {
			if(va==1)
				status="yes";
			if(va==0)
				status="no";
		}
	}
	
}
