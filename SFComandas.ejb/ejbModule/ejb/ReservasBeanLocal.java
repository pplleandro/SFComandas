package ejb;

import javax.ejb.Local;

import version01.Reservas;

@Local
public interface ReservasBeanLocal {

	public void save(Reservas reserv);
	public void remove(Reservas reserv);
}
