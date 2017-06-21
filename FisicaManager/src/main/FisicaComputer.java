package main;

public class FisicaComputer {

	public float computePesoEnTierra(Fisica objetoConFisica){
		return Fisica.GRAVEDAD_TIERRA * objetoConFisica.getMasa();
	}
	
	public float computePesoEnLuna(Fisica objetoConFisica){
		return Fisica.GRAVEDAD_LUNA * objetoConFisica.getMasa();
	}
	
}
