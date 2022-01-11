package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.repository.IPacienteRepo;
import ec.edu.uce.repository.PacienteRepoImpl;


@Service
public class PacienteServiceImpl implements IPacienteService {
	
	//Debemos desacoplar esta instanciacion con Spring
	//private PacienteRepoImpl paciente=new PacienteRepoImpl();
	
	//Declarar la interaz de la clase que quiero utilizar
	//private IPacienteRepo paciente= new PacienteRepoImpl(); no se debe acoplar
	
	@Autowired
	private IPacienteRepo paciente;
	

	@Override
	public void calcularDeuda() {
		// Traer de la base la deuda
		//Multiplicar por 12%
		//Calcular multa
		//............logica
		
	}

	@Override
	public void guardarPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		this.paciente.insertar(paciente);
	}

	@Override
	public void buscarPaciente(String cedula) {
		// TODO Auto-generated method stub
		this.paciente.buscarPorCedula(cedula);
	}

	@Override
	public void actualizarPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		this.paciente.actualizar(paciente);
	}

	@Override
	public void borrarPaciente(String cedula) {
		// TODO Auto-generated method stub
		this.paciente.borrar(cedula);
	}

}
