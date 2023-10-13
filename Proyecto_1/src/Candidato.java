public class Candidato extends Ciudadano{
    private boolean derecha;
    private PartidoPolitico partidoPolitico;
    public Candidato(String nombre, String cedula, Ciudades ciudades, boolean derecha, PartidoPolitico partidoPolitico) {
        super(nombre, cedula, ciudades);
        this.derecha = derecha;
        this.partidoPolitico = partidoPolitico;
    }
    public boolean isDerecha() {
        return derecha;
    }
    public void setDerecha(boolean derecha) {

        this.derecha = derecha;
    }
    public PartidoPolitico getPartidoPolitico() {
        return partidoPolitico;
    }
    public void setPartidoPolitico(PartidoPolitico partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }
    
}
