package com.zubiri.geometria;
/*
 * Clase para obtener resultados de distintas operaciones aritméticas.
 */
public class Rectangulo {

	private double base;
	private double altura;
	private double valbas=0;
	private double valaltu=0;
 //Método que calcula el area de un circulo.
 public double area () {

	double result = 0;	
	result = base*altura; 
	return result;
 }
//Metodo que calcula la circunferencia de un circulo.
public double perimetro () {

	double result = 0;	
	result = (2 * base) + (2*altura) ;
	return result;
 }

public Rectangulo (double valbas, double valaltu) {

	base=valbas;
	altura=valaltu;

}

public double getBase(){
	
	return base;
}

public double getAltura(){
	
	return altura;
}

public void setBase(double oinarria){

	base=oinarria;
}

public void setAltura(double altuera){

	altura=altuera;
}

}
