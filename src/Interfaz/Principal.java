package Interfaz;

import Soporte.Cabina;
import Soporte.Empleado;
import Soporte.Filas;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    //Variables
    private Cabina cabina;
    private Empleado empleado;
    private double reloj, rndCliente, tiempoEntreLlegada, proxLlegadaCliente, finAsignacionCabina, rndLlamada, finLlamada1, finLlamada2, finCobro;
    private double acuAtendidos, acuNoAtendidos, tiempoLlamada, acuTiempoLlamada, ganancia, acuGanancia, gananciaNeta;
    private String evento, estadoCabina1, estadoCabina2, estadoEmpleado;
    private long colaCliente;
    private LinkedList clientesTemporales, clientesCaja, simulacion;
    private Filas inicializacion;
    private int numeroCliente;
    DefaultTableModel modelo1 = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_CantSimulaciones = new javax.swing.JTextField();
        txt_MostrarDesde = new javax.swing.JTextField();
        txt_MostrarHasta = new javax.swing.JTextField();
        botonSimular = new javax.swing.JButton();
        botonEnunciado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grillaFilas = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        grillaCliente = new javax.swing.JTable();
        txt_Informe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Cantidad de Simulaciones:");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Mostrar fila desde:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Mostrar fila hasta:");

        botonSimular.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        botonSimular.setText("Simular");
        botonSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSimularActionPerformed(evt);
            }
        });

        botonEnunciado.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        botonEnunciado.setText("Enunciado 49");
        botonEnunciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnunciadoActionPerformed(evt);
            }
        });

        grillaFilas.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        grillaFilas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Evento", "Reloj", "RND Cliente", "Tiempo entre Llegada", "Prox Llegada Cliente", "Fin Asignacion Cabina", "RND Llamada", "Tiempo Llamada", "Fin Llamada C1", "Fin Llamada C2", "Fin Tiempo Cobro", "Estado Cabina 1", "Estado Cabina 2", "Estado Empleado", "Cola Asginacion Empleado", "Cola Cobro Empleado", "Acumulador Cli Aten", "Acumulador Cli No Aten", "Tiempo llamada", "Acu Tiempo Llamada", "Ganancia", "Acu Ganancia", "Ganancia Neta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grillaFilas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(grillaFilas);

        grillaCliente.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        grillaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Cliente", "Estado", "Hora Llegada"
            }
        ));
        jScrollPane3.setViewportView(grillaCliente);

        txt_Informe.setText("Informe");
        txt_Informe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_InformeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonSimular)
                                        .addGap(38, 38, 38)
                                        .addComponent(botonEnunciado)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_CantSimulaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txt_Informe))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_MostrarDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_MostrarHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_CantSimulaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_MostrarDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_MostrarHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSimular)
                    .addComponent(botonEnunciado)
                    .addComponent(txt_Informe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(351, 351, 351))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton para Iniciar la Simulacion
    private void botonSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSimularActionPerformed

        int cantSimulaciones = 0;
        int mostrarDesde = 0;
        int mostrarHasta = 0;
        try {
            cantSimulaciones = Integer.parseInt(txt_CantSimulaciones.getText());
            if (cantSimulaciones <= 0) {
                throw new Exception("");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor Incorrecto en 'Cantidad Simulaciones'");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad mayor que cero en 'Cantidad Simulaciones'");
        }

        try {
            mostrarDesde = Integer.parseInt(txt_MostrarDesde.getText());
            if (mostrarDesde < 0) {
                throw new Exception("");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor Incorrecto en 'Mostrar Fila Desde'");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un numero mayor o igual que cero en 'Mostrar Fila Desde'");
        }
        String excep = "";
        try {
            mostrarHasta = Integer.parseInt(txt_MostrarHasta.getText());
            if (mostrarHasta < mostrarDesde) {
                excep = "Ingrese un numero mayor o igual que 'Mostrar Fila Desde' en 'Mostrar Fila Hasta'";
                throw new Exception("");
            }

            if (mostrarHasta < 0) {
                excep = "Ingrese un numero mayor o igual que cero en 'Mostrar Fila Hasta'";
                throw new Exception("");
            }

            if (mostrarHasta > cantSimulaciones) {
                excep = "Ingrese en 'Mostrar Fila Hasta' un numero menor que 'Cantidad Simulaciones'";
                throw new Exception("");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor Incorrecto en 'Mostrar Fila Hasta'");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, excep);
        }
        //Hasta aca llegan las Validaciones

        //Simulacion
        //Creo la tabla para los Clientes
        modelo1 = (DefaultTableModel)grillaFilas.getModel();
        modelo1.setRowCount(0);

        //Creo la tabla para el proceso
        modelo2 = (DefaultTableModel)grillaCliente.getModel();
        modelo2.setRowCount(0);

        SimulacionFinal(cantSimulaciones, mostrarDesde, mostrarHasta);
        simular(mostrarDesde, mostrarHasta);
    }//GEN-LAST:event_botonSimularActionPerformed
    //Boton para ver el Enunciado
    private void botonEnunciadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnunciadoActionPerformed
        Enunciado enunciado = new Enunciado();
        enunciado.setLocationRelativeTo(null);
        enunciado.setVisible(true);
    }//GEN-LAST:event_botonEnunciadoActionPerformed

    //Boton para ver los resultados 
    private void txt_InformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_InformeActionPerformed
        String resultado[] = new String[6];
        resultado[0] = "Porcentaje de personas que no consiguen cabina:  " + "%";
        resultado[1] = "Cola máxima en caja:  " ;
        resultado[2] = "Tiempo promedio de las comunicaciones:  " ;
        resultado[3] = "Promedio Espera en Cola:  " ;
        resultado[4] = "Total de dinero acumulado en caja:  " +"$";
        resultado[5] = "Ganancia neta considerando el costo de perder clientes:  " +"$";
        JOptionPane.showMessageDialog(null, resultado);
    }//GEN-LAST:event_txt_InformeActionPerformed

    public void SimulacionFinal(int cantSimulaciones, int mostrarDesde, int mostrarHasta)
    {
        cabina = new Cabina();
        empleado = new Empleado();
        reloj = 0.0;
        rndCliente = cabina.aleatorio();
        tiempoEntreLlegada = cabina.calcularTiempoLlegada(rndCliente);
        proxLlegadaCliente = cabina.calcularProxLlegada(tiempoEntreLlegada, reloj);
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
        clientesCaja = new LinkedList();
        clientesTemporales = new LinkedList();
        simulacion = new LinkedList();
        inicializacion = new Filas( evento,  reloj,  rndCliente,  tiempoEntreLlegada,  proxLlegadaCliente,  finAsignacionCabina,  rndLlamada,  finLlamada1,  finLlamada2,  finCobro,  estadoCabina1,  estadoCabina2,  estadoEmpleado,  colaCliente,  acuAtendidos,  acuNoAtendidos,  tiempoLlamada,  acuTiempoLlamada,  ganancia,  acuGanancia,  gananciaNeta,  clientesTemporales,  clientesCaja);
        simulacion.add(inicializacion);
        
        if(mostrarDesde == 0)
        {
            this.imprimirFila( evento,  reloj,  rndCliente,  tiempoEntreLlegada,  proxLlegadaCliente,  finAsignacionCabina,  rndLlamada,  finLlamada1,  finLlamada2,  finCobro,  estadoCabina1,  estadoCabina2,  estadoEmpleado,  colaCliente,  acuAtendidos,  acuNoAtendidos,  tiempoLlamada,  acuTiempoLlamada,  ganancia,  acuGanancia,  gananciaNeta,  clientesTemporales,  clientesCaja);
        }
    }
    
    //FALTA MODIFICAR
    public void imprimirFila(String evento, double reloj, double rndCliente, double tiempoEntreLlegada, double proxLlegadaCliente, double finAsignacionCabina, double rndLlamada, double finLlamada1, double finLlamada2, double finCobro, String estadoCabina1, String estadoCabina2, String estadoEmpleado, long colaCliente, double acuAtendidos, double acuNoAtendidos, double tiempoLlamada, double acuTiempoLlamada, double ganancia, double acuGanancia, double gananciaNeta, LinkedList clientesTemporales, LinkedList clientesCaja){
     
         Object[] fila = new Object[17];
        fila[0] = r;
        fila[1] = pE;
        
        if(rndCli < 0)
        {fila[2] = " - ";}
        else{fila[2] = rndCli;}
        
        if(tLC < 0)
        {fila[3] = " - ";}
        else{fila[3] = tLC;}
        
        if(pLC < 0)
        {fila[4] = " - ";}
        else{fila[4] = pLC;}
        
        if(rndCaj < 0)
        {fila[5] = " - ";}
        else{fila[5] = rndCaj;}
        
        if(tCC < 0)
        {fila[6] = " - ";}
        else{fila[6] = tCC;}
        
        if(fCC < 0)
        {fila[7] = " - ";}
        else{fila[7] = fCC;}
        
        if(a)
        {fila[8] = "Si";}
        else{fila[8]= "No";}
        
        if(hIA < 0)
        {fila[9] = " - ";}
        else{fila[9] = hIA;}
        
        fila[10] = eC;
        fila[11] = cC;
        fila[12] = dC;
        fila[13] = aA;
        fila[14] = aE;
        fila[15] = cCA;
        fila[16] = tME;
        modelo1.addRow(fila);
        
        if(cT.size()!=0)
        {
            for(int i = 0; i < cT.size(); i++)
            {
                Object [] clientesImprimir = new Object[3];
                
                //Imprimir Reloj
                if(i == 0)
                {
                    clientesImprimir[0] = r;
                    clientesImprimir[1] = "";
                    clientesImprimir[2] = "";
                    modelo2.addRow(clientesImprimir);
                }

                //Cada Cliente de ese tiempo
                clientesImprimir = new Object[3];

                Clientes c = (Clientes) cT.get(i);
                clientesImprimir[0] = c.getId();
                clientesImprimir[1] = c.estado();
                if(c.getHoraInicioCola() < 0)
                {clientesImprimir[2] = " - ";}
                else{clientesImprimir[2] = c.getHoraInicioCola();}
                modelo2.addRow(clientesImprimir);
                
            }
            
            Object [] clientesImprimir = new Object[3];
            clientesImprimir[0] = "";
            clientesImprimir[1] = "";
            clientesImprimir[2] = "";
            modelo2.addRow(clientesImprimir);
        }
        else
        {
            Object [] clientesImprimir = new Object[3];
            clientesImprimir[0] = r;
            clientesImprimir[1] = "";
            clientesImprimir[2] = "";
            modelo2.addRow(clientesImprimir);
            
            clientesImprimir[0] = "";
            clientesImprimir[1] = "";
            clientesImprimir[2] = "";
            modelo2.addRow(clientesImprimir);
            
        }
    }
    
    //FALTA MODIFICAR
    public void simular(int desde, int hasta)
    {
        long t=0;
        while(t<hasta)
        {
            Filas anterior = (Filas) simulacion.getFirst();
            if( (anterior.getProxLlegadaCliente()< anterior.getFinCobroCajero() || anterior.getFinCobroCajero()< 0) && (anterior.getProximaLlegadaCliente()>=0) )
            {
                reloj = anterior.getProximaLlegadaCliente();
                proximoEvento = "Llegada Cliente";
                rndCliente = caja.aleatorio();
                tiempoLlegada = caja.calcularTiempoLlegada(rndCliente);
                proximaLlegada = caja.calcularProxLlegada(tiempoLlegada, reloj);
                Clientes nuevo = new Clientes (-1.0, numeroCliente);
                acumuladorAyudante = anterior.getAcumuladorAyudante();
                acumuladorEspera = anterior.getAcumuladorEspera();
                cantidadClientesAtendidos = anterior.getCantidadClientesAtendidos();
                if(anterior.getTiempoMaximoEspera()<0)
                {tiempoEsperaMaximo = 0.0;}
                else
                {tiempoEsperaMaximo = anterior.getTiempoMaximoEspera();}
                clientesCaja = anterior.getClientesCaja();
                clientesTemporales = anterior.getClientesTemporales();

                if(caja.getEstado().compareToIgnoreCase("Libre")==0)
                {
                    rndCajero = caja.aleatorio();
                    tiempoCobro = caja.calcularTiempoCobro(rndCajero);
                    finCobro = caja.calcularFinCobro(tiempoCobro, reloj);
                    caja.setAyudante(false);
                    ayudante = caja.isAyudante();
                    horaInicioAyudante = -1.0;
                    caja.setEstado(1);
                    estadoCajero = caja.getEstado();
                    colaCajero = anterior.getColaCajero();
                    distribucionCajero = caja.getDistribucion();
                    nuevo.setEstado(0);
                    clientesTemporales.addLast(nuevo);
                }
                else
                {
                    rndCajero = -1.0;
                    tiempoCobro = -1.0;
                    finCobro = anterior.getFinCobroCajero();
                    ayudante = anterior.isAyudanteOcupado();
                    horaInicioAyudante = anterior.getHoraInicioAyudante();
                    estadoCajero = anterior.getEstadoCajero();
                    colaCajero = (anterior.getColaCajero()+1);
                    distribucionCajero = anterior.getDistribucionCajero();
                    nuevo.setHoraInicioCola(reloj);
                    nuevo.setEstado(1);
                    clientesTemporales.addLast(nuevo);
                    clientesCaja.addLast(nuevo);
                }
                numeroCliente++;
            }
            else
            {
                if(anterior.getFinCobroCajero()>0)
                {
                    reloj = anterior.getFinCobroCajero();
                    proximoEvento = "Fin Cobro";
                    rndCliente = -1.0;
                    tiempoLlegada = -1.0;
                    proximaLlegada = anterior.getProximaLlegadaCliente();
                    cantidadClientesAtendidos = anterior.getCantidadClientesAtendidos()+1;
                    clientesCaja = anterior.getClientesCaja();
                    clientesTemporales = anterior.getClientesTemporales();
                   
                    int eliminar = 0;
                    for(int i = 0; i < clientesTemporales.size(); i++)
                    {
                        Clientes aux = (Clientes) clientesTemporales.get(i);
                        if(aux.estado().compareToIgnoreCase("Siendo Atendido")==0)
                        {
                            eliminar = i;
                            break;
                        }
                    }
                    clientesTemporales.remove(eliminar);
                    
                    if(anterior.getColaCajero()==0)
                    {
                        rndCajero = -1.0;
                        tiempoCobro = -1.0;
                        finCobro = -1.0;
                        caja.setAyudante(false);
                        ayudante = caja.isAyudante();
                        horaInicioAyudante = -1.0;
                        caja.setEstado(0);
                        estadoCajero = caja.getEstado();
                        colaCajero = 0;
                        distribucionCajero = " - ";
                        if(anterior.getHoraInicioAyudante()>0.0)
                        {
                            acumuladorAyudante = (reloj - anterior.getHoraInicioAyudante());
                        }
                        acumuladorEspera = anterior.getAcumuladorEspera();
                        tiempoEsperaMaximo = anterior.getTiempoMaximoEspera();
                    }
                    else
                    {
                        if(!anterior.isAyudanteOcupado())
                        {
                            if(anterior.getColaCajero()>=3)
                            {
                                caja.setAyudante(true);
                                rndCajero = caja.aleatorio();
                                tiempoCobro = caja.calcularTiempoCobro(rndCajero);
                                finCobro = caja.calcularFinCobro(tiempoCobro, reloj);
                                ayudante = caja.isAyudante();
                                horaInicioAyudante = reloj;
                                estadoCajero = anterior.getEstadoCajero();
                                colaCajero = (anterior.getColaCajero()-1);
                                distribucionCajero = caja.getDistribucion();
                                acumuladorAyudante = anterior.getAcumuladorAyudante();
                                Clientes aAtender = (Clientes) clientesCaja.removeFirst();
                                double tiempoEnCola = (reloj-aAtender.getHoraInicioCola());
                                acumuladorEspera = anterior.getAcumuladorEspera()+tiempoEnCola;
                                if(anterior.getTiempoMaximoEspera()< tiempoEnCola)
                                {tiempoEsperaMaximo = tiempoEnCola;}
                                else{tiempoEsperaMaximo = anterior.getTiempoMaximoEspera();}
                                int posicionTemporal = clientesTemporales.indexOf(aAtender);
                                aAtender.setEstado(0);
                                aAtender.setHoraInicioCola(-1.0);
                                clientesTemporales.set(posicionTemporal, aAtender);
                            }
                            else
                            {
                                rndCajero = caja.aleatorio();
                                rndCajero = caja.aleatorio();
                                tiempoCobro = caja.calcularTiempoCobro(rndCajero);
                                finCobro = caja.calcularFinCobro(tiempoCobro, reloj);
                                ayudante = anterior.isAyudanteOcupado();
                                horaInicioAyudante = anterior.getHoraInicioAyudante();
                                estadoCajero = anterior.getEstadoCajero();
                                colaCajero = (anterior.getColaCajero()-1);
                                distribucionCajero = anterior.getDistribucionCajero();
                                acumuladorAyudante = anterior.getAcumuladorAyudante();
                                Clientes aAtender = (Clientes) clientesCaja.removeFirst();
                                double tiempoEnCola = (reloj-aAtender.getHoraInicioCola());
                                acumuladorEspera = anterior.getAcumuladorEspera()+tiempoEnCola;
                                if(anterior.getTiempoMaximoEspera()< tiempoEnCola)
                                {tiempoEsperaMaximo = tiempoEnCola;}
                                else{tiempoEsperaMaximo = anterior.getTiempoMaximoEspera();}
                                int posicionTemporal = clientesTemporales.indexOf(aAtender);
                                aAtender.setEstado(0);
                                aAtender.setHoraInicioCola(-1.0);
                                clientesTemporales.set(posicionTemporal, aAtender);
                            }
                        }
                        else
                        {
                            rndCajero = caja.aleatorio();
                            tiempoCobro = caja.calcularTiempoCobro(rndCajero);
                            finCobro = caja.calcularFinCobro(tiempoCobro, reloj);
                            ayudante = anterior.isAyudanteOcupado();
                            horaInicioAyudante = anterior.getHoraInicioAyudante();
                            estadoCajero = anterior.getEstadoCajero();
                            colaCajero = (anterior.getColaCajero()-1);
                            distribucionCajero = anterior.getDistribucionCajero();
                            acumuladorAyudante = anterior.getAcumuladorAyudante();
                            Clientes aAtender = (Clientes) clientesCaja.removeFirst();
                            double tiempoEnCola = (reloj-aAtender.getHoraInicioCola());
                            acumuladorEspera = anterior.getAcumuladorEspera()+tiempoEnCola;
                            if(anterior.getTiempoMaximoEspera()< tiempoEnCola)
                            {tiempoEsperaMaximo = tiempoEnCola;}
                            else{tiempoEsperaMaximo = anterior.getTiempoMaximoEspera();}
                            int posicionTemporal = clientesTemporales.indexOf(aAtender);
                            aAtender.setEstado(0);
                            aAtender.setHoraInicioCola(-1.0);
                            clientesTemporales.set(posicionTemporal, aAtender);
                        }
                    }
                }
            }
            
            acumuladorAyudante = this.truncador(acumuladorAyudante);
            acumuladorEspera = this.truncador(acumuladorEspera);
            tiempoEsperaMaximo = this.truncador(tiempoEsperaMaximo);
            
            Filas nueva = new Filas (reloj, proximoEvento, rndCliente, tiempoLlegada, proximaLlegada, rndCajero, tiempoCobro,finCobro, ayudante, horaInicioAyudante, estadoCajero, colaCajero, distribucionCajero, acumuladorAyudante, acumuladorEspera, cantidadClientesAtendidos, tiempoEsperaMaximo, clientesCaja, clientesTemporales);
            if(desde == 0)
            {
                if(t >= desde && t <hasta)
                {
                    this.imprimirFila(reloj, proximoEvento, rndCliente, tiempoLlegada, proximaLlegada, rndCajero, tiempoCobro,finCobro, ayudante, horaInicioAyudante, estadoCajero, colaCajero, distribucionCajero, acumuladorAyudante, acumuladorEspera, cantidadClientesAtendidos, tiempoEsperaMaximo, clientesTemporales);
                }
            }
            else
            {
                if(t >= (desde-1) && t <hasta)
                {
                    this.imprimirFila(reloj, proximoEvento, rndCliente, tiempoLlegada, proximaLlegada, rndCajero, tiempoCobro,finCobro, ayudante, horaInicioAyudante, estadoCajero, colaCajero, distribucionCajero, acumuladorAyudante, acumuladorEspera, cantidadClientesAtendidos, tiempoEsperaMaximo, clientesTemporales);
                }
            }
            simulacion.addLast(nueva);
            if(simulacion.size()==2)
            {
                simulacion.removeFirst();
            }
            t++;
        }
    }
    
    //FALTA MODIFICAR
    public void imprimirFila(){
        
    }
    
    public double truncador(double valorATruncar)
    {
        Double aTruncar = valorATruncar;
        aTruncar = aTruncar*100;
        int truncado = aTruncar.intValue();
        aTruncar = truncado / 100.0;
        return aTruncar;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEnunciado;
    private javax.swing.JButton botonSimular;
    private javax.swing.JTable grillaCliente;
    private javax.swing.JTable grillaFilas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txt_CantSimulaciones;
    private javax.swing.JButton txt_Informe;
    private javax.swing.JTextField txt_MostrarDesde;
    private javax.swing.JTextField txt_MostrarHasta;
    // End of variables declaration//GEN-END:variables
}
