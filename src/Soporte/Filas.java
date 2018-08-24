package Soporte;

import java.util.LinkedList;

public class Filas {
    //Variables a utilizar
    private double reloj, rndCliente, tiempoEntreLlegada, proxLlegadaCliente, finAsignacionCabina, rndLlamada, finLlamada1, finLlamada2,finCobro;
    private double acuAtendidos, acuNoAtendidos, tiempoLlamada, acuTiempoLlamada,ganancia, acuGanancia, gananciaNeta;
    private String evento, estadoCabina1, estadoCabina2, estadoEmpleado;
    private long colaCliente;
    private LinkedList clientesTemporales, clientesCaja;

    public Filas(String evento, double reloj, double rndCliente, double tiempoEntreLlegada, double proxLlegadaCliente, double finAsignacionCabina, double rndLlamada, double finLlamada1, double finLlamada2, double finCobro, String estadoCabina1, String estadoCabina2, String estadoEmpleado, long colaCliente, double acuAtendidos, double acuNoAtendidos, double tiempoLlamada, double acuTiempoLlamada, double ganancia, double acuGanancia, double gananciaNeta, LinkedList clientesTemporales, LinkedList clientesCaja) {
        this.reloj = reloj;
        this.rndCliente = rndCliente;
        this.tiempoEntreLlegada = tiempoEntreLlegada;
        this.proxLlegadaCliente = proxLlegadaCliente;
        this.finAsignacionCabina = finAsignacionCabina;
        this.rndLlamada = rndLlamada;
        this.finLlamada1 = finLlamada1;
        this.finLlamada2 = finLlamada2;
        this.finCobro = finCobro;
        this.acuAtendidos = acuAtendidos;
        this.acuNoAtendidos = acuNoAtendidos;
        this.tiempoLlamada = tiempoLlamada;
        this.acuTiempoLlamada = acuTiempoLlamada;
        this.ganancia = ganancia;
        this.acuGanancia = acuGanancia;
        this.gananciaNeta = gananciaNeta;
        this.evento = evento;
        this.estadoCabina1 = estadoCabina1;
        this.estadoCabina2 = estadoCabina2;
        this.estadoEmpleado = estadoEmpleado;
        this.colaCliente = colaCliente;
        this.clientesTemporales = clientesTemporales;
        this.clientesCaja = clientesCaja;
    }

    public double getReloj() {
        return reloj;
    }

    public void setReloj(double reloj) {
        this.reloj = reloj;
    }

    public double getRndCliente() {
        return rndCliente;
    }

    public void setRndCliente(double rndCliente) {
        this.rndCliente = rndCliente;
    }

    public double getTiempoEntreLlegada() {
        return tiempoEntreLlegada;
    }

    public void setTiempoEntreLlegada(double tiempoEntreLlegada) {
        this.tiempoEntreLlegada = tiempoEntreLlegada;
    }

    public double getProxLlegadaCliente() {
        return proxLlegadaCliente;
    }

    public void setProxLlegadaCliente(double proxLlegadaCliente) {
        this.proxLlegadaCliente = proxLlegadaCliente;
    }

    public double getFinAsignacionCabina() {
        return finAsignacionCabina;
    }

    public void setFinAsignacionCabina(double finAsignacionCabina) {
        this.finAsignacionCabina = finAsignacionCabina;
    }

    public double getRndLlamada() {
        return rndLlamada;
    }

    public void setRndLlamada(double rndLlamada) {
        this.rndLlamada = rndLlamada;
    }

    public double getFinLlamada1() {
        return finLlamada1;
    }

    public void setFinLlamada1(double finLlamada1) {
        this.finLlamada1 = finLlamada1;
    }

    public double getFinLlamada2() {
        return finLlamada2;
    }

    public void setFinLlamada2(double finLlamada2) {
        this.finLlamada2 = finLlamada2;
    }

    public double getFinCobro() {
        return finCobro;
    }

    public void setFinCobro(double finCobro) {
        this.finCobro = finCobro;
    }

    public double getAcuAtendidos() {
        return acuAtendidos;
    }

    public void setAcuAtendidos(double acuAtendidos) {
        this.acuAtendidos = acuAtendidos;
    }

    public double getAcuNoAtendidos() {
        return acuNoAtendidos;
    }

    public void setAcuNoAtendidos(double acuNoAtendidos) {
        this.acuNoAtendidos = acuNoAtendidos;
    }

    public double getTiempoLlamada() {
        return tiempoLlamada;
    }

    public void setTiempoLlamada(double tiempoLlamada) {
        this.tiempoLlamada = tiempoLlamada;
    }

    public double getAcuTiempoLlamada() {
        return acuTiempoLlamada;
    }

    public void setAcuTiempoLlamada(double acuTiempoLlamada) {
        this.acuTiempoLlamada = acuTiempoLlamada;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public double getAcuGanancia() {
        return acuGanancia;
    }

    public void setAcuGanancia(double acuGanancia) {
        this.acuGanancia = acuGanancia;
    }

    public double getGananciaNeta() {
        return gananciaNeta;
    }

    public void setGananciaNeta(double gananciaNeta) {
        this.gananciaNeta = gananciaNeta;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getEstadoCabina1() {
        return estadoCabina1;
    }

    public void setEstadoCabina1(String estadoCabina1) {
        this.estadoCabina1 = estadoCabina1;
    }

    public String getEstadoCabina2() {
        return estadoCabina2;
    }

    public void setEstadoCabina2(String estadoCabina2) {
        this.estadoCabina2 = estadoCabina2;
    }

    public String getEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(String estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }

    public long getColaCliente() {
        return colaCliente;
    }

    public void setColaCliente(long colaCliente) {
        this.colaCliente = colaCliente;
    }

    public LinkedList getClientesTemporales() {
        return clientesTemporales;
    }

    public void setClientesTemporales(LinkedList clientesTemporales) {
        this.clientesTemporales = clientesTemporales;
    }

    public LinkedList getClientesCaja() {
        return clientesCaja;
    }

    public void setClientesCaja(LinkedList clientesCaja) {
        this.clientesCaja = clientesCaja;
    }
    
    
    
}
