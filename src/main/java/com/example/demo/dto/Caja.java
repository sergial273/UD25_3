package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Cajas")//en caso que la tabla sea diferente

public class Caja {
	
	//Atributos de entidad cliente
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		@Column(name = "contenido")//no hace falta si se llama igual
		private String contenido;
		@Column(name = "valor")//no hace falta si se llama igual
		private int valor;
		
		@ManyToOne
	    @JoinColumn(name="almacen")
	    private Almacen almacen;

		//Constructores
		public Caja() {
			
		}

		public Caja(Long id, String contenido, int valor, Almacen almacen) {
			this.id = id;
			this.contenido = contenido;
			this.valor = valor;
			this.almacen = almacen;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getContenido() {
			return contenido;
		}

		public void setContenido(String contenido) {
			this.contenido = contenido;
		}

		public int getValor() {
			return valor;
		}

		public void setValor(int valor) {
			this.valor = valor;
		}

		public Almacen getAlmacen() {
			return almacen;
		}

		public void setAlmacen(Almacen almacen) {
			this.almacen = almacen;
		}

		@Override
		public String toString() {
			return "Caja [id=" + id + ", contenido=" + contenido + ", valor=" + valor + ", almacen=" + almacen + "]";
		}

		
}
