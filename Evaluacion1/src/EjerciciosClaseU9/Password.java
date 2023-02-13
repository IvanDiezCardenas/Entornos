package EjerciciosClaseU9;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Password {
private int longitud;
private String contraseña;
public Password() {
	this.longitud = longitud;
	this.contraseña = generarContraseña();
}
public int longitud() {
	if (longitud>8) {
		System.out.println("Es valida");
	}
	else {
		System.out.println("Introduce una más larga");
	}
	return longitud;
}
public String generarContraseña() {
String Password = "";
for (int i = 0; i < longitud; i++) {
	int eleccion = (int) ((Math.random() * 3 + 1));
	if (eleccion==1) {
		char minusculas = (char) (int) ((Math.random() * 123-97)+97);
	Password += minusculas;
	}
	else {
		if (eleccion==2) {
			char minusculas = (char) (int) ((Math.random() * 123-97)+97);
			Password += minusculas;
		}
	}
}
return "";
}
public int getLongitud() {
	return longitud;
}
public void setLongitud(int longitud) {
	this.longitud = longitud;
}
public String getContraseña() {
	return contraseña;
}

}
