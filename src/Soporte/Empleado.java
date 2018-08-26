package Soporte;

public class Empleado {

    private Estado estado;
    private int colaClientes;
    private String estadoEmpleado;
    private boolean prioridadCabinaCobro;
    
    public Empleado() {
        estado = new Estado();
        estadoEmpleado = estado.estado(2, 0); //Para el empleado estado Libre
        colaClientes = 0;
        prioridadCabinaCobro = false;
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

    public void setEstadoEmpleado(int i) {
        this.estadoEmpleado = this.estado.estado(2, i);
    }
    
    public boolean getPrioridadCabinaCobro ()
    {
        return prioridadCabinaCobro;
    }
    
    public void setPrioridadCabinaCobro(boolean prioridad)
    {
        prioridadCabinaCobro = prioridad;
    }

}
