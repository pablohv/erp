package com.erp.app.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short idCliente;

	@Size(min = 4, max = 30)
	private String nombre;

	@Size(max = 30)
	private String rfc;

	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	private List<Sitio> sitios;

	public Short getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Short idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public List<Sitio> getSitios() {
		return sitios;
	}

	public void setSitios(List<Sitio> sitios) {
		this.sitios = sitios;
	}

}
