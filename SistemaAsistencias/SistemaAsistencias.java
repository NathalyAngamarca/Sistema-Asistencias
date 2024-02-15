import java.util.ArrayList;
import java.util.List;

public class SistemaAsistencias {
    public static void main(String[] args) {
        AsignaturaManager asignaturaManager = new AsignaturaManager();
        CicloManager cicloManager = new CicloManager();

        // Cargar asignaturas y ciclos
        asignaturaManager.cargarAsignaturas();
        cicloManager.cargarCiclos();

        // Mostrar ciclos
        cicloManager.mostrarCiclos();

        // Suponiendo que el usuario elige un ciclo y un paralelo
        String cicloSeleccionado = "Ciclo 1";
        String paraleloSeleccionado = "A";

        // Mostrar paralelos y asignaturas para el ciclo seleccionado
        cicloManager.mostrarParalelos(cicloSeleccionado);
        asignaturaManager.mostrarAsignaturas(cicloSeleccionado, paraleloSeleccionado);

        // Suponiendo que el usuario toma la asistencia para una asignatura específica
        String asignaturaSeleccionada = "Matemáticas";
        List<String> alumnosPresentes = new ArrayList<>();
        alumnosPresentes.add("Maria Fernanda");
        alumnosPresentes.add("Estudiante 2");

        AsistenciaManager asistenciaManager = new AsistenciaManager();
        asistenciaManager.tomarAsistencia(cicloSeleccionado, paraleloSeleccionado, asignaturaSeleccionada, alumnosPresentes);
    }
}
