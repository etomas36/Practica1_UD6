package ed.etomas;

public class Instituto {

	public static final String kNOMBRE_ALUMNO = "Ethan";
	public static final String kAPELLIDOS_ALUMNO = "Tomas";
	public static final String kCICLO_FORMATIVO_2023 = "1º DAW";
	public static final int kANYO = 2023;

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = kNOMBRE_ALUMNO;
		p.apellidos = kAPELLIDOS_ALUMNO;
		p.cicloFormativo = kCICLO_FORMATIVO_2023;
		p.anyo = kANYO;
		
		System.out.println(p.toString());

	}

}
