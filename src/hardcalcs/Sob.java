package hardcalcs;

import javax.swing.JFrame;


/**
 *
 * @author RenanZX
 */
public class Sob extends javax.swing.JFrame {

    /**
     * Creates new form Sob
     */
    public Sob() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Texto = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        Titulo = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Texto.setEditable(false);
        Texto.setBackground(new java.awt.Color(204, 204, 204));
        Texto.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(Texto);

        Titulo.setEditable(false);
        Titulo.setBackground(new java.awt.Color(204, 204, 204));
        Titulo.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        Titulo.setSelectionColor(new java.awt.Color(102, 102, 102));
        jScrollPane2.setViewportView(Titulo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void run(){
        Sob s = new Sob();
        s.setTitle("Sobre...");
        s.Titulo.setText("\tHardCalcs");
        s.Texto.setText("Projeto de calculadora experimental,capaz de Calcular diversas coisas,desde derivada e integral ate newton rasphton \n\n\n Desenvolvida por RenanZX");
        s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        s.toFront();
        s.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane Texto;
    private javax.swing.JTextPane Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
