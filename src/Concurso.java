import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Concurso {
    private String nombre;
    private final Integer nProblemas;
    private List<String> equiposParticipantes;
    private Integer numeroEquipos;
    private List<Envio> envios;

    public Concurso(String nombre, Integer nProblemas) {
        this.nombre = nombre;
        this.nProblemas = nProblemas - 1;
        this.equiposParticipantes = new ArrayList<>();
        this.envios = new ArrayList<>();
    }

    public Concurso(String nombre) {
        this.nombre = nombre;
        this.nProblemas = 5;
        this.equiposParticipantes = new ArrayList<>();
        this.envios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getnProblemas() {
        return nProblemas;
    }

    public List<String> getEquiposParticipantes() {
        return equiposParticipantes;
    }

    public void setEquiposParticipantes(List<String> equiposParticipantes) {
        this.equiposParticipantes = equiposParticipantes;
    }

    public Integer getNumeroEquipos() {
        return this.equiposParticipantes.size();
    }

    public List<Envio> getEnvios() {
        return envios;
    }

    public void setEnvios(List<Envio> envios) {
        this.envios = envios;
    }

    public void addEquipos(List<String> equipos){
        equipos.forEach(equipo-> {
            if(!this.buscarEquipo(equipo))
                this.equiposParticipantes.add(equipo);
        });
    }

    public Boolean buscarEquipo(String equipo){
        return this.equiposParticipantes.indexOf(equipo) >= 0;
    }

    public Boolean eliminarEquipo(String equipo){
        return false;
    }

    public Envio registrarEnvio(String equipo, Integer numeroProblema, String respuesta){
        if(!buscarEquipo(equipo) || numeroProblema > this.nProblemas || respuesta == null || respuesta.isEmpty())
            return null;

        Envio envio = new Envio(equipo, numeroProblema, respuesta);
        this.envios.add(envio);

        return envio;
    }

    @Override
    public String toString() {
        return "Concurso {" +
                "nombre='" + nombre + '\'' +
                ", nProblemas=" + nProblemas +
                ", equiposParticipantes=" + equiposParticipantes +
                ", numeroEquipos=" + numeroEquipos +
                ", envios=" + envios +
                '}';
    }
}
