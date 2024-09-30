import java.util.List;

public interface Metodos {

	public String guardar(Autos auto);

	public List<Autos> mostrar();

	public Autos buscar(int indice);

	public void editar(int indice, Autos auto);

	public void eliminar(int indice);

}
