import java.util.List;
import java.time.LocalDateTime;

public class Consulta {
    private LocalDateTime Fecha;
    private Paciente paciente;
    private Medico medico;
    private boolean realizada;
    private ConsultaDatos Datos;

    public Consulta(LocalDateTime Fecha, Paciente paciente, Medico medico,ConsultaDatos Datos) {
        this.Fecha=Fecha;
        this.Datos = Datos;
        this.paciente = paciente;
        this.medico = medico;
        this.realizada = false;
    }

    public LocalDateTime getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDateTime Fecha) {
        this.Fecha = Fecha;
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

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    public ServicioMedico getServicioMedico() { 
        return datos.getServicioMedico(); }
    public void setServicioMedico(ServicioMedico servicioMedico) { 
        datos.setServicioMedico(servicioMedico); }

    public String getDiagnostico() { 
        return datos.getDiagnostico(); }
    public void setDiagnostico(String diagnostico) { 
        datos.setDiagnostico(diagnostico); }

    public String getTratamiento() { 
        return datos.getTratamiento(); }
    public void setTratamiento(String tratamiento) { datos.setTratamiento(tratamiento); }

    public List<String> getExamenesMedicos() { 
        return datos.getExamenesMedicos(); }
    public void addExamen(String examen) { 
        datos.addExamen(examen); }
    public void removeExamen(String examen) { 
        datos.removeExamen(examen); }

}
