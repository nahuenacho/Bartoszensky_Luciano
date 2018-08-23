package Soporte;

public class Empleado {

    private Estado estado;
    private int colaClientes;
    private String estadoEmpleado;

    public Empleado() {
        estado = new Estado();
        estadoEmpleado = estado.estado(2, 0); //Para el empleado estado Libre
        colaClientes = 0;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getColaClientes() {
        return colaClientes;
    }

    public void setColaClientes(int colaClientes) {
        this.colaClientes = colaClientes;
    }

    public String getEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(String estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }

}
