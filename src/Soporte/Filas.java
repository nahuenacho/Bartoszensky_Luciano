package Soporte;

import java.util.LinkedList;

public class Filas {
    //Variables a utilizar
    private double reloj, rndLlegadaCliente, tiempoEntreLlegada, proxLlegadaCliente, finAsignacionCabina, rndDuracionLlamada,tiempoLlamada, finLlamada1, finLlamada2,finCobro;
    private double acuAtendidos, acuNoAtendidos, acuTiempoLlamada, acuPerdida, acuGanancia, gananciaNeta, inicioLlamadaC1, inicioLlamadaC2;
    private String evento, estadoCabina1, estadoCabina2, estadoEmpleado;
    private long colaCliente, colaMaxima;
    private LinkedList<Clientes> clientesTemporales, clientesCaja, clientesEsperandoAsignacion;
    private boolean esperaCabina;

    public Filas(String evento, double reloj, double rndLlegadaCliente, double tiempoEntreLlegada, double proxLlegadaCliente, double finAsignacionCabina, double rndDuracionLlamada, double tiempoLlamada, double inicioLlamadaC1, double finLlamada1, double inicioLlamadaC2, double finLlamada2, double finCobro, String estadoCabina1, String estadoCabina2, String estadoEmpleado, boolean esperaCabina ,long colaCliente, double acuAtendidos, double acuNoAtendidos, long colaMaxima, double acuTiempoLlamada, double acuGanancia, double acuPerdida, double gananciaNeta, LinkedList<Clientes> clientesTemporales, LinkedList<Clientes> clientesCaja, LinkedList<Clientes> clientesEsperandoAsignacion) {
        this.evento = evento;
        this.reloj = reloj;
        this.rndLlegadaCliente = rndLlegadaCliente;
        this.tiempoEntreLlegada = tiempoEntreLlegada;
        this.proxLlegadaCliente = proxLlegadaCliente;
        this.finAsignacionCabina = finAsignacionCabina;
        this.rndDuracionLlamada = rndDuracionLlamada;
        this.tiempoLlamada = tiempoLlamada;
        this.inicioLlamadaC1 = inicioLlamadaC1;
        this.finLlamada1 = finLlamada1;
        this.inicioLlamadaC2 = inicioLlamadaC2;
        this.finLlamada2 = finLlamada2;
        this.finCobro = finCobro;
        this.estadoCabina1 = estadoCabina1;
        this.estadoCabina2 = estadoCabina2;
        this.estadoEmpleado = estadoEmpleado;
        this.esperaCabina = esperaCabina;
        this.colaCliente = colaCliente;
        this.acuAtendidos = acuAtendidos;
        this.acuNoAtendidos = acuNoAtendidos;
        this.colaMaxima = colaMaxima;
        this.acuTiempoLlamada = acuTiempoLlamada;
        this.acuGanancia = acuGanancia;
        this.acuPerdida = acuPerdida;
        this.gananciaNeta = gananciaNeta;
        this.clientesTemporales = clientesTemporales;
        this.clientesCaja = clientesCaja;
        this.clientesEsperandoAsignacion = clientesEsperandoAsignacion;
    }

    public double getReloj() {
        return reloj;
    }

    public void setReloj(double reloj) {
        this.reloj = reloj;
    }

    public double getRndLlegadaCliente() {
        return rndLlegadaCliente;
    }

    public void setRndCliente(double rndLlegadaCliente) {
        this.rndLlegadaCliente = rndLlegadaCliente;
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

    public double getrndDuracionLlamada() {
        return rndDuracionLlamada;
    }

    public void setrndDuracionLlamada(double rndDuracionLlamada) {
        this.rndDuracionLlamada = rndDuracionLlamada;
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

    public double getAcuPerdida() {
        return acuPerdida;
    }

    public void setAcuPerdida(double acuPerdida) {
        this.acuPerdida = acuPerdida;
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

    public LinkedList<Clientes> getClientesTemporales() {
        return clientesTemporales;
    }

    public void setClientesTemporales(LinkedList<Clientes> clientesTemporales) {
        this.clientesTemporales = clientesTemporales;
    }

    public LinkedList<Clientes> getClientesCaja() {
        return clientesCaja;
    }

    public void setClientesCaja(LinkedList<Clientes> clientesCaja) {
        this.clientesCaja = clientesCaja;
    }
    
        public double getInicioLlamadaC1() {
        return inicioLlamadaC1;
    }

    public void setInicioLlamadaC1(double inicioLlamadaC1) {
        this.inicioLlamadaC1 = inicioLlamadaC1;
    }

    public double getInicioLlamadaC2() {
        return inicioLlamadaC2;
    }

    public void setInicioLlamadaC2(double inicioLlamadaC2) {
        this.inicioLlamadaC2 = inicioLlamadaC2;
    }

    public boolean isEsperaCabina() {
        return esperaCabina;
    }

    public void setEsperaCabina(boolean esperaCabina) {
        this.esperaCabina = esperaCabina;
    }

    public long getColaMaxima() {
        return colaMaxima;
    }

    public void setColaMaxima(long colaMaxima) {
        this.colaMaxima = colaMaxima;
    }

    public LinkedList<Clientes> getClientesEsperandoAsignacion() {
        return clientesEsperandoAsignacion;
    }

    public void setClientesEsperandoAsignacion(LinkedList<Clientes> clientesEsperandoAsignacion) {
        this.clientesEsperandoAsignacion = clientesEsperandoAsignacion;
    }
    
    
}
