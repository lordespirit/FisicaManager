package tests;

import org.junit.Test;
import main.FisicaComputer;
import main.Solido;

public class Testfisicas {

	@Test
	public void testComputerFisicas(){
		
		Solido cubo  = new Solido();
		cubo.setMasa(5.0f);
		FisicaComputer comp = new FisicaComputer();
		comp.computePesoEnTierra(cubo);
		
	}
	
}
