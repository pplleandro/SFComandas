package version01;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Reservas {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long oid;
	
	private String reservante;
	
	
	@Column(length=500)
	private String descricao;
	
	
	//RELACIONAMENTO COM COMANDA
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="reserv_comanda")
	private List<Comanda> com = new ArrayList<Comanda>();
	
	
	
	
	

	public String getReservante() {
		return reservante;
	}
	public void setReservante(String reservante) {
		this.reservante = reservante;
	}
	public long getOid() {
		return oid;
	}
	public void setOid(long oid) {
		this.oid = oid;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
