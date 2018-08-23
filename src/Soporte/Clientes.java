package Soporte;

public class Clientes {
    
    private Estado estado;
    private double horaInicioLlamada;
    private long id;
    private String estadoCliente;

    public Clientes(double horaInicioLlamada, long id) {
        estado = new Estado();
        this.horaInicioLlamada = horaInicioLlamada;
        this.id = id;
        estadoCliente = "Cliente";
    }
    
    public String estado()
    {
        return estadoCliente;
    }
    
    public void setEstado(int i)
    {
        estadoCliente = estado.estado(0, i);
    }

    public double getHoraInicioLlamada() {
        return horaInicioLlamada;
    }

    public void setHoraInicioLlamada(double horaInicioLlamada) {
        this.horaInicioLlamada = horaInicioLlamada;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }    
}
