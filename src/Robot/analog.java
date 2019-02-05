package Robot;

public class analog extends Sensores{

	public analog(String sensorld, String type, double value) {
		super(sensorld,type,value);
	}
	
	public void tipoSensor() {
		String sen = this.sensorld;
		double va = this.value;
		String sta = this.status;
		
		if(this.type.equals("analog")) {
			if(va>=0 && va<2)
				this.status="weak";
			if(va>=2 && va<3.5)
				status="medium";
			if(va>=2 && va<3.5)
				this.status="medium";
			if(va>=3.5 && va<=5)
				this.status="strong";
		}
	}
}
