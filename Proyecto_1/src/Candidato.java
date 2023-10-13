public class Candidato extends Ciudadano{
    private boolean derecha;
    private PartidoPolitico partidoPolitico;
    private Promesas promesas;
    private Promesas promesas2;
    public Candidato(String nombre, String cedula, Ciudades ciudades, boolean derecha, PartidoPolitico partidoPolitico,
                    Promesas promesas, Promesas promesas2) {
        super(nombre, cedula, ciudades);
        this.derecha = derecha;
        this.partidoPolitico = partidoPolitico;
        this.promesas = promesas;
        this.promesas2 = promesas2;
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
