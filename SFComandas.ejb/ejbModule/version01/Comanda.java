package version01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamedQueries({
	@NamedQuery(name="getAllComanda", query="select c from Comanda c")
}
)
@Entity
public class Comanda {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long oid;
	
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date dataAbertura;
	
	private float valorTotal;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="comanda_oid")//Para nao criar uma tabela associativa errada com dois FK
	private List<ItemComanda> itens = new ArrayList<ItemComanda>();
	
	//RELACIONAMENTO COM SERVIÇOS
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="comanda_services")
	private Servicos serv;
	
	
	
	
	
	
	
	public long getOid() {
		return oid;
	}
	public void setOid(long oid) {
		this.oid = oid;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	
	

}
