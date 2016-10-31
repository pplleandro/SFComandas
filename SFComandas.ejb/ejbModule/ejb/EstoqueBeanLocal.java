package ejb;

import java.util.List;

import javax.ejb.Local;
import version01.Estoque;

@Local
public interface EstoqueBeanLocal {
	
	public void save(Estoque estq);
	public void remove(Estoque estq);
	public List<Estoque> getAllEstoque();

}
