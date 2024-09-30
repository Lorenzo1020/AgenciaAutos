
public class Autos {
	private long serie;
	private String placa;
	private String marca;
	private String modelo;
	private float Precio;

	// Los tipos de datos primitivos si quieres que acepte valores nulos --- hay que
	// parsearlos --- ya en una condicion se utiliza(.equals)

	public Autos() {
	}

	public Autos(long serie, String placa, String marca, String modelo, float precio) {
		this.serie = serie;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		Precio = precio;
	}

	@Override
	public String toString() {
		return "Autos [serie=" + serie + ", placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", Precio="
				+ Precio + "]\n";
	}

	public long getSerie() {
		return serie;
	}

	public void setSerie(long serie) {
		this.serie = serie;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPrecio() {
		return Precio;
	}

	public void setPrecio(float precio) {
		Precio = precio;
	}

}
