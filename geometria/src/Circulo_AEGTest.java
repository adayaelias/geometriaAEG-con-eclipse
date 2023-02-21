import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circulo_AEGTest {

    @Test
    void area() {
        Circulo_AEG a1 = new Circulo_AEG(7, "circulo");
        System.out.println(a1.area());

        Circulo_AEG a2 = new Circulo_AEG(0, "circulo");
        System.out.println(a2.area());

        Circulo_AEG a3 = new Circulo_AEG(-3, "circulo");
        System.out.println(a3.area());

    }

    @Test
    void perimetro() {
        Circulo_AEG p1 = new Circulo_AEG(7, "circulo");
        System.out.println(p1.perimetro());

        Circulo_AEG p2 = new Circulo_AEG(0, "circulo");
        System.out.println(p2.perimetro());

        Circulo_AEG p3 = new Circulo_AEG(-3, "circulo");
        System.out.println(p3.perimetro());

    }

}