import java.util.ArrayList;
import java.util.List;

public class SistemaAtencionMedico {
    // REPLACE MAGIC NUMBER WITH SYMBOLIC CONSTANT
    private static final double DESCUENTO_ADULTO_MAYOR = 0.25; // 25%

    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<ServicioMedico> serviciosMedicos;

    public SistemaAtencionMedico() {
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.serviciosMedicos = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void agregarServicioMedico(ServicioMedico servicioMedico) {
        serviciosMedicos.add(servicioMedico);
    }

    // ENCAPSULATE COLLECTION - Método mejorado que respeta encapsulación
    public void agendarConsulta(Paciente paciente, Consulta consulta) {
        double costoConsulta = consulta.getServicioMedico().getCosto();
        // PRESERVE WHOLE OBJECT - Pasamos el paciente completo, no extraemos datos
        costoConsulta = calcularValorFinalConsulta(costoConsulta, paciente);
        System.out.println("Se han cobrado " + costoConsulta + " dolares de su tarjeta de credito");
        
        paciente.agregarConsultaAlHistorial(consulta);
    }

    // REPLACE MAGIC NUMBER WITH SYMBOLIC CONSTANT
    public double calcularValorFinalConsulta(double costoConsulta, Paciente paciente) {
        double valorARestar = 0;
        // Usa el método esAdultoMayor() existente en Paciente - no duplica lógica
        if (paciente.esAdultoMayor()) {
            valorARestar = costoConsulta * DESCUENTO_ADULTO_MAYOR;
        }
        return costoConsulta - valorARestar;
    }

    // PARAMETERIZE METHOD - Unificamos los tres métodos de búsqueda
    // Ahora usamos un método genérico que funciona con cualquier lista
    private <T> T obtenerPorNombre(List<T> lista, String nombre) {
        for (T elemento : lista) {
            if (elemento instanceof Persona) {
                Persona persona = (Persona) elemento;
                if (persona.getNombre().equals(nombre)) {
                    return elemento;
                }
            } else if (elemento instanceof ServicioMedico) {
                ServicioMedico servicio = (ServicioMedico) elemento;
                if (servicio.getNombre().equals(nombre)) {
                    return elemento;
                }
            }
        }
        return null;
    }

    public Paciente obtenerPaciente(String nombrePaciente) {
        return obtenerPorNombre(pacientes, nombrePaciente);
    }

    public ServicioMedico obtenerServicioMedico(String nombreServicio) {
        return obtenerPorNombre(serviciosMedicos, nombreServicio);
    }

    public Medico obtenerMedico(String nombreMedico) {
        return obtenerPorNombre(medicos, nombreMedico);
    }
}
