package logico;

public class QuesoCilindrico extends Queso{
	
	private float longitud;

	public QuesoCilindrico(int id, float precioBase, float precioUnitario, float radio, float longitud) {
		super(id, precioBase, precioUnitario, radio);
		this.longitud=longitud;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	
	
	

	

}
