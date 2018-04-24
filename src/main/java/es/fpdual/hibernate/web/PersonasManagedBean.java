package es.fpdual.hibernate.web;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import hibernate.hibernate.modelo.Persona;
import hibernate.hibernate.repositorio.RepositorioPersona;

@ManagedBean
@RequestScoped
public class PersonasManagedBean implements Serializable {

	private List<Persona> personas;

	public PersonasManagedBean() {

	}

	@PostConstruct
	public void inicializar() {
		this.personas = RepositorioPersona.consultar("", "", "", null, "");
	}

	public void eliminar(Persona persona) {
		RepositorioPersona.eliminarPersona(persona.getIdUsuario());
	}

	public List<Persona> getPersonas() {
		return personas;
	}

}
