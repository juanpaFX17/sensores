package Robot;

public class mixed extends Sensores{
	
	public mixed(String sensorld, String type,  String setup, double value) {
		super(sensorld,type,setup,value);
	}
	
	public void tipoSensor() {
		String sen = this.sensorld;
		double va = this.value;
		String sta = this.status;
		
		if(this.type.equals("mixed") && this.setup.equals("digital")) {
			if(va==1)
				status="yes";
			if(va==0)
				status="no";
		}
		
		if(this.type.equals("mixed") && this.setup.equals("analog")) {
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
