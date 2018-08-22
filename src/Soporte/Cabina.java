package Soporte;

public class Cabina {

    private String c [];
    private Estado estado;
    private long colaClientes;
    private String estadoCabina, distribucion;

    public Cabina() {
        c = new String [2];
        estado = new Estado();
        colaClientes = 0;
        // Para la Cabina 1 y 2 indica estado Libre
        c[1] = estado.estado(1, 0);
        c[2] = estado.estado(1, 0);
        distribucion = "Exponencial Negativa con Media= 6";
    }

    public double aleatorio() {
        Double rnd = Math.random();
        rnd = rnd * 100;
        int truncador = rnd.intValue();
        rnd = truncador / 100.0;
        return rnd;
    }

    //media es 6 en el enunciado
    public double calcularTiempoLlegada(double random) {
        Double devolver = ((-6) * Math.log(1 - random));
        devolver = devolver * 100;
        int truncador = devolver.intValue();
        devolver = truncador / 100.0;
        return devolver;
    }

    public double calcularProxLlegada(double tiempo, double horaActual) {
        Double devolver = horaActual + tiempo;
        devolver = devolver * 100;
        int truncador = devolver.intValue();
        devolver = truncador / 100.0;
        return devolver;
    }

    // Uniforme[3,7]. MODIFICAR ACA PARA CAMBIAR EL VALOR DE LA DISTRIBUCION
    public double calcularTiempoLlamada(double random) {
        Double tiempo = 0.0;
        tiempo = (3.0 + (random * (7.0 - 3.0)));
        tiempo = tiempo * 100;
        int devolver = tiempo.intValue();
        tiempo = devolver / 100.0;
        return tiempo;
    }
    
    //
    public double calcularFinCobro(double tiempoCobro, double horaActual) {
        Double tiempo = horaActual + tiempoCobro;
        tiempo = tiempo * 100;
        int devolver = tiempo.intValue();
        tiempo = devolver / 100.0;
        return tiempo;
    }

    public String[] getC() {
        return c;
    }

    public void setC(String[] c) {
        this.c = c;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public long getColaClientes() {
        return colaClientes;
    }

    public void setColaClientes(long colaClientes) {
        this.colaClientes = colaClientes;
    }

    public String getEstadoCabina() {
        return estadoCabina;
    }

    public void setEstadoCabina(String estadoCabina) {
        this.estadoCabina = estadoCabina;
    }

    public String getDistribucion() {
        return distribucion;
    }

    public void setDistribucion(String distribucion) {
        this.distribucion = distribucion;
    }
    

}
