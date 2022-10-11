package comunicacion;

public class Fabula extends Escrito {
    private String ensenanza;
    private String interpretacion;
    public Fabula(String origen, String titulo, String autor, int paginas, String ense, String interp) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ense;
        this.interpretacion = interp;
    }
    public int palabrasTotales(int palabrasPagina){
        return this.getPaginas()*palabrasPagina;
    }
    public String interpretacion(){
        return this.interpretacion;
    }
    public String toString(){
        return (this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getAutor()+"\n"+this.getPaginas()+"\n"+this.getEnsenanza());
    }
    public String getEnsenanza() {
        return ensenanza;
    }
    public void setEnsenanza(String ense) {
        this.ensenanza = ense;
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interp) {
        this.interpretacion = interp;
    }
}