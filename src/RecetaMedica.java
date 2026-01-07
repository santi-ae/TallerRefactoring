import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Medicamento {
    private String nombre;
    private String dosis;
    private String forma;

    public Medicamento(String nombre, String dosis, String forma) {
        this.nombre = nombre;
        this.dosis = dosis;
        this.forma = forma;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDosis() {
        return dosis;
    }

    public String getForma() {
        return forma;
    }

    @Override
    public String toString() {
        return nombre + " - " + dosis + " (" + forma + ")";
    }
}

public class RecetaMedica {
    private LocalDateTime fechaHora;
    private Paciente paciente;
    private Medico medico;
    private List<Medicamento> medicamentos;

    public RecetaMedica(LocalDateTime fechaHora, Paciente paciente, Medico medico, List<Medicamento> medicamentos) {
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
        this.medicamentos = new ArrayList<>(medicamentos);
    }

    public void agregarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }

    public List<Medicamento> getMedicamentos() {
        return new ArrayList<>(medicamentos);
    }

    private void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = new ArrayList<>(medicamentos);
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
