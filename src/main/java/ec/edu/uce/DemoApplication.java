package ec.edu.uce;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Cuenta;
import ec.edu.uce.service.ICuentaService;
import ec.edu.uce.service.IEstudianteService;
import ec.edu.uce.service.IPacienteService;
import ec.edu.uce.service.scope.IMatriculaSingletonService;

//@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	//private IPacienteService  pacienteService =new PacienteServiceImpl(); no se deberia aplicar

	private static final Logger LOG = LoggerFactory.getLogger(DemoApplication.class);
	
	@Autowired
	private IMatriculaSingletonService service;
	
	/*@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	
	private IEstudianteService estudianteService;
	*/
	
	@Autowired
	private ICuentaService cuentaService;
	
	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Cuenta cuenta=new Cuenta();
		
		Cuenta cuenta1=new Cuenta();
		
		cuenta1.setNumero("123457");
		cuenta1.setSaldo(new BigDecimal("10.80"));
		cuenta.setNumero("12345");
		cuenta.setSaldo(new BigDecimal("700"));
		
		this.cuentaService.ingresarCuentaHabiente(cuenta);
		this.cuentaService.ingresarCuentaHabiente(cuenta1);
		
		
		/*LOG.info("Imresion valor del objeto");
		LOG.info(this.service.obtenerCodigo());*/
	}

	/*@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		LOG.info("Secccion de Paciente");
		
		Paciente miPaciente=new Paciente();
		
		// datos tomados de la pagina web
		miPaciente.setNombre("Jorge");
		miPaciente.setApellido("Sanchez");
		miPaciente.setEdad(22);
		//--------------------------------------
		
		
		this.pacienteService.guardarPaciente(miPaciente);
		miPaciente.setEdad(27);
		this.pacienteService.actualizarPaciente(miPaciente);
		this.pacienteService.buscarPaciente("1111");
		this.pacienteService.borrarPaciente("11222");
		
		
		
		LOG.info("Seccion de Estudiante");
		Estudiante miEstudiante=new Estudiante();
		miEstudiante.setNombre("Luis");
		miEstudiante.setApellido("Perez");
		miEstudiante.setUniversidad("UCE");
		
		this.estudianteService.guardarEstudiante(miEstudiante);
		miEstudiante.setUniversidad("ESPE");
		this.estudianteService.actualizarEstudiante(miEstudiante);
		this.estudianteService.buscarEstudiante("000");
		this.estudianteService.borrarEstudiante("111");
		
		
	}*/

}
