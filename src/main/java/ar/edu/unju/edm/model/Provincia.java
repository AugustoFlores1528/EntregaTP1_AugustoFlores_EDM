package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Provincia {
	private int codigoP;
	private String nombreP;
	
	public Provincia() {
		// TODO Auto-generated constructor stub
	}
	
	public Provincia(int codigoP, String nombreP) {
		super();
		this.codigoP = codigoP;
		this.nombreP = nombreP;
	}

	public int getCodigoP() {
		return codigoP;
	}

	public void setCodigoP(int codigoP) {
		this.codigoP = codigoP;
	}

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

}
