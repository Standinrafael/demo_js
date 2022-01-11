package ec.edu.uce.repository;

import ec.edu.uce.modelo.Estudiante;

public interface IEstudianteRepo {
	
	void insertar( Estudiante estudiante); //C
	void buscarPorCedula(String cedula); //R
	void actualizar(Estudiante estudiante); //U
	void borrar (String cedula);// D

}
