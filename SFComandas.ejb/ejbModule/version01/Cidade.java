package version01;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cidade {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long oid;
	@Column(length=500)//SEM O COLUMN O SISTEMA IRA CRIAR UM VARCHAR(250)
	private String nome;
	@Column(length=500)
	private String estado;
	
	//EXEMPLO PARA TRATAMENTO DE DATA
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date aniver;
	
	public long getOid() {
		return oid;
	}
	public void setOid(long oid) {
		this.oid = oid;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
