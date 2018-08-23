package Soporte;

public class Estado {

    private String e[][];
    // Para las 2 cabinas
    private static final int C_LIBRE = 0;
    private static final int C_OCUPADO = 1;
    // Para los clientes
    private static final int CLI_SIENDO_ATENDIDO = 0;
    private static final int CLI_ESPERANDO_ATENCION = 1;
    private static final int CLI_NO_ATENDIDO = 2;
    // Para el empleado
    private static final int EMP_LIBRE = 0;
    private static final int EMP_OCUPADO_COBRO = 1;
    private static final int EMP_OCUPADO_ASIGNA = 2;

    private static final int CABINA = 0;
    private static final int CLIENTE = 1;
    private static final int EMPLEADO = 2;

    public Estado() {
        e = new String[3][3];
        //Para las cabinas
        e[CABINA][C_LIBRE] = "Libre";
        e[CABINA][C_OCUPADO] = "Ocupado";
        //Para los clientes
        e[CLIENTE][CLI_SIENDO_ATENDIDO] = "Siendo Atendido";
        e[CLIENTE][CLI_ESPERANDO_ATENCION] = "Esperando Atencion";
        e[CLIENTE][CLI_NO_ATENDIDO] = "Abandono";
        //Para el empleado
        e[EMPLEADO][EMP_LIBRE] = "Libre";
        e[EMPLEADO][EMP_OCUPADO_COBRO] = "Ocupado Cobrando";
        e[EMPLEADO][EMP_OCUPADO_ASIGNA] = "Ocupado Asignando";
    }

    public String estado(int objeto, int estado) {
        return e[objeto][estado];
    }
}
