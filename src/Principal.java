import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar las variables
		Scanner lectura = null;

		long serie;
		String placa;
		String marca;
		String modelo;
		float precio;

		Autos auto = null;

		int menuPric, subMenu, indice;

		// Instancia de clase
		Implementacion imp = new Implementacion();

		do {
			System.out.println("MENU AGENCIA");
			System.out.println("1---ALTA");
			System.out.println("2---MOSTRAR");
			System.out.println("3---BUSCAR");
			System.out.println("4---EDITAR");
			System.out.println("5---ELIMINAR");

			System.out.println("6---BUSCAR POR MODELO"); //ES UN VALOR UNICO
			System.out.println("7---BUSCAR POR MARCA"); //ME TRAE VARIOS REGISTROS
			System.out.println("8---CALCULAR EL DINERO INVERTIDO");
			System.out.println("9----ELIMINAR POR MODELO");
			System.out.println("10---SALIR");
			
			lectura = new Scanner(System.in);
			menuPric = lectura.nextInt();

			switch (menuPric) {
			case 1:

				System.out.println("Ingresa el numero de serie");
				lectura = new Scanner(System.in);
				serie = lectura.nextLong();

				System.out.println("Ingrese la placa");
				lectura = new Scanner(System.in);
				placa = lectura.nextLine();

				System.out.println("Ingrese la marca");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();

				System.out.println("Ingrese el modelo");
				lectura = new Scanner(System.in);
				modelo = lectura.nextLine();

				System.out.println("Ingrese el precio");
				lectura = new Scanner(System.in);
				precio = lectura.nextFloat();

				// Crear el objeto
				auto = new Autos(serie, placa, marca, modelo, precio);

				// Guardar
				String response = imp.guardar(auto);
				if (response.equals("serieExiste"))
					System.out.println("No se guardo, serie ya existe");
				else if (response.equals("placaExiste"))
					System.out.println("No se guardo, placa ya existe");
				else if (response.equals("modeloExiste"))
					System.out.println("No se guardo, modelo ya existe");
				else {
					System.out.println("Se guardo correctamente");
				}

				break;
			case 2:
				System.out.println(imp.mostrar());
				break;
			case 3:
				// Mostrar el indice y el modelo del auto
				imp.indiceModelo();

				System.out.println("\nIngrese el indice a buscar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();

				// Buscar
				auto = imp.buscar(indice);
				System.out.println("Se encontro " + auto);
				break;
			case 4:
				imp.indiceModelo();

				System.out.println("\nIngrese el indice a editar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();

				// Buscar
				auto = imp.buscar(indice);
				System.out.println("Se encontro " + auto);

				do {
					System.out.println("SUBMENU PARA EDITAR");
					System.out.println("1---MARCA");
					System.out.println("2---PRECIO");
					System.out.println("3---R.M.P.");
					lectura = new Scanner(System.in);
					subMenu = lectura.nextInt();

					switch (subMenu) {
					case 1:
						System.out.println("Ingrese la nueva marca");
						lectura = new Scanner(System.in);
						marca = lectura.nextLine();

						// Actualizacion
						auto.setMarca(marca);
						imp.editar(indice, auto);
						System.out.println("Se edico con exito");
						break;
					case 2:
						System.out.println("Ingrese el nuevo precio");
						lectura = new Scanner(System.in);
						precio = lectura.nextFloat();

						// Actualizacion
						auto.setPrecio(precio);
						imp.editar(indice, auto);
						System.out.println("Se edito bien");
						break;
					case 3:
						break;
					}

				} while (subMenu < 3);
				break;
			case 5:
				imp.indiceModelo();

				System.out.println("\nIngrese el indice a eliminar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();

				// Eliminacion
				imp.eliminar(indice);
				System.out.println("Se elimino");
				break;
			case 6:
				
				break;
			}

		} while (menuPric < 10);

	}

}
