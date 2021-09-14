package Factory;
import familia50nieros.ICincuenta;
import familiaMenorEdad.IMenorEdad;
import familiaMilitar.IMilitar;
import familiaTrabajador.ITrabajador;


public interface IFactoryPortafolio {

	public ICincuenta enviarC();
	public IMenorEdad enviarM();
	public IMilitar enviarMI();
	public ITrabajador enviarT();
	
}
