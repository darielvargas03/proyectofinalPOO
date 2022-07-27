package logico;

import java.util.ArrayList;

public class Empresa {
	private String Id;
	private String nombre;
	private String direccion;
	private String Telefono;
	private int  RNC;
	private String descripcion;
	private int presupuestoAnual;
	private int cantmaxempleador;
	private int cantempresas;
	private String Gerentes;
	private String Departamentos;
	public Empresa(String id, String nombre, String direccion, String telefono, int rNC, String descripcion,
			int presupuestoAnual, int cantmaxempleador, int cantempresas, String gerentes, String departamentos) {
		super();
		Id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		Telefono = telefono;
		RNC = 000-00000-(0);
		this.descripcion = descripcion;
		this.presupuestoAnual = presupuestoAnual;
		this.cantmaxempleador = 20;
		this.cantempresas = 100;
		Gerentes = gerentes;
		Departamentos = departamentos;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public int getRNC() {
		return RNC;
	}
	public void setRNC(int rNC) {
		RNC = rNC;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPresupuestoAnual() {
		return presupuestoAnual;
	}
	public void setPresupuestoAnual(int presupuestoAnual) {
		this.presupuestoAnual = presupuestoAnual;
	}
	public int getCantmaxempleador() {
		return cantmaxempleador;
	}
	public void setCantmaxempleador(int cantmaxempleador) {
		this.cantmaxempleador = cantmaxempleador;
	}
	public int getCantempresas() {
		return cantempresas;
	}
	public void setCantempresas(int cantempresas) {
		this.cantempresas = cantempresas;
	}
	public String getGerentes() {
		return Gerentes;
	}
	public void setGerentes(String gerentes) {
		Gerentes = gerentes;
	}
	public String getDepartamentos() {
		return Departamentos;
	}
	public void setDepartamentos(String departamentos) {
		Departamentos = departamentos;
	}
	
	

}
