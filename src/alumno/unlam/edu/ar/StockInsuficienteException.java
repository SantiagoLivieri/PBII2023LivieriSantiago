package alumno.unlam.edu.ar;

public class StockInsuficienteException extends Exception {
	
	StockInsuficienteException(String mensaje){
		super(mensaje);
	}
}
