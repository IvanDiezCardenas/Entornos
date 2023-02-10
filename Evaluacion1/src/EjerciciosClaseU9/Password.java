package EjerciciosClaseU9;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Password {
private int longitud;
private String contraseña;
public Password() {
	this.longitud = longitud;
	this.contraseña = contraseña;
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
String letraMinus = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,ñ,o,p,q,r,s,t,u,v,w,x,y,z";
String letraMayus = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,Ñ,O,P,Q,R,S,T,U,V,W,X,Y,Z";
if (letraMinus==letraMinus) {
	System.out.println("a,b,c,d,e,f,g,h,i,j,k,l,m,n,ñ,o,p,q,r,s,t,u,v,w,x,y,z");
}
else if (letraMayus==letraMayus) {
	System.out.println("A,B,C,D,E,F,G,H,I,J,K,L,M,N,Ñ,O,P,Q,R,S,T,U,V,W,X,Y,Z");
}
Math.random();
return letraMayus;

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
