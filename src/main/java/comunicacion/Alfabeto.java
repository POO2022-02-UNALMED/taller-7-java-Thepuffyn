package comunicacion;

public class Alfabeto extends Pictograma {

    private String letras[];
    private String interpretacion;
    public Alfabeto(String origen, String l[], String interp) {
        super(origen);
        this.letras = l;
        this.interpretacion = interp;
    }
    public String toString(){
        String resultado="";
        for (String letra: letras){
            resultado=(resultado+letra+", ");
        }
        return (resultado.substring(0,resultado.length()-2));
    }
    public int cantidadLetras(){
        return this.letras.length;
    }
    public String interpretacion(){
        return this.interpretacion;
    }
    public String[] getLetras() {
        return letras;
    }
    public void setLetras(String[] l) {
        this.letras = l;
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interp) {
        this.interpretacion = interp;
    }
    public static void main(String[] args) {
        Alfabeto alfabeto = new Alfabeto("alfabeto griego, occidente",
			new String [] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},
			"Alfabeto latino");
        System.out.println(alfabeto.toString());
    }
}