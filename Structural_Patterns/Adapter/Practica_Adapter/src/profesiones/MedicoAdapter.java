package profesiones;

public class MedicoAdapter implements Target_Profesionales {

    private Medico medico;// referencia a laclase adaptada medico

    public MedicoAdapter() {
        super();
        this.medico = new Medico();
    }

    @Override
    public void Leer_planos() {
        System.out.println("Especialidades de medicas");
        this.medico.especialidad();
        this.medico.entidades();
    }

    @Override
    public void contratos() {
        System.out.println("Nacionalidades");
        this.medico.nacionalidad();
    }

    @Override
    public void supervision() {
        System.out.println("Campos de investigacion");
        this.medico.investigacion();
    }
}
