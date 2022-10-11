package comunicacion;

public class Tesis extends Escrito{
	
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] arg,
			String conc, String ref, String interp) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = arg;
		this.conclusion = conc;
		this.referencias = ref;
		this.interpretacion = interp;
	}
	
	public String getIdea() {
		return idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
	}
	public String[] getArgumentos() {
		return argumentos;
	}
	public void setArgumentos(String[] arg) {
		this.argumentos = arg;
	}
	public String getConclusion() {
		return conclusion;
	}
	public void setConclusion(String con) {
		this.conclusion = con;
	}
	public String getReferencias() {
		return referencias;
	}
	public void setReferencias(String ref) {
		this.referencias = ref;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interp) {
		this.interpretacion = interp;
	}
	
	public int palabrasTotales(int palabrasPagina) {
		return super.getPaginas()*palabrasPagina*5;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + this.idea + "\n" + this.argumentos.length + "\n" + this.conclusion + "\n" + this.referencias;
	}
	
	
}