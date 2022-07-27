package logico;

import java.util.ArrayList;

public class BolsaUbicacion {
	private ArrayList<Empresa>miempresa;
	private ArrayList<Persona>mipersona;
	private ArrayList<SolicitudPersona>solipersona;
	private ArrayList<SolicitudEmpresa>soliempresa;
	public BolsaUbicacion(ArrayList<Empresa> miempresa, ArrayList<Persona> mipersona,
			ArrayList<SolicitudPersona> solipersona, ArrayList<SolicitudEmpresa> soliempresa) {
		super();
		this.miempresa = miempresa;
		this.mipersona = mipersona;
		this.solipersona = solipersona;
		this.soliempresa = soliempresa;
	}
	public ArrayList<Empresa> getMiempresa() {
		return miempresa;
	}
	public void setMiempresa(ArrayList<Empresa> miempresa) {
		this.miempresa = miempresa;
	}
	public ArrayList<Persona> getMipersona() {
		return mipersona;
	}
	public void setMipersona(ArrayList<Persona> mipersona) {
		this.mipersona = mipersona;
	}
	public ArrayList<SolicitudPersona> getSolipersona() {
		return solipersona;
	}
	public void setSolipersona(ArrayList<SolicitudPersona> solipersona) {
		this.solipersona = solipersona;
	}
	public ArrayList<SolicitudEmpresa> getSoliempresa() {
		return soliempresa;
	}
	public void setSoliempresa(ArrayList<SolicitudEmpresa> soliempresa) {
		this.soliempresa = soliempresa;
	}


}
