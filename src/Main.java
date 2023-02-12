import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static ArrayList<Coche> listaCoches = new ArrayList<Coche>();
  static Scanner entrada = new Scanner(System.in);

  public static void main(String[] args) {
    int opcion = 0;
    CocheDAO cocheDAO = new CocheDAOImpl();

    while (opcion != 6) {
      System.out.println("Menú");
      System.out.println("1. Añadir nuevo coche");
      System.out.println("2. Borrar coche por ID");
      System.out.println("3. Consultar coche por ID");
      System.out.println("4. Modificar coche por ID");
      System.out.println("5. Listado de coches");
      System.out.println("6. Gestionar pasajeros");
      System.out.println("7. Terminar el programa");
      System.out.print("Introduce una opción: ");
      opcion = entrada.nextInt();

      switch (opcion) {
        case 1:
        	Coche nuevoCoche = new Coche(opcion, null, null);
          	System.out.print("Introduce la marca: ");
          	nuevoCoche.setMarca(entrada.next());
          	System.out.print("Introduce el modelo: ");
          	nuevoCoche.setModelo(entrada.next());
          	cocheDAO.insertar(nuevoCoche);
          	break;
        case 2:
        	System.out.print("Introduce el ID del coche a borrar: ");
          	int id = entrada.nextInt();
          	cocheDAO.borrar(id);
          	break;
        case 3:
        	System.out.print("Introduce el ID del coche a consultar: ");
          	id = entrada.nextInt();
          	Coche coche = cocheDAO.consultar(id);
          	System.out.println("Marca: " + coche.getMarca());
          	System.out.println("Modelo: " + coche.getModelo());
          	break;
        case 4:
        	System.out.print("Introduce el ID del coche a modificar: ");
        	id = entrada.nextInt();
        	Coche cocheAModificar = cocheDAO.consultar(id);
        	System.out.print("Introduce la nueva marca: ");
        	cocheAModificar.setMarca(entrada.next());
        	System.out.print("Introduce el nuevo modelo: ");
        	cocheAModificar.setModelo(entrada.next());
        	cocheDAO.modificar(cocheAModificar);
        	break;
        case 5:
        	ArrayList<Coche> listaCoches = cocheDAO.listar();
        	System.out.println("Listado de coches:");
        	for (Coche c : listaCoches) {
        	  System.out.println("ID: " + c.getId() + ", Marca: " + c.getMarca() + ", Modelo: " + c.getModelo());
        	}
        	break;
        case 6:
        	  System.out.println("Gestión de pasajeros");
        	  System.out.println("1. Añadir nuevo pasajero");
        	  System.out.println("2. Borrar pasajero por id");
        	  System.out.println("3. Consulta pasajero por id");
        	  System.out.println("4. Listar todos los pasajeros");
        	  System.out.println("5. Añadir pasajero a coche");
        	  System.out.println("6. Eliminar pasajero de un coche");
        	  System.out.println("7. Listar todos los pasajeros de un coche");
        	  System.out.println("8. Volver al menú principal");
        	  System.out.print("Introduzca una opción: ");

        	  int opcionPasajeros = entrada.nextInt();
        	  entrada.nextLine();

        	  switch (opcionPasajeros) {
        	  case 1:
                  PasajeroDAOImpl.addPasajero(crearPasajero());
                  break;
              case 2:
                  System.out.print("Ingresa el ID del pasajero a borrar: ");
                  int id = Integer.parseInt(input.readLine().trim());
                  pasajeroDAO.deletePasajero(id);
                  break;
              case 3:
                  System.out.print("Ingresa el ID del pasajero a consultar: ");
                  id = Integer.parseInt(input.readLine().trim());
                  Pasajero pasajero = pasajeroDAO.getPasajeroById(id);
                  System.out.println(pasajero);
                  break;
              case 4:
                  List<Pasajero> pasajeros = pasajeroDAO.getAllPasajeros();
                  for (Pasajero p : pasajeros) {
                      System.out.println(p);
                  }
                  break;
              case 5:
                  System.out.print("Ingresa el ID del pasajero: ");
                  int idPasajero = Integer.parseInt(input.readLine().trim());
                  System.out.print("Ingresa el ID del coche: ");
                  int idCoche = Integer.parseInt(input.readLine().trim());
                  pasajeroDAO.addPasajeroToCoche(idPasajero, idCoche);
                  break;
        	    case 6:
        	      // Eliminar pasajero de un coche
        	      break;
        	    case 7:
        	      // Listar todos los pasajeros de un coche
        	      break;
        	    case 8:
        	      // Volver al menú principal
        	      break;
        	    default:
        	      System.out.println("Opción inválida");
        	      break;
        	  }
        	  break;       

        case 7:
            System.out.println("Programa terminado");
            break;
            default:
            System.out.println("Opción inválida");
          break;
      }
    }
  }

private static Pasajero crearPasajero() {
	// TODO Auto-generated method stub
	return null;
}
}