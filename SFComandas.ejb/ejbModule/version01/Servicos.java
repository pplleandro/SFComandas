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
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Servicos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long oid;
	
	private String serviceName;
	
	
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date timeOpen;
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date timeClose;
	
	
	
	//RELACIONAMENTO COM COMANDA
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="serv_reserv")
	private List<Reservas> reserv = new ArrayList<Reservas>();
	
	
	public long getOid() {
		return oid;
	}
	public void setOid(long oid) {
		this.oid = oid;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public Date getTimeOpen() {
		return timeOpen;
	}
	public void setTimeOpen(Date timeOpen) {
		this.timeOpen = timeOpen;
	}
	public Date getTimeClose() {
		return timeClose;
	}
	public void setTimeClose(Date timeClose) {
		this.timeClose = timeClose;
	}
	
	
	

}
