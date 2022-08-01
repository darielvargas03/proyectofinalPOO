package logico;

import java.util.ArrayList;

public class Empresa {
	private String Id;
	private String nombre;
	private String direccion;
	private String Telefono;
	private String  RNC;
	private String descripcion;
	private int presupuestoAnual;
	private int cantmaxempleador;
	private int cantempresas;
	private String departamento;
	public Empresa(String id, String nombre, String direccion, String telefono, String rNC, String descripcion,
			int presupuestoAnual) {
		super();
		Id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		Telefono = telefono;
		RNC = rNC;
		this.descripcion = descripcion;
		this.presupuestoAnual = presupuestoAnual;
		this.cantmaxempleador = 0;
		this.cantempresas = 0;
		this.departamento = departamento;
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
	public String getRNC() {
		return RNC;
	}
	public void setRNC(String RNC) {
		this.RNC = RNC;
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
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	// Recibe Empleado y lo agrega al primer departamento. De lo contrario si no es registrado en ningun departamento,
		//Hacemos una execepcion de limite de plazas.
		
		public boolean NuevoEmpleado(Empresa empleado) {
			boolean resultado = false;
			if((this.departamento != null) && (empleado != null) && (departamento.isEmpty())) {
				for(int i=0; i<departamento.length(); i++) {
				}
				
			}
			return  resultado;
			
		}
	//Recibe Departamento y lo agrega a la empresa
		public void nuevoDepartamento(Empresa departamento) {
			if((this.departamento != null) && (departamento!=null)) {
				
			}
		}
}