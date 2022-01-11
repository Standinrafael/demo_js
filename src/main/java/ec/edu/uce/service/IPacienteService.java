package ec.edu.uce.service;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteService {
	void calcularDeuda();
	
	void guardarPaciente(Paciente paciente); //Create
	void buscarPaciente(String cedula);  //Read
	void actualizarPaciente(Paciente paciente); //Update
	void borrarPaciente(String cedula); //Delete

}
