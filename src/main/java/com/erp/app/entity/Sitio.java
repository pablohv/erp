package com.erp.app.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "sitios")
public class Sitio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short idSitio;

	@Size(max = 30)
	private String nombre;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCliente", foreignKey = @ForeignKey(name = "fk_sitio_cliente"))
	private Cliente cliente;

	@OneToMany(mappedBy = "sitio", fetch = FetchType.LAZY)
	private List<Contacto> contactos;

	public Short getIdSitio() {
		return idSitio;
	}

	public void setIdSitio(Short idSitio) {
		this.idSitio = idSitio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(List<Contacto> contactos) {
		this.contactos = contactos;
	}

}
