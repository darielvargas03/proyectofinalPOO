package logico;

public class SolicitudEmpresa {
	private String Numsoliciutd;
	private  String Nombre;
	private  int  edad;
	private  String  Tipotrabajo;
	private  String  email;
	private String NivelAcademico;
	private  boolean idioma;
	private int cantempleador;
	private  String Localizacion;
	private String Curriculum;
	private Float salariomin;
	public SolicitudEmpresa(String numsoliciutd, String nombre, int edad, String tipotrabajo, String email,
			String nivelAcademico, boolean idioma, int cantempleador, String localizacion, String curriculum,
			Float salariomin) {
		super();
		Numsoliciutd = numsoliciutd;
		Nombre = nombre;
		this.edad = edad;
		Tipotrabajo = tipotrabajo;
		this.email = email;
		NivelAcademico = nivelAcademico;
		this.idioma = idioma;
		this.cantempleador = cantempleador;
		Localizacion = localizacion;
		Curriculum = curriculum;
		this.salariomin = salariomin;
	}
	public String getNumsoliciutd() {
		return Numsoliciutd;
	}
	public void setNumsoliciutd(String numsoliciutd) {
		Numsoliciutd = numsoliciutd;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTipotrabajo() {
		return Tipotrabajo;
	}
	public void setTipotrabajo(String tipotrabajo) {
		Tipotrabajo = tipotrabajo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNivelAcademico() {
		return NivelAcademico;
	}
	public void setNivelAcademico(String nivelAcademico) {
		NivelAcademico = nivelAcademico;
	}
	public boolean isIdioma() {
		return idioma;
	}
	public void setIdioma(boolean idioma) {
		this.idioma = idioma;
	}
	public int getCantempleador() {
		return cantempleador;
	}
	public void setCantempleador(int cantempleador) {
		this.cantempleador = cantempleador;
	}
	public String getLocalizacion() {
		return Localizacion;
	}
	public void setLocalizacion(String localizacion) {
		Localizacion = localizacion;
	}
	public String getCurriculum() {
		return Curriculum;
	}
	public void setCurriculum(String curriculum) {
		Curriculum = curriculum;
	}
	public Float getSalariomin() {
		return salariomin;
	}
	public void setSalariomin(Float salariomin) {
		this.salariomin = salariomin;
	}




}
