package Soporte;

public class Cabina {

    private String c[];
    private Estado estado;
    //private String estadoCabina;

    public Cabina() {
        c = new String[2];
        // Para poder asignar estados
        estado = new Estado();
        // Para iniciar la Cabina 1 y 2 con estado Libre
        c[0] = estado.estado(0, 0);
        c[1] = estado.estado(0, 0);
    }

    public double aleatorio() {
        Double rnd = Math.random();
        rnd = rnd * 100;
        int truncador = rnd.intValue();
        rnd = truncador / 100.0;
        return rnd;
    }

    //EXPONENCIAL NEGATIVA MEDIA 6. MODIFICAR ACA PARA CAMBIAR EL VALOR DE LA DISTRIBUCION
    public double calcularTiempoLlegada(double random) {
        Double devolver = ((-6) * Math.log(1 - random));
        devolver = devolver * 100;
        int truncador = devolver.intValue();
        devolver = truncador / 100.0;
        return devolver;
    }

    //Le paso el valor del reloj actual y le sumo el tiempo de TiempoLlegada
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

    // TIEMPO DE COBRO ES 0,25MIN SIEMPRE. MODIFICAR ACA PARA CAMBIAR EL VALOR
    public double calcularFinCobro(double horaActual) {
        Double tiempo = horaActual + 0.25;
        tiempo = tiempo * 100;
        int devolver = tiempo.intValue();
        tiempo = devolver / 100.0;
        return tiempo;
    }

    public double calcularFinAsignacionCabina(double horaActual) {
        Double tiempo = horaActual + 0.16;
        tiempo = tiempo * 100;
        int devolver = tiempo.intValue();
        tiempo = devolver / 100.0;
        return tiempo;
    }

    public double calcularFinLlamada(double duracionLlamada, double reloj) {
        Double tiempo = reloj + duracionLlamada;
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

    /*public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }*/

    public String getEstadoCabina(int nroCabina) {
        return c[nroCabina];
    }

    public void setEstadoCabina(int nroCabina, int nroEstado) {
        c[nroCabina] = estado.estado(0, nroEstado);
    }


}
