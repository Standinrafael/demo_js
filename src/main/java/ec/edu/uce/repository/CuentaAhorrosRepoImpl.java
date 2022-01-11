package ec.edu.uce.repository;

import ec.edu.uce.modelo.Cuenta;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("ahorros")
public class CuentaAhorrosRepoImpl implements ICuentaRepo {
	
	private static final Logger LOG = LoggerFactory.getLogger(CuentaAhorrosRepoImpl.class);

	@Override
	public void crear(Cuenta cuenta) {
		// TODO Auto-generated method stub
		LOG.info("Se ha ingresado una nueva cuenta y se guarda en MySQL" + cuenta);
	}

}
