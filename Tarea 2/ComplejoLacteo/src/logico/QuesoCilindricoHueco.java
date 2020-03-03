package logico;

public class QuesoCilindricoHueco extends Queso{
	
	private float radioInterior;
	private float longitud;
	
	
	public QuesoCilindricoHueco(int id, float precioBase, float precioUnitario, float radio, float radioInterior, float longitud) {
		super(id, precioBase, precioUnitario, radio);
		this.radioInterior=radioInterior;
		this.longitud=longitud;
	}


	public float getRadioInterior() {
		return radioInterior;
	}


	public void setRadioInterior(float radioInterior) {
		this.radioInterior = radioInterior;
	}


	public float getLongitud() {
		return longitud;
	}


	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	
	
	
}
