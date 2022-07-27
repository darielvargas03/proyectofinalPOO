package logico;

import java.util.Date;

public class Universatario extends Persona {
	private String Carrera;

	public Universatario(String cedula, String nombre, String apellido, String telefono, String email,
			String institucion, Date fechanacimiento, char genero, String campodetrabajo, boolean profesional,
			int salariobase, String estadoCivil,String carrera) {
		super(cedula, nombre, apellido, telefono, email, institucion, fechanacimiento, genero, campodetrabajo, profesional,
				salariobase, estadoCivil);
		this.Carrera = carrera;
	}

	public String getCarrera() {
		return Carrera;
	}

	public void setCarrera(String carrera) {
		Carrera = carrera;
	}

}
