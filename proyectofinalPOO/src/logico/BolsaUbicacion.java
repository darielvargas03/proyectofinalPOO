package logico;

import java.util.ArrayList;

public class BolsaUbicacion {
	private ArrayList<Empresa>miempresa;
	private ArrayList<Persona>mipersona;
	private int cantEmpresas;
	private int cantPersonas;
	private ArrayList<SolicitudPersona>solipersona;
	private ArrayList<SolicitudEmpresa>soliempresa;
	public static BolsaUbicacion bolsa;
	public BolsaUbicacion() {
		super();
		miempresa =  new ArrayList<Empresa>(1000);
		mipersona = new ArrayList<Persona>(1000);
		soliempresa = new ArrayList<SolicitudEmpresa>(1000);
		solipersona = new ArrayList<SolicitudPersona>(1000);
		cantEmpresas = 0;
		cantPersonas = 0;
	}
	 public static BolsaUbicacion getInstance() {
	    	if(bolsa == null) {
	    		bolsa = new BolsaUbicacion();
	    	}
	    	return bolsa;
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
	public int getCantEmpresas() {
		return cantEmpresas;
	}
	public void setCantEmpresas(int cantEmpresas) {
		this.cantEmpresas = cantEmpresas;
	}
	public int getCantPersonas() {
		return cantPersonas;
	}
	public void setCantPersonas(int cantPersonas) {
		this.cantPersonas = cantPersonas;
	}
	public void AddPersona(Persona aux) {
		mipersona.add(aux);
		cantPersonas++;
	}
	public void AddEmpresa(Empresa aux) {
		miempresa.add(aux);
		cantEmpresas++;
	}


}
