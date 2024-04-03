package pruebaproxyhospital;

public interface HistoriaMedica {
    public Historia consultarHistoria(int tipoUsuario, int idPaciente);
    public void crearHistoria(int tipoUsuario, String nombre, String documento);
    public void agregarVisita(int tipoUsuario, int idPaciente, String fecha);
}
