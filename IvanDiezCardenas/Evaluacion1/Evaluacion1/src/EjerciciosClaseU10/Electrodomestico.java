package EjerciciosClaseU10;

public class Electrodomestico {
	private double precioBase;
	private char color;
	private char consumoEnergetico;
	private int peso;
	private final char colorPorDefecto;
	private final char consumoEnergetico1;
	private final double precioBase1;
	private final int peso1;
}

	public Electrodomestico(double precioBase, char color, char consumoEnergetico, char letras, int peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public Electrodomestico() {
		this.color = colorPorDefecto;
		this.precioBase = precioBase1;
		this.consumoEnergetico = consumoEnergetico1;
		this.peso = peso1;
	}
	

	public Electrodomestico(double precioBase, int peso) {
		this.peso = peso;
		this.precioBase = precioBase;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public char getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}

	public char getColorPorDefecto() {
		return colorPorDefecto;
	}

	public char getConsumoEnergetico1() {
		return consumoEnergetico1;
	}

	public double getPrecioBase1() {
		return precioBase1;
	}

public int getPeso1() {
	return peso1;
}
