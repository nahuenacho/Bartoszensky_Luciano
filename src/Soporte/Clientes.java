package Soporte;

public class Clientes {
    
    private Estado estado;
    private double horaInicioLlamada, horaInicioCola, horaFinCola;
    private long id;
    private String estadoCliente;

    public Clientes(double horaInicioLlamada, long id) {
        estado = new Estado();
        this.horaInicioLlamada = horaInicioLlamada;
        this.id = id;
        estadoCliente = estado.estado(1, 0);
        this.horaInicioCola = 0.0;
        this.horaFinCola = 0.0;
    }
    /*
    public String estado()
    {
        return estadoCliente;
    }
    
    public void setEstado(int i)
    {
        estadoCliente = estado.estado(1, i);
    }*/

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

    public void setEstadoCliente(int nroEstado) {
        this.estadoCliente = estado.estado(1, nroEstado);;
    }    
    
    public Double getHoraInicioCola()
    {
        return horaInicioCola;
    }
    
    public void setHoraInicioCola(double horaInicioC)
    {
        horaInicioCola = horaInicioC;
    }
    
    public Double getHoraFinCola()
    {
        return horaFinCola;
    }
    
    public void setHoraFinCola(double horaFinC)
    {
        horaFinCola = horaFinC;
    }
}
