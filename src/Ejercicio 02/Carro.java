package Ejercicio_02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author juand
 */



public class Carro extends javax.swing.JFrame {
 
  
    
  

    public Carro() {
         
        initComponents();
    }
    class carra{
     int modelo;
  String marca;
  double kilometraje;
  String color;
  
  public carra(int modelo,
  String marca,
  double kilometraje,
  String color){
  this.modelo=modelo;
  this.marca=marca;
 this.kilometraje=kilometraje;
 this.color=color;}
  
 void setModelo(int modelo) {
        this.modelo = modelo;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    void setColor(String color) {
        this.color = color;
    }

    // Métodos getters
    public int getModelo() {
        return modelo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }
 
}

  
    
    
   
   
   
    @SuppressWarnings("unchecked")

    private void initComponents() {

        Jtextmarca = new javax.swing.JTextField();
        Jtextmodelo = new javax.swing.JTextField();
        Jtextcolor = new javax.swing.JTextField();
        Jtextcantidad = new javax.swing.JTextField();
        Jtextkilometraje = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Ordenamiento_btn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        Guardar_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Jtextmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextmarcaActionPerformed(evt);
            }
        });

        Jtextmodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextmodeloActionPerformed(evt);
            }
        });

        Jtextcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextcolorActionPerformed(evt);
            }
        });

        Jtextcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextcantidadActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese la cantidad de autos");

        jLabel2.setText("Ingrese la marca del auto");

        jLabel3.setText("Ingrese el modelo del auto (año modelo)");

        jLabel4.setText("Ingrese el color del auto");

        jLabel5.setText("Ingrese el kilometraje del auto");

        Ordenamiento_btn.setText("Ordenamiento Burbuja");
        Ordenamiento_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ordenamiento_btnActionPerformed(evt);
            }
        });

        Guardar_btn.setText("Guardar");
        Guardar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar_btnActionPerformed(evt);
            }
        });

        jLabel6.setText("Modelos");

        jLabel7.setText("Kilometraje");

        jLabel8.setText("Km");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jtextmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ordenamiento_btn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jtextmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(Jtextcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(69, 69, 69)
                        .addComponent(Guardar_btn)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Jtextkilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jtextcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(161, 161, 161))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jtextcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jtextmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(Jtextmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(Ordenamiento_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(Jtextcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jtextkilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtextcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextcantidadActionPerformed

    private void JtextmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextmarcaActionPerformed
       
    }//GEN-LAST:event_JtextmarcaActionPerformed
private int indice=0;
private carra carros[];
    private void Ordenamiento_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ordenamiento_btnActionPerformed
 
        int cantidad = Integer.parseInt(Jtextcantidad.getText());
        Kilometraje(carros);
        String resulKilometraje = "";
        for (int i=0; i<cantidad;i++) {
            resulKilometraje += carros[i].getKilometraje() + "--";
        }
        jTextField1.setText(resulKilometraje);

        
        Modelo(carros);
        String resulModelo = "";
      for (int i=0; i<cantidad;i++) {
            resulModelo += carros[i].getModelo() + "--";
        }
        jTextField2.setText(resulModelo);
 
       
    }//GEN-LAST:event_Ordenamiento_btnActionPerformed

    private void JtextmodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextmodeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextmodeloActionPerformed

    private void JtextcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextcolorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextcolorActionPerformed

    private void Guardar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar_btnActionPerformed
      int cantidad = Integer.parseInt(Jtextcantidad.getText());
      
       if (carros == null) { 
        carros = new carra[cantidad];
    }
      

        
            if (indice < cantidad) {  
            int modelo = Integer.parseInt(Jtextmodelo.getText());
            String marca = Jtextmarca.getText();
            double kilometraje = Double.parseDouble(Jtextkilometraje.getText());
            String color = Jtextcolor.getText();

            carros[indice] = new carra(modelo, marca, kilometraje, color);
            indice++;  

            
            Jtextmodelo.setText("");
            Jtextmarca.setText("");
            Jtextkilometraje.setText("");
            Jtextcolor.setText("");

            if (indice == cantidad) {
                Guardar_btn.setEnabled(false);  
               }


}
       
    }//GEN-LAST:event_Guardar_btnActionPerformed

    /**
     *
     * @param carros
     */
    public void Kilometraje(carra[] carros) {
    int n = carros.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - 1 - i; j++) {
            if (carros[j].getKilometraje() > carros[j + 1].getKilometraje()) {
               
                carra temp = carros[j];
                carros[j] = carros[j + 1];
                carros[j + 1] = temp;
            }
        }
    }
}

// Ordenamiento burbuja por modelo de menor a mayor
public void Modelo(carra[] carros) {
    int n = carros.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - 1 - i; j++) {
            if (carros[j].getModelo() > carros[j + 1].getModelo()) {
                
                carra temp = carros[j];
                carros[j] = carros[j + 1];
                carros[j + 1] = temp;
            }
        }
    }
}
  
  
  
  
  
  
  
  
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar_btn;
    private javax.swing.JTextField Jtextcantidad;
    private javax.swing.JTextField Jtextcolor;
    private javax.swing.JTextField Jtextkilometraje;
    private javax.swing.JTextField Jtextmarca;
    private javax.swing.JTextField Jtextmodelo;
    private javax.swing.JButton Ordenamiento_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
