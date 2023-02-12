import java.util.ArrayList;

public class CocheDAOImpl implements CocheDAO {
	ArrayList<Coche> listaCoches = new ArrayList<Coche>();
	int contadorId = 1;

	@Override
	public void insertar(Coche coche) {
		coche.setId(contadorId);
		listaCoches.add(coche);
		contadorId++;
	}

	@Override
	public void borrar(int id) {
		for (Coche c : listaCoches) {
			if (c.getId() == id) {
				listaCoches.remove(c);
				break;
			}
		}
	}

	@Override
	public Coche consultar(int id) {
		Coche coche = null;
		for (Coche c : listaCoches) {
			if (c.getId() == id) {
				coche = c;
				break;
			}
		}
		return coche;
	}

	@Override
	public void modificar(Coche coche) {
		for (Coche c : listaCoches) {
			if (c.getId() == coche.getId()) {
				c.setMarca(coche.getMarca());
				c.setModelo(coche.getModelo());
				break;
			}
		}
	}

	@Override
	public ArrayList<Coche> listar() {
		return listaCoches;
	}
}