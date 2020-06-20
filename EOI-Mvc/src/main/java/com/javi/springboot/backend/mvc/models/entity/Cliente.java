package com.javi.springboot.backend.mvc.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;




@Entity
@Table(name="proyectos")
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String referencia;
		private String titulo;
		private String tipo;
		private String zonificacion;
		private String catastro;
		private String cliente;
		private String ubicacion;
		private String comercial;
		private String fases;
		private double presupuesto;
		private boolean activo;
		
		
		@Column(name="create_at")
		@Temporal(TemporalType.DATE)
		private Date createAt;
		
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		
		public String getReferencia() {
			return referencia;
		}
		public void setReferencia(String referencia) {
			this.referencia = referencia;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public String getZonificacion() {
			return zonificacion;
		}
		public void setZonificacion(String zonificacion) {
			this.zonificacion = zonificacion;
		}
		public String getCatastro() {
			return catastro;
		}
		public void setCatastro(String catastro) {
			this.catastro = catastro;
		}
		public String getCliente() {
			return cliente;
		}
		public void setCliente(String cliente) {
			this.cliente = cliente;
		}
		public String getUbicacion() {
			return ubicacion;
		}
		public void setUbicacion(String ubicacion) {
			this.ubicacion = ubicacion;
		}
		public String getComercial() {
			return comercial;
		}
		public void setComercial(String comercial) {
			this.comercial = comercial;
		}
		public String getFases() {
			return fases;
		}
		public void setFases(String fases) {
			this.fases = fases;
		}
		public double getPresupuesto() {
			return presupuesto;
		}
		public void setPresupuesto(double presupuesto) {
			this.presupuesto = presupuesto;
		}
		public boolean isActivo() {
			return activo;
		}
		public void setActivo(boolean activo) {
			this.activo = activo;
		}
		public Date getCreateAt() {
			return createAt;
		}
		public void setCreateAt(Date createAt) {
			this.createAt = createAt;
		}
		
		

}
