package ejb;

import java.util.List;
import javax.ejb.Local;

import version01.Comanda;

@Local
public interface ComandaBeanLocal {
	public void save(Comanda comanda);
	public void remove(Comanda comanda);
	public List<Comanda> getAll();
}
