package died.lab01.problema01;

public class Punto {

    public float x;
    public float y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public boolean equals(Punto otroPunto) {
        return ((otroPunto.x == this.x) && (otroPunto.y == this.y));
    }

    public boolean equals(Object otroObjeto) {
        if (!(otroObjeto instanceof Punto)) {
            return false;
        } else {
            return equals((Punto)otroObjeto);
        }
    }
}
