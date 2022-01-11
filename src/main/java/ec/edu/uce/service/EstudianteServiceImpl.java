package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.repository.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	
	@Autowired
	private IEstudianteRepo estudiante;
	
	@Override
	public void calcularMatricula() {
		// TODO Auto-generated method stub
		//Calcular la logica d ela matricula
	}

	@Override
	public void guardarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudiante.insertar(estudiante);
	}

	@Override
	public void buscarEstudiante(String cedula) {
		// TODO Auto-generated method stub
		this.estudiante.buscarPorCedula(cedula);
	}

	@Override
	public void actualizarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudiante.actualizar(estudiante);
	}

	@Override
	public void borrarEstudiante(String cedula) {
		// TODO Auto-generated method stub
		this.estudiante.borrar(cedula);
	}

}
