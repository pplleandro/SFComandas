package ejb;

import java.util.List;

import javax.ejb.Local;

import version01.Produto;

@Local
public interface ProdutoBeanLocal {
	
	public void save(Produto produto);
	public void remove(Produto produto);
	public List<Produto> getAllProduto();

}
