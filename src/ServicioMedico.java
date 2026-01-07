public class ServicioMedico {
    // REPLACE MAGIC NUMBER WITH SYMBOLIC CONSTANT
    private static final double COSTO_MINIMO = 0.0;
    private static final int DURACION_MINIMA = 0;

    private String nombre;
    private String descripcion;
    private double costo;
    private int duracion;

    public ServicioMedico(String nombre, String descripcion, double costo, int duracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        setCosto(costo);
        setDuracion(duracion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    // ENCAPSULATE FIELD - Validación consistente
    public void setCosto(double costo) {
        if (costo < COSTO_MINIMO) {
            System.out.println("El costo no puede ser menor a " + COSTO_MINIMO);
            return;
        }
        this.costo = costo;
    }

    public int getDuracion() {
        return duracion;
    }

    // ENCAPSULATE FIELD - Ahora valida como se indicaba en el comentario original
    public void setDuracion(int duracion) {
        if (duracion < DURACION_MINIMA) {
            System.out.println("La duración no puede ser menor a " + DURACION_MINIMA + " minutos");
            return;
        }
        this.duracion = duracion;
    }
}
