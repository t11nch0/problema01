package died.lab01.problema01;


public class Recta {
	
	private Punto a;
	private Punto b;
	
	public Recta(Punto p1, Punto p2) {
		this.a= p1;
		this.b= p2;
	}
	
	public Recta() {
		this.a= new Punto(0,0);
		this.b= new Punto(1,1);
	}
	
	public float pendiente() {
		return (b.y - a.y) / (b.x - a.x);
	}
	
	public boolean paralelas(Recta otraRecta) {
		return (this.pendiente() == otraRecta.pendiente());
	}

	public boolean equals(Object otraRecta) {
		if(otraRecta instanceof Recta)
			return ((this.paralelas((Recta)otraRecta))  &&  ((new Recta(this.a, ((Recta)otraRecta).b).pendiente()) == this.pendiente()));
		else
			return false;
	}

}
