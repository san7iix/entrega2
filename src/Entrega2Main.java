import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Entrega2Main {
    public static void main(String[] args) {
        Concurso sesion1 = new Concurso("Sesion 1", 2);
        Concurso sesion2 = new Concurso("Sesion 2", 3);
        Concurso sesion3 = new Concurso("Sesion 3", 3);

        List<Concurso> concursoList = new ArrayList<>();
        List<String> equipos = Arrays.asList("Equipo 1", "Equipo 2", "Equipo 3", "Equipo 4");

        concursoList.addAll(Arrays.asList(sesion1,sesion2,sesion3));

        concursoList.forEach(concurso -> {
            System.out.println(concurso.getNombre());
            concurso.addEquipos(equipos);

            concurso.getEquiposParticipantes().forEach(equipo->{
                for (int i = 0; i <= concurso.getnProblemas() ; i++) {
                    concurso.registrarEnvio(equipo, i, "(1,2)");
                }
            });

        });

    }
}
