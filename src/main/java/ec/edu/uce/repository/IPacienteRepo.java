package ec.edu.uce.repository;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteRepo {

	void insertar(Paciente paciente); //Create
	void buscarPorCedula(String cedula);  //Read
	void actualizar(Paciente paciente); //Update
	void borrar(String cedula); //Delete
	
}
