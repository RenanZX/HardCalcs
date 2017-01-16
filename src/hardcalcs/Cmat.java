package hardcalcs;

import java.awt.Color;
import java.awt.event.KeyEvent;
import static java.lang.Float.parseFloat;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;

/*classe ao qual sera responsavel por prover a funçao de calcular matrizes*/
public class Cmat extends javax.swing.JFrame {

    
    public Cmat() {
        initComponents();
    }
    /*declaraçao de constantes*/
    public static final int TAM2X = 2;
    public static final int TAM3X = 3;
    
    public static final int SOMA = 1;
    public static final int SUB = 2;
    public static final int DIV = 3;
    public static final int MULT = 4;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();
        button6 = new java.awt.Button();
        button7 = new java.awt.Button();
        button8 = new java.awt.Button();
        button9 = new java.awt.Button();
        button10 = new java.awt.Button();
        button11 = new java.awt.Button();
        button12 = new java.awt.Button();
        button16 = new java.awt.Button();
        button13 = new java.awt.Button();
        button14 = new java.awt.Button();
        button15 = new java.awt.Button();
        button17 = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        VisorCalc = new javax.swing.JTextArea();
        button18 = new java.awt.Button();
        OKButton = new java.awt.Button();
        BarNum = new java.awt.TextField();
        limp = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        button1.setLabel("2x2");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button1MouseReleased(evt);
            }
        });

        button2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        button2.setLabel("3x3");
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button2MouseReleased(evt);
            }
        });

        button3.setActionCommand("num1");
        button3.setLabel("1");
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button3MouseReleased(evt);
            }
        });

        button4.setActionCommand("num2");
        button4.setLabel("2");
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button4MouseReleased(evt);
            }
        });

        button5.setActionCommand("num3");
        button5.setLabel("3");
        button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button5MouseReleased(evt);
            }
        });

        button6.setActionCommand("num4");
        button6.setLabel("4");
        button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button6MouseReleased(evt);
            }
        });

        button7.setActionCommand("num5");
        button7.setLabel("5");
        button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button7MouseReleased(evt);
            }
        });

        button8.setActionCommand("num6");
        button8.setLabel("6");
        button8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button8MouseReleased(evt);
            }
        });

        button9.setActionCommand("num7");
        button9.setLabel("7");
        button9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button9MouseReleased(evt);
            }
        });

        button10.setActionCommand("num8");
        button10.setLabel("8");
        button10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button10MouseReleased(evt);
            }
        });

        button11.setActionCommand("num9");
        button11.setLabel("9");
        button11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button11MouseReleased(evt);
            }
        });

        button12.setActionCommand("num0");
        button12.setLabel("0");
        button12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button12MouseReleased(evt);
            }
        });

        button16.setActionCommand("ponto");
        button16.setLabel(".");
        button16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button16MouseReleased(evt);
            }
        });

        button13.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        button13.setLabel("+");
        button13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button13MouseReleased(evt);
            }
        });

        button14.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        button14.setLabel("×");
        button14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button14MouseReleased(evt);
            }
        });

        button15.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        button15.setLabel("-");

        button17.setLabel("Escalonar");

        VisorCalc.setColumns(20);
        VisorCalc.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        VisorCalc.setRows(5);
        jScrollPane1.setViewportView(VisorCalc);

        button18.setActionCommand("=");
        button18.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        button18.setLabel("=");
        button18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button18MouseReleased(evt);
            }
        });

        OKButton.setActionCommand("OK");
        OKButton.setLabel("OK");
        OKButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                OKButtonMouseReleased(evt);
            }
        });

        BarNum.setFont(new java.awt.Font("MS Gothic", 0, 18)); // NOI18N
        BarNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BarNumKeyReleased(evt);
            }
        });

        limp.setActionCommand("Limpar");
        limp.setLabel("Limpar");
        limp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(limp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(BarNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button16, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button18, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(OKButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(button16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BarNum, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(limp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /*declaraçao de variaveis*/
    boolean OPS = false;
    int limtam = 0,limtam2X = 0;
    int counter = 0,auxcount = 0;
    int oper = 0;
    ListaM matr = new ListaM(); /*matrizes as quais serao incorporadas por listas*/
    ListaM matrAux = new ListaM();
    /*botao ao qual definira o tamanho da matriz a ser calculada*/
    
    private void button1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseReleased
        OPS = true;
        limtam2X = TAM2X * TAM2X;
        limtam = TAM2X;
        VisorCalc.setText("");
    }//GEN-LAST:event_button1MouseReleased

    private void button2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseReleased
        OPS = true;
        limtam2X = TAM3X * TAM3X;
        limtam = TAM3X;
        VisorCalc.setText("");
    }//GEN-LAST:event_button2MouseReleased
    
    private void RealeseTesteTam(float valor){
        switch(limtam){
            case TAM2X:
                if(auxcount >= 2){
                    VisorCalc.setText(VisorCalc.getText()+"\n"); /*pula uma linha caso chegue no limite de colunas pre estabelecido*/
                    auxcount = 0;
                }
                matr.insereElemento(valor, TAM2X);
                break;
            case TAM3X:
                if(auxcount >= 3){
                    VisorCalc.setText(VisorCalc.getText()+"\n");
                    auxcount = 0;
                }
                matr.insereElemento(valor, TAM3X);
                break;
        }
        counter++; /*incrementa os contadores*/
        auxcount++;
    }
/*botoes numericos da calculadora que colocara na tela oque o usuario apertar*/    
    private void button3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseReleased
        if((OPS==true)&&(counter < limtam2X)){
            BarNum.setText(BarNum.getText()+"1");
        }
    }//GEN-LAST:event_button3MouseReleased

    private void button14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button14MouseReleased
        if(OPS==true){
            VisorCalc.setText("");
            matrAux.copiarMat(matr,limtam); /*copia a matriz original*/
            matr = null; /*seta-a como nulo*/
            matr = new ListaM(); /*cria uma nova matriz*/
            oper = MULT; /*defini a operacao*/
            counter = 0; /*zera os contadores*/
            auxcount = 0;
        }
    }//GEN-LAST:event_button14MouseReleased

    private void button18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button18MouseReleased
        ListaM Result = new ListaM();
        switch(oper){   /*identifica a operacao*/
            case SOMA:
                Result = matrAux.somar(matr);
                break;
            case SUB:
                Result = matrAux.subtrair(matr);
                break;
            case MULT:
                Result = matrAux.multiplicar(matr,limtam); /*faz a operacao escolhida pelo usuario e mostra o resultado*/
                break;
        }
        VisorCalc.setText(Result.getMatrix()+"\n");
        matr = new ListaM();
        matrAux = new ListaM();
        OPS = false;
        counter = 0;
        auxcount = 0;
        limtam = 0;
        limtam2X = 0;
    }//GEN-LAST:event_button18MouseReleased

    private void button4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseReleased
        if((OPS==true)&&(counter < limtam2X)){
            BarNum.setText(BarNum.getText()+"2");
        }
    }//GEN-LAST:event_button4MouseReleased

    private void button5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseReleased
        if((OPS==true)&&(counter < limtam2X)){
            BarNum.setText(BarNum.getText()+"3");
        }
    }//GEN-LAST:event_button5MouseReleased

    private void button6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseReleased
        if((OPS==true)&&(counter < limtam2X)){
            BarNum.setText(BarNum.getText()+"4");
        }
    }//GEN-LAST:event_button6MouseReleased

    private void button7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseReleased
        if((OPS==true)&&(counter < limtam2X)){
            BarNum.setText(BarNum.getText()+"5");
        }
    }//GEN-LAST:event_button7MouseReleased

    private void button8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button8MouseReleased
        if((OPS==true)&&(counter < limtam2X)){
            BarNum.setText(BarNum.getText()+"6");
        }
    }//GEN-LAST:event_button8MouseReleased

    private void button9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button9MouseReleased
        if((OPS==true)&&(counter < limtam2X)){
            BarNum.setText(BarNum.getText()+"7");
        }
    }//GEN-LAST:event_button9MouseReleased

    private void button10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button10MouseReleased
        if((OPS==true)&&(counter < limtam2X)){
            BarNum.setText(BarNum.getText()+"8");
        }
    }//GEN-LAST:event_button10MouseReleased

    private void button11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button11MouseReleased
        if((OPS==true)&&(counter < limtam2X)){
            BarNum.setText(BarNum.getText()+"9");
        }
    }//GEN-LAST:event_button11MouseReleased

    private void button12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button12MouseReleased
        if((OPS==true)&&(counter < limtam2X)){
            BarNum.setText(BarNum.getText()+"0");
        }
    }//GEN-LAST:event_button12MouseReleased

    private void button13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button13MouseReleased
        if(OPS==true){
            VisorCalc.setText("");
            matrAux.copiarMat(matr,limtam);
            matr = null;
            matr = new ListaM();
            oper = SOMA;
            counter = 0;
            auxcount = 0;
        }
    }//GEN-LAST:event_button13MouseReleased

    private void button16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button16MouseReleased
        if((OPS==true)&&(counter < limtam2X)){
            BarNum.setText(BarNum.getText()+".");
        }
    }//GEN-LAST:event_button16MouseReleased

    private void OKButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKButtonMouseReleased
        String content;
        if((OPS==true)&&(counter < limtam2X)){
            content = BarNum.getText();
            RealeseTesteTam(parseFloat(content));
            VisorCalc.setText(VisorCalc.getText()+content+" ");
            BarNum.setText("");
        }
    }//GEN-LAST:event_OKButtonMouseReleased

    private void limpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpMouseClicked
        BarNum.setText("");
    }//GEN-LAST:event_limpMouseClicked

    private void BarNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BarNumKeyReleased
        switch(evt.getKeyCode()){
            case KeyEvent.VK_ENTER:
                String content;
                if((OPS==true)&&(counter < limtam2X)){
                    content = BarNum.getText();
                    RealeseTesteTam(parseFloat(content));
                    VisorCalc.setText(VisorCalc.getText()+content+" ");
                    BarNum.setText("");
                }
                break;
            case KeyEvent.VK_X:
                if(OPS==true){
                    BarNum.setText("");
                    VisorCalc.setText("");
                    matrAux.copiarMat(matr,limtam);
                    matr = null;
                    matr = new ListaM();
                    oper = MULT;
                    counter = 0;
                    auxcount = 0;
                }
                break;
            case KeyEvent.VK_EQUALS:
                ListaM Result = new ListaM();
                switch(oper){   /*identifica a operacao*/
                    case SOMA:
                        Result = matrAux.somar(matr);
                        break;
                    case SUB:
                        Result = matrAux.subtrair(matr);
                        break;
                    case MULT:
                        Result = matrAux.multiplicar(matr,limtam); /*faz a operacao escolhida pelo usuario e mostra o resultado*/
                        break;
                }
                VisorCalc.setText(Result.getMatrix()+"\n");
                matr = new ListaM();
                matrAux = new ListaM();
                OPS = false;
                counter = 0;
                auxcount = 0;
                limtam = 0;
                limtam2X = 0;
                break;
        }
    }//GEN-LAST:event_BarNumKeyReleased

    /*constroi a nova tela da calculadora*/
    public static void run(){
        Cmat c = new Cmat();
        c.setTitle("HardCalcs-Calcular Matrizes");
        c.setSize(600, 400);
        c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        c.toFront();
        c.VisorCalc.setEditable(false);
        c.VisorCalc.setBackground(Color.WHITE);
        c.VisorCalc.setText("Escolha o tamanho da matriz\nno painel ao lado...");
        c.setVisible(true);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField BarNum;
    private java.awt.Button OKButton;
    private javax.swing.JTextArea VisorCalc;
    private java.awt.Button button1;
    private java.awt.Button button10;
    private java.awt.Button button11;
    private java.awt.Button button12;
    private java.awt.Button button13;
    private java.awt.Button button14;
    private java.awt.Button button15;
    private java.awt.Button button16;
    private java.awt.Button button17;
    private java.awt.Button button18;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private java.awt.Button button7;
    private java.awt.Button button8;
    private java.awt.Button button9;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Button limp;
    // End of variables declaration//GEN-END:variables
}
