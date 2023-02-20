/**
 * @author Adaya Elías Gracia
 * @version 1.2
 */
public class Rectangulo_AEG extends FiguraGeometrica_AEG {
	private double l1;
	private double l2;

	/**
	 * @param tipoFigura: hereda atributos de la clase abstracta Figura geometrica
	 * @param lG: l1
	 * @param lP: l2
	 */
	public Rectangulo_AEG(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * metodo donde se calcula el area.
	 * @return area
	 */
	@Override
	public double area() {
		return l1 * l2;
	}

	/**
	 * metodo donde se calcula el perimetro
	 * @return perimetro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
