//Juan Pablo Carmona Muñoz

package Robot;

public class Sensores {

	protected String sensorld;
	protected String type;
	protected double value;
	protected String status;
	protected String setup;
	
	public Sensores(String sensorld, String type, String setup,double value) {
		super();
		this.sensorld = sensorld;
		this.type = type;
		this.value = value;
		this.setup = setup;
	}
	
	public Sensores(String sensorld, String type,double value) {
		super();
		this.sensorld = sensorld;
		this.type = type;
		this.value = value;
	}
	
	public Sensores() {
		super();
	}
	
	public String getSensorld() {
		return sensorld;
	}
	public void setSensorld(String sensorld) {
		this.sensorld = sensorld;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getSetup() {
		return setup;
	}

	public void setSetup(String setup) {
		this.setup = setup;
	}

	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Sensores [sensorld=" + sensorld + ", type=" + type + ", value=" + value + ", status=" + status + "]";
	}

	public void sensorTipo() {
		double va = this.value;
		
		if(this.type.equals("digital")) {
			if(va==1)
				status="yes";
			if(va==0)
				status="no";
		}
		
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
	
	public String toSave() {
		return this.getSensorld() + "\t" + this.status;
	}
}
