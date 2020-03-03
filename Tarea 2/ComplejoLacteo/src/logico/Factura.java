package logico;

public class Factura {
	
	private int factura;
	private String unidadQueso;
	private int cantPorUnidad;
	
	
	public Factura(int factura, String unidadQueso, int cantPorUnidad) {
		super();
		this.factura = factura;
		this.unidadQueso = unidadQueso;
		this.cantPorUnidad = cantPorUnidad;
	}


	public int getFactura() {
		return factura;
	}


	public void setFactura(int factura) {
		this.factura = factura;
	}


	public String getUnidadQueso() {
		return unidadQueso;
	}


	public void setUnidadQueso(String unidadQueso) {
		this.unidadQueso = unidadQueso;
	}


	public int getCantPorUnidad() {
		return cantPorUnidad;
	}


	public void setCantPorUnidad(int cantPorUnidad) {
		this.cantPorUnidad = cantPorUnidad;
	}
	
	

}
