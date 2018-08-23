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

    //cantSimulaciones = Cantidad de simulaciones a realizar
    //mostarDesde = Mostrar desde la fila tanto
    //mostrarHasta = Mostrar hasta la fila tanto
    public SimulacionFinal(int cantSimulaciones, int mostrarDesde, int mostrarHasta) {

        reloj = 0.0;
        evento = " - ";
        rndCliente = cabina.aleatorio();
        tiempoEntreLlegada = cabina.calcularTiempoLlegada(rndCliente);
        ProxLlegadaCliente = cabina.calcularProxLlegada(tiempoEntreLlegada, reloj);
        finAsignacionCabina = cabina.calcularFinAsignacionCabina(reloj);
        //VER COMO HACER CON LAS LLAMADAS PORQUE TENGO 2 CABINAS
        rndLlamada = cabina.aleatorio();
        finLlamada1 = -1.0;
        finLlamada2 = -1.0;
        tiempoLlamada = cabina.calcularTiempoLlamada(rndLlamada);
        finCobro = -1.0;
        //Variables Estadisticas
        acuAtendidos = 0.0;
        acuNoAtendidos = 0.0;
        acuTiempoLlamada = 0.0;
        ganancia = 0.0;
        acuGanancia = 0.0;
        gananciaNeta = 0.0;
        //Asigno los estados a los Objetos(Permanente y Temporal)
        estadoCabina1 = cabina.getEstadoCabina();
        estadoCabina2 = cabina.getEstadoCabina();
        estadoEmpleado = empleado.getEstadoEmpleado();
        //Asigno cola a cada Objeto
        colaAsginacionEmpleado = empleado.getColaAsgina();
        colaCobroEmpleado = empleado.getColaCobro();
        //Creo los Objetos
        cabina = new Cabina();
        empleado = new Empleado();
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
        int cola = 0;

        return cola;

    }

    //Tiempo promedio de las comunicaciones.
    public double puntC() {
        Double promedio;
        return promedio = this.acuTiempoLlamada / acuAtendidos;
    }

    //Total de dinero acumulado en caja.
    public double puntoD() {

        Double pagar = 0.0;

        if (tiempoLlamada <= 5) {
            pagar = 0.5;
        }
        if (tiempoLlamada > 5) {
            pagar = (0.02 / 10) * 60;
        }

        return pagar;
    }

}
