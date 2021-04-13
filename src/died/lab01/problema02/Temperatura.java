package died.lab01.problema02;

enum Escala {
    FAHRENHEIT, CELCIUS;
}

public class Temperatura {

    //ATRIBUTOS

    private Double grados;
    private Escala escala;

    //CONSTRUCTORES

    public Temperatura() {
        this.grados = 0.0;
        this.escala = Escala.CELCIUS;
    }

    public Temperatura(Double grados, Escala escala) {
        this.grados = grados;
        this.escala = escala;
    }

    //METODOS

    @Override
    public String toString() {

        String s = "";

        if (this.escala == Escala.CELCIUS)
            s = (this.grados + " °C");
        else if (this.escala == Escala.FAHRENHEIT) {
            s = (this.grados + " °F");
        }
        return s;
    }

    public Double asCelsius() {
        return (this.escala == Escala.CELCIUS) ? this.grados : (this.grados - 32.0) * (5.0 / 9);
    }

    public Double asFahrenheit() {
        return (this.escala == Escala.FAHRENHEIT) ? this.grados : (this.grados * (9.0 / 5)) + 32.0;
    }


    public void modificar(Temperatura temperatura) {
        if (temperatura.grados > 0) {
            if (this.escala == Escala.CELCIUS) {
                this.grados += temperatura.asCelsius();
            } else
                this.grados += temperatura.asFahrenheit();
        }
    }

    public void aumentar(Temperatura temperatura) {
        if (temperatura.grados > 0)
            this.modificar(temperatura);
    }

    public void disminuir(Temperatura temperatura) {
        if (temperatura.grados > 0) {
            temperatura.grados = -1 * temperatura.grados;
            this.modificar(temperatura);
        }
    }
}
