package Interfaz;

import Soporte.Cabina;
import Soporte.Clientes;
import Soporte.Empleado;
import Soporte.Filas;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    //Variables
    private Cabina cabina;
    private Empleado empleado;
    private double reloj, rndCliente, tiempoEntreLlegada, proxLlegadaCliente, finAsignacionCabina, rndLlamada, inicioLlamadaC1, inicioLlamadaC2,finLlamada1, finLlamada2, finCobro;
    private double acuAtendidos, acuNoAtendidos, tiempoLlamada, acuTiempoLlamada, acuPerdida, acuGanancia, gananciaNeta;
    private String evento, estadoCabina1, estadoCabina2, estadoEmpleado;
    private long colaCaja, colaMaxima;
    private boolean esperaCabina;
    private LinkedList<Clientes> clientesTemporales, clientesCaja, clientesCabina;
    private LinkedList simulacion;
    
    private int numeroCliente = 0;
    

    private Filas inicializacion;
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
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Evento", "Reloj", "RND Llegada Cliente", "Tiempo entre Llegada", "Prox Llegada Cliente", "Fin Asignacion Cabina", "RND Duracion Llamada", "Tiempo Llamada", "Inicio Llamada C1", "Fin Llamada C1", "Inicio Llamada C2", "Fin Llamada C2", "Fin Tiempo Cobro", "Estado Cabina 1", "Estado Cabina 2", "Estado Empleado", "Espera Cabina", "Cola Caja", "Acu Cli Aten", "Acu Cli No Aten", "Cola Maxima", "Acu Tiempo Llamada", "Acu Ganancia", "Acu Perdidas", "Ganancia Neta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Cliente", "Estado", "Inicio Cola / Llamada", "Duracion Llamada"
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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1409, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonSimular)
                                        .addGap(38, 38, 38)
                                        .addComponent(botonEnunciado))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
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
        //simular(mostrarDesde, mostrarHasta);
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
        //Variables de cajas
        cabina = new Cabina();
        empleado = new Empleado();
        
        //Variables del constructor fila
        evento = " - ";
        reloj = 0.0;
        rndCliente = cabina.aleatorio();
        tiempoEntreLlegada = cabina.calcularTiempoLlegada(rndCliente);
        proxLlegadaCliente = cabina.calcularProxLlegada(tiempoEntreLlegada, reloj);
        finAsignacionCabina = -1.0;
        rndLlamada = -1.0;
        tiempoLlamada = -1.0;
        inicioLlamadaC1 = -1.0;
        finLlamada1 = -1.0;
        inicioLlamadaC2 = -1.0;
        finLlamada2 = -1.0;
        finCobro = -1.0;
        estadoCabina1 = cabina.getEstadoCabina(0);
        estadoCabina2 = cabina.getEstadoCabina(1);
        estadoEmpleado = empleado.getEstadoEmpleado();
        esperaCabina = false;
        colaCaja = 0;
        acuAtendidos = 0.0;
        acuNoAtendidos = 0.0;
        colaMaxima = 0;
        acuTiempoLlamada = 0.0;
        acuGanancia = 0.0;
        acuPerdida = 0.0;
        gananciaNeta = 0.0;
        
        
        //Clientes
        clientesCaja = new LinkedList();
        clientesTemporales = new LinkedList();
        clientesCabina = new LinkedList();
        simulacion = new LinkedList();
        
        //Simulacion
        inicializacion = new Filas(evento,  reloj,  rndCliente,  tiempoEntreLlegada,  proxLlegadaCliente,  finAsignacionCabina,  rndLlamada, tiempoLlamada, inicioLlamadaC1, finLlamada1, inicioLlamadaC2, finLlamada2,  finCobro,  estadoCabina1,  estadoCabina2,  estadoEmpleado, esperaCabina, colaCaja, acuAtendidos, acuNoAtendidos, colaMaxima, acuTiempoLlamada, acuGanancia,  acuPerdida,  gananciaNeta, clientesTemporales,  clientesCaja, clientesCabina);
        simulacion.add(inicializacion);
        
        if(mostrarDesde == 0)
        {
            this.imprimirFila(evento,  reloj,  rndCliente,  tiempoEntreLlegada,  proxLlegadaCliente,  finAsignacionCabina,  rndLlamada, tiempoLlamada, inicioLlamadaC1, finLlamada1, inicioLlamadaC2, finLlamada2,  finCobro,  estadoCabina1,  estadoCabina2,  estadoEmpleado,  esperaCabina, colaCaja,  acuAtendidos,  acuNoAtendidos, colaMaxima, acuTiempoLlamada,  acuGanancia,  acuPerdida, gananciaNeta, clientesTemporales,clientesCaja, clientesCabina);
        }
    }
    
    //FALTA MODIFICAR
    public void imprimirFila(String evento, double reloj, double rndCliente, double tiempoEntreLlegada, double proxLlegadaCliente, double finAsignacionCabina, double rndLlamada, double tiempoLlamada, double inicioLlamadaC1, double finLlamada1, double inicioLlamadaC2, double finLlamada2, double finCobro, String estadoCabina1, String estadoCabina2, String estadoEmpleado, boolean esperaCabina, long colaCaja, double acuAtendidos, double acuNoAtendidos, long colaMaxima, double acuTiempoLlamada, double acuGanancia, double acuPerdida, double gananciaNeta, LinkedList<Clientes> clientesTemporales, LinkedList<Clientes> clientesCaja, LinkedList<Clientes> clientesAsignacion){
     
         Object[] fila = new Object[25];
        fila[0] = evento;
        fila[1] = reloj;
        
        if(rndCliente < 0)
        {fila[2] = " - ";}
        else{fila[2] = rndCliente;}
        
        if(tiempoEntreLlegada < 0)
        {fila[3] = " - ";}
        else{fila[3] = tiempoEntreLlegada;}
        
        if(proxLlegadaCliente < 0)
        {fila[4] = " - ";}
        else{fila[4] = proxLlegadaCliente;}
        
        if(finAsignacionCabina < 0)
        {fila[5] = " - ";}
        else{fila[5] = finAsignacionCabina;}
        
        if(rndLlamada < 0)
        {fila[6] = " - ";}
        else{fila[6] = rndLlamada;}
        
        if(tiempoLlamada < 0)
        {fila[7] = " - ";}
        else{fila[7] = tiempoLlamada;}
        
        if(inicioLlamadaC1 < 0)
        {fila[8] = " - ";}
        else{fila[8] = inicioLlamadaC1;}
        
        if(finLlamada1 < 0)
        {fila[9] = " - ";}
        else{fila[9]= finLlamada1;}
        
        if(inicioLlamadaC2 < 0)
        {fila[10] = " - ";}
        else{fila[10] = inicioLlamadaC2;}
        
        if(finLlamada2 < 0)
        {fila[11] = " - ";}
        else{fila[11] = finLlamada2;}
        
        if(finCobro < 0)
        {fila[12] = " - ";}
        else{fila[12] = finCobro;}
        
        fila[13] = estadoCabina1;
        fila[14] = estadoCabina2;
        fila[15] = estadoEmpleado;
        if(esperaCabina == true)
        {fila[16] = " SI ";}
        else {fila[16] = " NO ";}
        fila[17] = colaCaja;
        fila[18] = acuAtendidos;
        fila[19] = acuNoAtendidos;
        fila[20] = colaMaxima;
        fila[21] = acuTiempoLlamada;
        fila[22] = acuGanancia;
        fila[23] = acuPerdida;
        fila[24] = gananciaNeta;
        modelo1.addRow(fila);
        
        //Para la tabla de clientes
        //Clientes que estan siendo atendidos o llamando por telefono
        if(clientesTemporales.size() == 0)
        {
            Object [] clientesImprimir = new Object[4];
            clientesImprimir[0] = " - ";
            clientesImprimir[1] = " - ";
            clientesImprimir[2] = " - ";
            clientesImprimir[3] = " - ";
            modelo2.addRow(clientesImprimir);
        }
        else
        {
            Object [] clientesImprimir = new Object[4];
            for(int i = 0; i < clientesTemporales.size(); i++)
            {
                clientesImprimir[0] = clientesTemporales.get(i).getId();
                clientesImprimir[1] = clientesTemporales.get(i).getEstadoCliente();
                clientesImprimir[2] = clientesTemporales.get(i).getHoraInicioCola();
                clientesImprimir[3] = clientesTemporales.get(i).getDuracionLlamada();
                modelo2.addRow(clientesImprimir);
            }
        }
        
        //Clientes que estan esperando pagar
        if(clientesAsignacion.size() == 0)
        {
            Object [] clientesImprimir = new Object[4];
            clientesImprimir[0] = " - ";
            clientesImprimir[1] = " - ";
            clientesImprimir[2] = " - ";
            clientesImprimir[3] = " - ";
            modelo2.addRow(clientesImprimir);
        }
        else
        {
            Object [] clientesImprimir = new Object[4];
            for(int i = 0; i < clientesAsignacion.size(); i++)
            {
                clientesImprimir[0] = clientesAsignacion.get(i).getId();
                clientesImprimir[1] = clientesAsignacion.get(i).getEstadoCliente();
                clientesImprimir[2] = clientesAsignacion.get(i).getHoraInicioCola();
                clientesImprimir[3] = clientesAsignacion.get(i).getDuracionLlamada();
                modelo2.addRow(clientesImprimir);
            }
        }
        
        //Clientes que estan esperando que los asignen a una cabina
        if(clientesCaja.size() == 0)
        {
            Object [] clientesImprimir = new Object[4];
            clientesImprimir[0] = " - ";
            clientesImprimir[1] = " - ";
            clientesImprimir[2] = " - ";
            clientesImprimir[3] = " - ";
            modelo2.addRow(clientesImprimir);
        }
        else
        {
            Object [] clientesImprimir = new Object[4];
            for(int i = 0; i < clientesCaja.size(); i++)
            {
                clientesImprimir[0] = clientesCaja.get(i).getId();
                clientesImprimir[1] = clientesCaja.get(i).getEstadoCliente();
                clientesImprimir[2] = clientesCaja.get(i).getHoraInicioCola();
                clientesImprimir[3] = clientesCaja.get(i).getDuracionLlamada();
                modelo2.addRow(clientesImprimir);
            }
        }
        
        /*
        //Borrar si no sirve
        if(clientesCaja.size()!=0)
        {
            for(int i = 0; i < clientesCaja.size(); i++)
            {
                Object [] clientesImprimir = new Object[4];
                
                //Imprimir Reloj
                if(i == 0)
                {
                    clientesImprimir[0] = reloj;
                    clientesImprimir[1] = "";
                    clientesImprimir[2] = "";
                    clientesImprimir[3] = "";
                    modelo2.addRow(clientesImprimir);
                }

                //Cada Cliente de ese tiempo
                clientesImprimir = new Object[3];

                Clientes c = (Clientes) clientesCaja.get(i);
                clientesImprimir[0] = c.getId();
                //clientesImprimir[1] = c.estado();
                if(c.getHoraInicioLlamada() < 0)
                {clientesImprimir[2] = " - ";}
                else{clientesImprimir[2] = c.getHoraInicioLlamada();}
                modelo2.addRow(clientesImprimir);
                
            }
            
            Object [] clientesImprimir = new Object[4];
            clientesImprimir[0] = "";
            clientesImprimir[1] = "";
            clientesImprimir[2] = "";
            clientesImprimir[3] = "";
            modelo2.addRow(clientesImprimir);
        }
        else
        {
            Object [] clientesImprimir = new Object[4];
            clientesImprimir[0] = reloj;
            clientesImprimir[1] = "";
            clientesImprimir[2] = "";
            clientesImprimir[3] = "";
            modelo2.addRow(clientesImprimir);
            
            clientesImprimir[0] = "";
            clientesImprimir[1] = "";
            clientesImprimir[2] = "";
            clientesImprimir[3] = "";
            modelo2.addRow(clientesImprimir);
            
        }*/
    }
    
    //FALTA MODIFICAR
    public void simular(int desde, int hasta)
    {
        long t=0;
        
        while(t<hasta)
        {
            Filas anterior = (Filas) simulacion.getFirst();
            
            if((anterior.getProxLlegadaCliente() < anterior.getFinAsignacionCabina())&& (anterior.getProxLlegadaCliente()<anterior.getFinLlamada1()) && (anterior.getProxLlegadaCliente()<anterior.getFinLlamada2()) && (anterior.getProxLlegadaCliente()<anterior.getFinCobro()))
            {
                //Llega cliente
                evento = "Llega Cliente";
                reloj = anterior.getProxLlegadaCliente();
                rndCliente = cabina.aleatorio();
                tiempoEntreLlegada = cabina.calcularTiempoLlegada(rndCliente);
                proxLlegadaCliente = cabina.calcularProxLlegada(reloj, tiempoEntreLlegada);
                //FALTA FIN ASIGNACION
                rndLlamada = anterior.getrndDuracionLlamada();
                tiempoLlamada = anterior.getTiempoLlamada();
                inicioLlamadaC1 = anterior.getInicioLlamadaC1();
                finLlamada1 = anterior.getFinLlamada1();
                inicioLlamadaC2 = anterior.getInicioLlamadaC2();
                finLlamada2 = anterior.getFinLlamada2();
                finCobro = anterior.getFinCobro();
                estadoCabina1 = anterior.getEstadoCabina1();
                estadoCabina2 = anterior.getEstadoCabina2();
                
                Clientes llegado = new Clientes(-1.0, numeroCliente); 
                
                
                
                numeroCliente++;
                if(((cabina.getEstadoCabina(0).equalsIgnoreCase("Libre") && cabina.getEstadoCabina(1).equalsIgnoreCase("Libre")) && clientesCabina.size()<=2 ) || ((cabina.getEstadoCabina(0).equalsIgnoreCase("Libre") || cabina.getEstadoCabina(1).equalsIgnoreCase("Libre")) && clientesCabina.size()==0))
                {
                    
                    if(empleado.getEstadoEmpleado().equalsIgnoreCase("Libre"))
                    {
                        finAsignacionCabina = cabina.calcularFinAsignacionCabina(reloj);
                        empleado.setEstadoEmpleado(2);
                        estadoEmpleado = empleado.getEstadoEmpleado();
                        esperaCabina = false;
                                                
                        llegado.setHoraInicioCola(-1.0);
                        llegado.setEstadoCliente(0);
                        clientesTemporales.addLast(llegado);
                    }
                    else
                    {
                        finAsignacionCabina = anterior.getFinAsignacionCabina();
                        esperaCabina = true;
                        estadoEmpleado = anterior.getEstadoEmpleado();
                        llegado.setHoraInicioCola(reloj);
                        llegado.setEstadoCliente(1);
                        clientesCabina.addLast(llegado);
                    }
                        acuPerdida = anterior.getAcuPerdida();
                        gananciaNeta = anterior.getGananciaNeta();
                        acuNoAtendidos = anterior.getAcuNoAtendidos();
                }
                else
                {
                    acuNoAtendidos = anterior.getAcuNoAtendidos()+1;
                    acuPerdida = anterior.getAcuPerdida()+0.50;
                    gananciaNeta = anterior.getAcuGanancia()-acuPerdida;
                    esperaCabina = false;
                    estadoEmpleado = anterior.getEstadoEmpleado();
                }
                colaCaja = anterior.getColaCliente();
                acuAtendidos = anterior.getAcuAtendidos();
                colaMaxima = anterior.getColaMaxima();
                acuTiempoLlamada = anterior.getAcuTiempoLlamada();
                acuGanancia = anterior.getAcuGanancia();
                        
            }
            else
            {
                if((anterior.getFinAsignacionCabina() < anterior.getFinLlamada1()) && (anterior.getFinAsignacionCabina() < anterior.getFinLlamada2()) && (anterior.getFinAsignacionCabina() < anterior.getFinCobro()))
                {
                    //Asignando
                    evento = "Fin Asignacion";
                    reloj = anterior.getFinAsignacionCabina();
                    rndCliente = -1.0;
                    tiempoEntreLlegada = -1.0;
                    proxLlegadaCliente = anterior.getProxLlegadaCliente();
                    
                    Clientes asignado = new Clientes(-1.0,-1);
                    
                    for (int i = 0; i < clientesTemporales.size(); i++) {
                        if(clientesTemporales.get(i).getEstadoCliente().equalsIgnoreCase("Siendo Asignado"))
                        {
                            asignado.setHoraInicioCola(reloj);
                            asignado.setEstadoCliente(4);
                            clientesTemporales.set(i, asignado);
                            break;
                        }
                    }
                    
                    if(cabina.getEstadoCabina(0).equalsIgnoreCase("Libre") || cabina.getEstadoCabina(1).equalsIgnoreCase("Libre"))
                    {
                        rndLlamada = cabina.aleatorio();
                        tiempoLlamada = cabina.calcularTiempoLlamada(rndLlamada);
                        
                        if(cabina.getEstadoCabina(0).equalsIgnoreCase("Libre"))
                        {
                            inicioLlamadaC1 = reloj;
                            finLlamada1 = cabina.calcularFinLlamada(tiempoLlamada, reloj);
                            inicioLlamadaC2 = anterior.getInicioLlamadaC2();
                            finLlamada2 = anterior.getFinLlamada2();
                            cabina.setEstadoCabina(0, 1);
                            estadoCabina1 = cabina.getEstadoCabina(0);
                            estadoCabina2 = anterior.getEstadoCabina2();
                        }
                        else
                        {
                            inicioLlamadaC2 = reloj;
                            finLlamada2 = cabina.calcularFinLlamada(tiempoLlamada, reloj);
                            inicioLlamadaC1 = anterior.getInicioLlamadaC1();
                            finLlamada1 = anterior.getFinLlamada1();
                            cabina.setEstadoCabina(1, 1);
                            estadoCabina2 = cabina.getEstadoCabina(0);
                            estadoCabina1 = anterior.getEstadoCabina1();
                        }
                        
                        if(clientesCabina.size()!=0)
                        {
                            Clientes proximoAsignarCabina = new Clientes(-1.0, -1);
                            proximoAsignarCabina = clientesCabina.removeFirst();
                            proximoAsignarCabina.setEstadoCliente(0);
                            proximoAsignarCabina.setHoraInicioCola(-1.0);
                            clientesTemporales.addLast(proximoAsignarCabina);
                            empleado.setEstadoEmpleado(2);
                            estadoEmpleado = empleado.getEstadoEmpleado();
                            if(clientesCabina.size()==0)
                            {
                                esperaCabina = false;
                            }
                            else
                            {
                                esperaCabina = true;
                            }
                        }
                        else
                        {
                            if(clientesCaja.size()!=0)
                            {
                                Clientes proximoCobrar = new Clientes(-1.0, -1);
                                proximoCobrar = clientesCaja.removeFirst();
                                proximoCobrar.setEstadoCliente(5);
                                proximoCobrar.setHoraInicioCola(-1.0);
                                clientesTemporales.addLast(proximoCobrar);
                                empleado.setEstadoEmpleado(1);
                                estadoEmpleado = empleado.getEstadoEmpleado();
                                colaCaja = anterior.getColaCliente()-1;
                            }
                            else
                            {
                                empleado.setEstadoEmpleado(0);
                                estadoEmpleado = empleado.getEstadoEmpleado();
                                esperaCabina = false;
                            }
                        }
                        
                        acuAtendidos = anterior.getAcuAtendidos();
                        acuNoAtendidos = anterior.getAcuNoAtendidos();
                        colaMaxima = anterior.getColaMaxima();
                        acuTiempoLlamada = anterior.getAcuTiempoLlamada();
                        acuGanancia = anterior.getAcuGanancia();
                        acuPerdida = anterior.getAcuPerdida();
                        gananciaNeta = anterior.getGananciaNeta();
                }
                else
                {
                    if((anterior.getFinLlamada1() < anterior.getFinLlamada2()) && (anterior.getFinLlamada1() < anterior.getFinCobro()))
                    {
                        //Fin llamada C1
                    }
                    else
                    {
                        if(anterior.getFinLlamada2() < anterior.getFinCobro())
                        {
                            //Fin llamada C2
                        }
                        else
                        {
                            //Fin Cobro
                        }
                    }
                }
            }
            }
                /*
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
            }*/
            
            /*acumuladorAyudante = this.truncador(acumuladorAyudante);
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
            t++;*/
        }
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
