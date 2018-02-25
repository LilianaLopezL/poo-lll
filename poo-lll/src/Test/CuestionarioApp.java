
package Test;

import Test.Modelo;
import Test.Opciones;
import Test.Preguntas;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class CuestionarioApp extends javax.swing.JFrame 
{

    public CuestionarioApp() {
        initComponents();
          
       Opciones op1=new Opciones("8 minutos y 20 segundos",true);
       Opciones op2=new Opciones("Menos de 1 segundo",false);
       Opciones op3=new Opciones("Seis minutos y 15 segundos",false);
       
       Opciones op4=new Opciones("La luna Titán de Saturno",false);
       Opciones op5=new Opciones("La luna Ganímedes de Júpiter",true);
       Opciones op6=new Opciones("La luna de la Tierra",false);
       
       Opciones op7=new Opciones("Una tormenta activa desde hace mas de 3 siglos",true);
       Opciones op8=new Opciones("La huella del impacto que dejo un cometa",false);
       Opciones op9=new Opciones("La Gran Mancha Roja no está en Júpiter",false);
       
       Opciones op10=new Opciones("Venus",true);
       Opciones op11=new Opciones("Marte",false);
       Opciones op12=new Opciones("Júpiter",false);
       
       Opciones op13=new Opciones("Ceres",true);
       Opciones op14=new Opciones("Marte",false);
       Opciones op15=new Opciones("Plutón",false);
       
       Opciones op16=new Opciones("Nix",false);
       Opciones op17=new Opciones("Caronte",true);
       Opciones op18=new Opciones("Calisto",false);
       
       Opciones op19=new Opciones("El planeta Venus",false);
       Opciones op20=new Opciones("La luna Titán de Saturno",false);
       Opciones op21=new Opciones("La luna Europa de Júpiter",true);
       
       ArrayList<Opciones> opcion1=new ArrayList<>();
       opcion1.add(op1);
       opcion1.add(op2);
       opcion1.add(op3);
       
       ArrayList<Opciones> opcion2=new ArrayList<>();
       opcion2.add(op4);
       opcion2.add(op5);
       opcion2.add(op6);
       
       ArrayList<Opciones> opcion3=new ArrayList<>();
       opcion3.add(op7);
       opcion3.add(op8);
       opcion3.add(op9);
       
       ArrayList<Opciones> opcion4=new ArrayList<>();
       opcion4.add(op10);
       opcion4.add(op11);
       opcion4.add(op12);
       
       ArrayList<Opciones> opcion5=new ArrayList<>();
       opcion5.add(op13);
       opcion5.add(op14);
       opcion5.add(op15);
       
       ArrayList<Opciones> opcion6=new ArrayList<>();
       opcion6.add(op16);
       opcion6.add(op17);
       opcion6.add(op18);

       ArrayList<Opciones> opcion7=new ArrayList<>();
       opcion7.add(op19);
       opcion7.add(op20);
       opcion7.add(op21);
       
       Preguntas p1=new Preguntas();
       p1.setTitulo("¿Cuánto tarda la luz del Sol en llegar a la Tierra?");
       p1.setOpciones(opcion1);
       
       Preguntas p2=new Preguntas();
       p2.setTitulo("El mayor satélite del Sistema Solar es...");
       p2.setOpciones(opcion2);
       
       Preguntas p3=new Preguntas();
       p3.setTitulo("¿Qué es la Gran Mancha Roja de Júpiter?");
       p3.setOpciones(opcion3);
       
       Preguntas p4=new Preguntas();
       p4.setTitulo("¿Cuál es el planeta que pasa más cerca de la Tierra?");
       p4.setOpciones(opcion4);
       
       Preguntas p5=new Preguntas();
       p5.setTitulo("¿A qué astro ha llegado este año la misión Dawn de la NASA?");
       p5.setOpciones(opcion5);
       
       Preguntas p6=new Preguntas();
       p6.setTitulo("¿Cuál es la mayor luna de Plutón?");
       p6.setOpciones(opcion6);
       
       Preguntas p7=new Preguntas();
       p7.setTitulo("¿En cuál de estos astros puede haber agua líquida y vida bajo la superficie?");
       p7.setOpciones(opcion7);
       
       Modelo modelo=new Modelo();
       modelo.agregarPregunta(p1);
       modelo.agregarPregunta(p2);
       modelo.agregarPregunta(p3);
       modelo.agregarPregunta(p4);
       modelo.agregarPregunta(p5);
       modelo.agregarPregunta(p6);
       modelo.agregarPregunta(p7);

       ArrayList<Preguntas> c= modelo.obtenerCuestionario();   
       ButtonGroup grupo=new ButtonGroup();
       
       tituloPregunta1.setText(p1.getTitulo());
       for(Opciones o:c.get(0).getOpciones())
       { 
       JRadioButton b=new JRadioButton(o.getTitulo());
       jPanel1.add(b);
       grupo.add(b);  
       }
/*
       tituloPregunta2.setText(p2.getTitulo());
       for(Opciones o:c.get(1).getOpciones())
       { 
       JRadioButton b=new JRadioButton(o.getTitulo());
       jPanel2.add(b);
       grupo.add(b);  
       }
       
       tituloPregunta3.setText(p3.getTitulo());
       for(Opciones o:c.get(2).getOpciones())
       { 
       JRadioButton b=new JRadioButton(o.getTitulo());
       jPanel3.add(b);
       grupo.add(b);  
       }
       
       tituloPregunta4.setText(p4.getTitulo());
       for(Opciones o:c.get(3).getOpciones())
       { 
       JRadioButton b=new JRadioButton(o.getTitulo());
       jPanel4.add(b);
       grupo.add(b);  
       }
       
       tituloPregunta5.setText(p5.getTitulo());
       for(Opciones o:c.get(4).getOpciones())
       { 
       JRadioButton b=new JRadioButton(o.getTitulo());
       jPanel5.add(b);
       grupo.add(b);  
       }
       
       tituloPregunta6.setText(p6.getTitulo());
       for(Opciones o:c.get(5).getOpciones())
       { 
       JRadioButton b=new JRadioButton(o.getTitulo());
       jPanel6.add(b);
       grupo.add(b);  
       }
       
       tituloPregunta7.setText(p7.getTitulo());
       for(Opciones o:c.get(6).getOpciones())
       { 
       JRadioButton b=new JRadioButton(o.getTitulo());
       jPanel7.add(b);
       grupo.add(b);  
       } */ 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tituloPregunta1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("C U E S T I O N A R I O");

        tituloPregunta1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tituloPregunta1.setText("jLabel2");

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jButton1.setText("Comprobar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(207, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tituloPregunta1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(198, 198, 198))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tituloPregunta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CuestionarioApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuestionarioApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuestionarioApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuestionarioApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuestionarioApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tituloPregunta1;
    // End of variables declaration//GEN-END:variables
}
