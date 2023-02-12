import java.util.ArrayList;
import java.util.List;

public class PasajeroDAOImpl implements PasajeroDAO {
  
  private List<Pasajero> pasajeros;

  public PasajeroDAOImpl() {
    this.pasajeros = new ArrayList<>();
  }

  @Override
  public void addPasajero(Pasajero pasajero) {
    pasajeros.add(pasajero);
  }

  @Override
  public void deletePasajero(int id) {
    for (int i = 0; i < pasajeros.size(); i++) {
      if (pasajeros.get(i).getId() == id) {
        pasajeros.remove(i);
        break;
      }
    }
  }

  @Override
  public Pasajero getPasajero(int id) {
    for (Pasajero pasajero : pasajeros) {
      if (pasajero.getId() == id) {
        return pasajero;
      }
    }
    return null;
  }

  @Override
  public List<Pasajero> getAllPasajeros() {
    return pasajeros;
  }

  @Override
  public void addPasajeroToCoche(int idPasajero, int idCoche) {
    Pasajero pasajero = getPasajero(idPasajero);
    Coche coche = CocheDAO.getInstance().getCoche(idCoche);
    if (pasajero != null && coche != null) {
      coche.getPasajeros().add(pasajero);
    }
  }

  @Override
  public void deletePasajeroFromCoche(int idPasajero, int idCoche) {
    Pasajero pasajero = getPasajero(idPasajero);
    Coche coche = CocheDAO.getInstance().getCoche(idCoche);
    if (pasajero != null && coche != null) {
      coche.getPasajeros().remove(pasajero);
    }
  }

  @Override
  public List<Pasajero> getAllPasajerosFromCoche(int idCoche) {
    Coche coche = CocheDAO.getInstance().getCoche(idCoche);
    if (coche != null) {
      return coche.getPasajeros();
    }
    return new ArrayList<>();
  }

@Override
public void removePasajeroFromCoche(int idPasajero, int idCoche) {
	// TODO Auto-generated method stub
	
}

@Override
public List<Pasajero> getPasajerosFromCoche(int idCoche) {
	// TODO Auto-generated method stub
	return null;
}
}
