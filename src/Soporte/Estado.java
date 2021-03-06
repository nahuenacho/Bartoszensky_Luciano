package Soporte;

public class Estado {

    private String e[][];
    // Para las 2 cabinas
    private static final int C_LIBRE = 0;
    private static final int C_OCUPADO = 1;
    // Para los clientes
    private static final int CLI_SIENDO_ASIGNADO = 0;
    private static final int CLI_ESPERANDO_ASIGNACION = 1;
    private static final int CLI_NO_ATENDIDO = 2;
    private static final int CLI_ESPERANDO_COBRO = 3;
    private static final int CLI_LLAMANDO = 4;
    private static final int CLI_PAGANDO = 5;
    // Para el empleado
    private static final int EMP_LIBRE = 0;
    private static final int EMP_OCUPADO_COBRO = 1;
    private static final int EMP_OCUPADO_ASIGNA = 2;

    private static final int CABINA = 0;
    private static final int CLIENTE = 1;
    private static final int EMPLEADO = 2;

    public Estado() {
        e = new String[3][6];
        //Para las cabinas
        e[CABINA][C_LIBRE] = "Libre";
        e[CABINA][C_OCUPADO] = "Ocupado";
        //Para los clientes
        e[CLIENTE][CLI_SIENDO_ASIGNADO] = "Siendo Asignado";
        e[CLIENTE][CLI_ESPERANDO_ASIGNACION] = "Esperando Asignacion";
        e[CLIENTE][CLI_NO_ATENDIDO] = "Abandono";
        e[CLIENTE][CLI_ESPERANDO_COBRO] = "Esperando Cobro";
        e[CLIENTE][CLI_LLAMANDO] = "Llamando";
        e[CLIENTE][CLI_PAGANDO] = "Pagando";
        
        //Para el empleado
        e[EMPLEADO][EMP_LIBRE] = "Libre";
        e[EMPLEADO][EMP_OCUPADO_COBRO] = "Ocupado Cobrando";
        e[EMPLEADO][EMP_OCUPADO_ASIGNA] = "Ocupado Asignando";
    }

    public String estado(int objeto, int estado) {
        return e[objeto][estado];
    }
}
