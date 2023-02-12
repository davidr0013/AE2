import java.util.List;

public interface PasajeroDAO {
    void addPasajero(Pasajero pasajero);
    void deletePasajero(int id);
    Pasajero getPasajero(int id);
    List<Pasajero> getAllPasajeros();
    void addPasajeroToCoche(int idPasajero, int idCoche);
    void removePasajeroFromCoche(int idPasajero, int idCoche);
    List<Pasajero> getPasajerosFromCoche(int idCoche);
}
