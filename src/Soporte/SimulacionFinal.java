package Soporte;

import java.util.LinkedList;

public class SimulacionFinal {

    private Cabina cabina;
    private Empleado empleado;
    private double reloj, rndCliente, tiempoEntreLlegada, ProxLlegadaCliente, finAsignacionCabina, rndLlamada, finLlamada1, finLlamada2, finCobro;
    private double acuAtendidos, acuNoAtendidos, tiempoLlamada, acuTiempoLlamada, ganancia, acuGanancia, gananciaNeta;
    private String evento, estadoCabina1, estadoCabina2, estadoEmpleado;
    private long colaAsginacionEmpleado, colaCobroEmpleado;
    private LinkedList clientesTemporales, clientesColaCobro, clientesColaAsignacion, simulacion;
    private Filas inicializacion;
    private int numeroCliente;

    public SimulacionFinal(Cabina cabina, Empleado empleado, double reloj, double rndCliente, double tiempoEntreLlegada, double ProxLlegadaCliente, double finAsignacionCabina, double rndLlamada, double finLlamada1, double finLlamada2, double finCobro, double acuAtendidos, double acuNoAtendidos, double tiempoLlamada, double acuTiempoLlamada, double ganancia, double acuGanancia, double gananciaNeta, String evento, String estadoCabina1, String estadoCabina2, String estadoEmpleado, long colaAsginacionEmpleado, long colaCobroEmpleado, LinkedList clientesTemporales, LinkedList clientesColaCobro, LinkedList clientesColaAsignacion, LinkedList simulacion, Filas inicializacion, int numeroCliente) {
        cabina = new Cabina();
        empleado = new Empleado();
        reloj = 0.0;
        rndCliente = cabina.aleatorio();
        tiempoEntreLlegada = cabina.calcularTiempoLlegada(rndCliente);
        ProxLlegadaCliente = cabina.calcularProxLlegada(tiempoEntreLlegada, reloj);
        finAsignacionCabina = cabina.calcularFinAsignacionCabina(reloj);
        rndLlamada = cabina.aleatorio();
        finLlamada1 = -1.0;
        finLlamada2 = -1.0;
        finCobro = -1.0;
        acuAtendidos = 0.0;
        acuNoAtendidos = 0.0;
        tiempoLlamada = 0.0;
        acuTiempoLlamada = 0.0;
        ganancia = 0.0;
        acuGanancia = 0.0;
        gananciaNeta = 0.0;
        evento = " - ";
        estadoCabina1 = cabina.getEstadoCabina();
        estadoCabina2 = cabina.getEstadoCabina();
        estadoEmpleado = empleado.getEstadoEmpleado();
        colaAsginacionEmpleado = empleado.getColaAsgina();
        colaCobroEmpleado = empleado.getColaCobro();
        clientesTemporales = new LinkedList();
        clientesColaCobro = new LinkedList();
        clientesColaAsignacion = new LinkedList();
        simulacion = new LinkedList();
        inicializacion = new Filas(reloj, rndCliente, tiempoEntreLlegada, ProxLlegadaCliente, finAsignacionCabina, rndLlamada, finLlamada1, finLlamada2, finCobro, acuAtendidos, acuNoAtendidos, tiempoLlamada, acuTiempoLlamada, ganancia, acuGanancia, gananciaNeta, evento, estadoCabina1, estadoCabina2, estadoEmpleado, colaAsginacionEmpleado, colaCobroEmpleado, clientesTemporales, clientesColaCobro, clientesColaAsignacion);
        simulacion.add(inicializacion);
    }

    public void simular() {

    }

    //Porcentaje de personas que no consiguen cabina.
    public double puntoA() {
        Double porcentaje = acuNoAtendidos / (acuAtendidos + acuNoAtendidos);
        porcentaje = porcentaje * 10000;
        int truncador = porcentaje.intValue();
        porcentaje = truncador / 100.0;
        return porcentaje;
    }

    //Cola máxima en caja.
    public int puntoB() {
        int cola=0;
        
        return cola;

    }

    //Tiempo promedio de las comunicaciones.
    public double puntC() {
        Double promedio;
        return promedio = this.acuTiempoLlamada / acuAtendidos;
    }

    //Total de dinero acumulado en caja.
    public double puntoD() {

        Double pagar=0.0;

        if (tiempoLlamada <= 5) {
            pagar = 0.5;
        }
        if (tiempoLlamada > 5) {
            pagar = (0.02 / 10) * 60;
        }
        
        return pagar;
    }
    

}
