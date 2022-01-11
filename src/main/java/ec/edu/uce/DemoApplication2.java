package ec.edu.uce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.service.scope.IMatriculaPrototypeService;
import ec.edu.uce.service.scope.IMatriculaSingletonService;

@SpringBootApplication
public class DemoApplication2 implements CommandLineRunner {

	//private IPacienteService  pacienteService =new PacienteServiceImpl(); no se deberia aplicar

	private static final Logger LOG = LoggerFactory.getLogger(DemoApplication2.class);
	
	
	//Scope Singleton
	@Autowired
	private IMatriculaSingletonService objeto1;
	
	@Autowired
	private IMatriculaSingletonService objeto2;
	
	@Autowired
	private IMatriculaSingletonService objeto3;
	
	
	//Scope Prototype
	@Autowired
	private IMatriculaPrototypeService pro1;
	
	@Autowired
	private IMatriculaPrototypeService pro2;
	
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication2.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		LOG.info("-------------------Singleton-----------------------");
		LOG.info("Impresion valor del objeto 1");
		this.objeto1.establecerValor("jorge");
		LOG.info(this.objeto1.obtenerCodigo());
		LOG.info("Impresion valor del objeto 2");
		LOG.info(this.objeto2.obtenerCodigo());
		LOG.info("Impresion valor del objeto 3");
		LOG.info(this.objeto3.obtenerCodigo());
		
		this.objeto3.establecerValor("pepe");
		LOG.info("Nuevo valor objeto 1");
		LOG.info(this.objeto1.obtenerCodigo());
		
		
		LOG.info("-------------------Prototype-----------------------");
		this.pro1.establecerNombre("Luis");
		LOG.info(this.pro1.obtenerNombre());
		LOG.info("Pro 2");
		this.pro2.establecerNombre("Kathe");
		LOG.info(this.pro2.obtenerNombre());
		LOG.info(this.pro1.obtenerNombre());
		
		
	}

	

}
