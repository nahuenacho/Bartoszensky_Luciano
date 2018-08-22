package Soporte;

public class Empleado {

    private Estado estado;
    private int colaAsgina;
    private int colaCobro;
    private String estadoEmpleado;

    public Empleado() {
        estado = new Estado();
        estadoEmpleado = estado.estado(2, 0); //Para el empleado estado Libre
        colaAsgina = 0;
        colaCobro = 0;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getColaAsgina() {
        return colaAsgina;
    }

    public void setColaAsgina(int colaAsgina) {
        this.colaAsgina = colaAsgina;
    }

    public int getColaCobro() {
        return colaCobro;
    }

    public void setColaCobro(int colaCobro) {
        this.colaCobro = colaCobro;
    }

    public String getEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(String estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }

}
