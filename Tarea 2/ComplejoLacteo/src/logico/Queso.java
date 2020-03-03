package logico;

public class Queso {
	
	protected int id;
	protected float precioBase;
	protected float precioUnitario;
	protected float radio;
	
	
	public Queso(int id, float precioBase, float precioUnitario, float radio) {
		super();
		this.id = id;
		this.precioBase = precioBase;
		this.precioUnitario = precioUnitario;
		this.radio = radio;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public float getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}


	public float getPrecioUnitario() {
		return precioUnitario;
	}


	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


	public float getRadio() {
		return radio;
	}


	public void setRadio(float radio) {
		this.radio = radio;
	}
	
	
	

}
