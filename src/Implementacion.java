import java.util.ArrayList;
import java.util.List;

public class Implementacion implements Metodos {

	private List<Autos> lista = new ArrayList<Autos>();

	// Validar --- serie, placa, modelo
	@Override
	public String guardar(Autos auto) {
		// TODO Auto-generated method stub

		// Obtner todos los registros de la lista
		// Ciclo
		// condicional
		// bandera
		String respuesta = "";
		boolean bandera = false;

		for (Autos a : lista) {
			// .equls .... para comparar cadenas
			// valores numericos --- ==, >=
			if (a.getSerie() == auto.getSerie()) {
				respuesta = "serieExiste";
				bandera = true;
				break;
			} else if (a.getPlaca().equals(auto.getPlaca())) {
				respuesta = "placaExiste";
				bandera = true;
				break;
			} else if (a.getModelo().equals(auto.getModelo())) {
				respuesta = "modeloExiste";
				bandera = true;
				break;
			}

		}

		if (bandera == false)
			lista.add(auto);

		return respuesta;
	}

	@Override
	public List<Autos> mostrar() {
		// TODO Auto-generated method stub
		List<Autos> listaNueva = new ArrayList<Autos>();
		listaNueva = lista;

		return listaNueva;
	}

	@Override
	public Autos buscar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	@Override
	public void editar(int indice, Autos auto) {
		// TODO Auto-generated method stub
		lista.set(indice, auto);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}

	public void indiceModelo() {
		System.out.println("Registros en la lista");
		for (int i = 0; i < lista.size(); i++) {
			System.out.printf("\n[%d]" + lista.get(i).getModelo(), i);
		}
	}

}
