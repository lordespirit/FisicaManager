package main;

public interface Fisica {

	// SOLO PERMITE VARIABES MIEMBRO FINALES
	final float GRAVEDAD_TIERRA = 9.8f;
	final float GRAVEDAD_LUNA = 1.6f;
	
	public float getMasa();
	
	public float getDensidad();
	
}
