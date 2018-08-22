package Soporte;

public class Clientes {
    
    private Estado estado;
    private double horaInicioCola;
    private long id;
    private String estadoCliente;
    
    public Clientes(double horaCola, long id)
    {
        estado = new Estado();
        horaInicioCola = horaCola ;
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
         
    public double getHoraInicioCola() {
        return horaInicioCola;
    }

    public long getId() {
        return id;
    }

    public void setHoraInicioCola(double horaInicioCola) {
        this.horaInicioCola = horaInicioCola;
    }
    
}
