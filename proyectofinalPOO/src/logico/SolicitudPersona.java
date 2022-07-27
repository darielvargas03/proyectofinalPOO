package logico;

public class SolicitudPersona {
	private String Cedula;
	private String Nombre;
	private String edad;
    private char sexo;
	private String NivelAcademico;
	public SolicitudPersona(String cedula, String nombre, String edad, char sexo, String nivelAcademico) {
		super();
		Cedula = cedula;
		Nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		NivelAcademico = nivelAcademico;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getNivelAcademico() {
		return NivelAcademico;
	}
	public void setNivelAcademico(String nivelAcademico) {
		NivelAcademico = nivelAcademico;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}

}
