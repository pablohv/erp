package com.erp.app.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "contactos")
public class Contacto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short idContacto;

	@Size(min = 4, max = 20)
	private String nombre;

	@Size(min = 4, max = 20)
	private String puesto;

	@Size(max = 12)
	private String telefono;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idSitio", foreignKey = @ForeignKey(name = "fk_contacto_sitio"))
	private Sitio sitio;

	public Short getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(Short idContacto) {
		this.idContacto = idContacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Sitio getSitio() {
		return sitio;
	}

	public void setSitio(Sitio sitio) {
		this.sitio = sitio;
	}

}
