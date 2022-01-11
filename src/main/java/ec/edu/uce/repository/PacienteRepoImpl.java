package ec.edu.uce.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Paciente;

@Repository

public class PacienteRepoImpl implements IPacienteRepo {
	
	private static final Logger LOG = LoggerFactory.getLogger(PacienteRepoImpl.class);

	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		//System.out.println("Se guardo en la base: "+paciente); no debo usar syso
		LOG.info("Se guardo en la base: "+paciente);
		
	}

	@Override
	public void buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		//System.out.println("Buscando a: "+cedula);No debo usar syso
		LOG.info("Buscando a: "+cedula);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		//System.out.println("Actualizando a:" + paciente); no debo usar syso
		
		LOG.info("Actualizando a:" + paciente);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		//System.out.println("Borrando a: "+cedula); No debo usar syso
		LOG.info("Borrando a: "+cedula);
		LOG.error("Ha ocurrido un error");
	}

}
