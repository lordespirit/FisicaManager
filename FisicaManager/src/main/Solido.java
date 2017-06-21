package main;

public class Solido implements Fisica{

	private float masa;
	
	@Override
	public float getMasa() {
		// TODO CALCULO DE LA MASA
		return 45f;
	}

	@Override
	public float getDensidad() {
		// TODO CALCULO DE LA DENSIDAD
		return 3.2f;
	}
	
	public float getVolumen(){
		return 10;
	}
	
	public void setMasa(float f){
		this.masa = f;
	}
	
}
