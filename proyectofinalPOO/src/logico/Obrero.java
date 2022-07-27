package logico;

import java.util.ArrayList;
import java.util.Date;

public class Obrero extends Persona {
               private ArrayList<String>AreaLaboral;
	public Obrero(String cedula, String nombre, String apellido, String telefono, String email, String institucion,
			Date fechanacimiento, char genero, String campodetrabajo, boolean profesional, int salariobase,
			String estadoCivil) {
		super(cedula, nombre, apellido, telefono, email, institucion, fechanacimiento, genero, campodetrabajo, profesional,
				salariobase, estadoCivil);
		
	}

}
