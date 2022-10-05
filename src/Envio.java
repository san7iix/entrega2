public final class Envio {
    private String nombreEquipo;
    private Integer numeroProblema;
    private String respuesta;

    public Envio(String nombreEquipo, Integer numeroProblema, String respuesta) {
        this.nombreEquipo = nombreEquipo;
        this.numeroProblema = numeroProblema;
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "Envio: {" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                ", numeroProblema=" + numeroProblema +
                ", respuesta='" + respuesta + '\'' +
                '}';
    }
}
