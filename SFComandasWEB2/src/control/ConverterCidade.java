package control;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@ManagedBean(name="cidadeConverter")
@RequestScoped
public class ConverterCidade implements Converter, Serializable {
    
	@ManagedProperty(value="#{crtcliente}")
	private crtCliente crtCliente;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		int posicao = Integer.parseInt(value);
		return crtCliente.getColCidades().get(posicao);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		
		return String.valueOf(crtCliente.getColCidades().indexOf(value));
	}

	
}
