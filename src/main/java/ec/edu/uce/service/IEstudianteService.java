package ec.edu.uce.service;

import ec.edu.uce.modelo.Estudiante;

public interface IEstudianteService {

	void calcularMatricula();
	
	void guardarEstudiante( Estudiante estudiante); //C
	void buscarEstudiante(String cedula); //R
	void actualizarEstudiante(Estudiante estudiante); //U
	void borrarEstudiante (String cedula);// D
}
