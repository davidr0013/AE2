import java.util.ArrayList;

public interface CocheDAO {
	public void insertar(Coche coche);

	public void borrar(int id);

	public Coche consultar(int id);

	public void modificar(Coche coche);

	public ArrayList<Coche> listar();
	}