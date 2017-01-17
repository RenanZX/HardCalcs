package hardcalcs;

import java.awt.Color;
import java.awt.event.KeyEvent;
import static java.lang.Float.parseFloat;

/*tela principal da calculadora*/
public class TelaP extends javax.swing.JFrame { /*classe a qual representa a tela principal com extensao jframe*/

    float aux = 0;  /*variavel auxiliar*/
    public static final int SOMA = 1;   /*constantes para identificar as operacoes*/
    public static final int SUB = 2;
    public static final int DIV = 3;
    public static final int MULT = 4;
    public static final int POT = 5;
    int op = 0; /*variavel a qual diferenciara as operacoes feitas*/
    
    public TelaP() {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        VisorCalc = new java.awt.TextField();
        CE = new java.awt.Button();
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
        button13 = new java.awt.Button();
        button14 = new java.awt.Button();
        button15 = new java.awt.Button();
        button16 = new java.awt.Button();
        Pot = new java.awt.Button();
        raiz = new java.awt.Button();
        PotQ = new java.awt.Button();
        pi = new java.awt.Button();
        fi = new java.awt.Button();
        log = new java.awt.Button();
        sen = new java.awt.Button();
        cos = new java.awt.Button();
        euler = new java.awt.Button();
        BarraDeSel = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        Sob = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setNextFocusableComponent(BarraDeSel);
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel1KeyReleased(evt);
            }
        });

        VisorCalc.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        VisorCalc.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                VisorCalcTextValueChanged(evt);
            }
        });
        VisorCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisorCalcActionPerformed(evt);
            }
        });

        CE.setActionCommand("CE");
        CE.setLabel("CE");
        CE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CEMouseClicked(evt);
            }
        });

        button1.setActionCommand("num1");
        button1.setLabel("1");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });

        button2.setActionCommand("num2");
        button2.setLabel("2");
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });

        button3.setActionCommand("num3");
        button3.setLabel("3");
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
        });

        button4.setActionCommand("num4");
        button4.setLabel("4");
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button4MouseClicked(evt);
            }
        });

        button5.setActionCommand("num5");
        button5.setLabel("5");
        button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button5MouseClicked(evt);
            }
        });

        button6.setActionCommand("num6");
        button6.setLabel("6");
        button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button6MouseClicked(evt);
            }
        });

        button7.setActionCommand("num7");
        button7.setLabel("7");
        button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button7MouseClicked(evt);
            }
        });

        button8.setActionCommand("num8");
        button8.setLabel("8");
        button8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button8MouseClicked(evt);
            }
        });

        button9.setActionCommand("num9");
        button9.setLabel("9");
        button9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button9MouseClicked(evt);
            }
        });

        button10.setActionCommand("num0");
        button10.setLabel("0");
        button10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button10MouseClicked(evt);
            }
        });

        button11.setActionCommand("div");
        button11.setLabel("÷");
        button11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button11MouseClicked(evt);
            }
        });

        button12.setActionCommand("mult");
        button12.setLabel("×");
        button12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button12MouseClicked(evt);
            }
        });

        button13.setActionCommand("som");
        button13.setLabel("+");
        button13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button13MouseClicked(evt);
            }
        });

        button14.setActionCommand("sub");
        button14.setLabel("-");
        button14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button14MouseClicked(evt);
            }
        });

        button15.setActionCommand("igual");
        button15.setLabel("=");
        button15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button15MouseClicked(evt);
            }
        });

        button16.setActionCommand("ponto");
        button16.setLabel(".");
        button16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button16MouseClicked(evt);
            }
        });

        Pot.setLabel("X^Y");
        Pot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PotMouseReleased(evt);
            }
        });

        raiz.setActionCommand("raiz");
        raiz.setLabel("√¯");
        raiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                raizMouseReleased(evt);
            }
        });

        PotQ.setLabel("X^2");
        PotQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PotQMouseReleased(evt);
            }
        });

        pi.setActionCommand("pi");
        pi.setLabel(" π");
        pi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                piMouseReleased(evt);
            }
        });

        fi.setActionCommand("fi");
        fi.setLabel("Φ");
        fi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fiMouseReleased(evt);
            }
        });

        log.setActionCommand("log");
        log.setLabel("log");
        log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logMouseReleased(evt);
            }
        });

        sen.setActionCommand("seno");
        sen.setLabel("sin");
        sen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                senMouseReleased(evt);
            }
        });

        cos.setActionCommand("cos");
        cos.setLabel("cos");
        cos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cosMouseReleased(evt);
            }
        });

        euler.setActionCommand("euler");
        euler.setLabel("e");
        euler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eulerMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(VisorCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button16, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                    .addComponent(pi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                    .addComponent(fi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sen, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Pot, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(log, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PotQ, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button13, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(button12, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(button11, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(button14, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(button15, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(euler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VisorCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(button16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(raiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PotQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        BarraDeSel.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        BarraDeSel.setDoubleBuffered(true);
        BarraDeSel.setNextFocusableComponent(BarraDeSel);

        jMenu1.setText("Opções");

        jMenuItem5.setText("Calcular Matrizes");
        jMenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem5MouseReleased(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem4.setText("Calcular Derivada");
        jMenu1.add(jMenuItem4);

        jMenuItem3.setText("Calcular Integral");
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("Calcular Newton-Rasphton");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Sair");
        jMenu1.add(jMenuItem2);

        BarraDeSel.add(jMenu1);

        Sob.setText("Sobre");
        Sob.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                SobMenuSelected(evt);
            }
        });
        BarraDeSel.add(Sob);

        setJMenuBar(BarraDeSel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*funcao para apertar o botao definida no menu de selecao*/
    private void SobMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_SobMenuSelected
        /*abre uma nova janela*/
        hardcalcs.Sob.run();
    }//GEN-LAST:event_SobMenuSelected
/*reseta a variavel auxiliar e a operaçao que estava sendo feita*/
    private void CEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CEMouseClicked
        if(op==0){
            aux = 0;
        }
        VisorCalc.setText("");
    }//GEN-LAST:event_CEMouseClicked
/*seta valores na tela da calculadora*/
    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        VisorCalc.setText(VisorCalc.getText()+"1");
    }//GEN-LAST:event_button1MouseClicked

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
        VisorCalc.setText(VisorCalc.getText()+"2");
    }//GEN-LAST:event_button2MouseClicked

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
        VisorCalc.setText(VisorCalc.getText()+"3");
    }//GEN-LAST:event_button3MouseClicked

    private void button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseClicked
        VisorCalc.setText(VisorCalc.getText()+"4");
    }//GEN-LAST:event_button4MouseClicked

    private void button5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseClicked
        VisorCalc.setText(VisorCalc.getText()+"5");
    }//GEN-LAST:event_button5MouseClicked

    private void button6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseClicked
        VisorCalc.setText(VisorCalc.getText()+"6");
    }//GEN-LAST:event_button6MouseClicked

    private void button7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseClicked
        VisorCalc.setText(VisorCalc.getText()+"7");
    }//GEN-LAST:event_button7MouseClicked

    private void button8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button8MouseClicked
        VisorCalc.setText(VisorCalc.getText()+"8");
    }//GEN-LAST:event_button8MouseClicked

    private void button9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button9MouseClicked
        VisorCalc.setText(VisorCalc.getText()+"9");
    }//GEN-LAST:event_button9MouseClicked

    private void button10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button10MouseClicked
        VisorCalc.setText(VisorCalc.getText()+"0");
    }//GEN-LAST:event_button10MouseClicked

    private void button16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button16MouseClicked
        VisorCalc.setText(VisorCalc.getText()+".");
    }//GEN-LAST:event_button16MouseClicked
/*captura o numero da tela da calculadora e converte em float adicionando esse valor a aux*/
    private void button13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button13MouseClicked
        aux = parseFloat(VisorCalc.getText());
        VisorCalc.setText("");
        op = SOMA;  /*operacao e feita e setada*/
    }//GEN-LAST:event_button13MouseClicked

    private void button11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button11MouseClicked
        aux = parseFloat(VisorCalc.getText());
        VisorCalc.setText("");
        op = DIV;
    }//GEN-LAST:event_button11MouseClicked

    private void button12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button12MouseClicked
        aux = parseFloat(VisorCalc.getText());
        VisorCalc.setText("");
        op = MULT;
    }//GEN-LAST:event_button12MouseClicked

    private void button14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button14MouseClicked
        aux = parseFloat(VisorCalc.getText());
        VisorCalc.setText("");
        op = SUB;
    }//GEN-LAST:event_button14MouseClicked
/*verifica qual operacao foi feita pela usuario e devolve o resultado no visor da calculadora*/
    private void button15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button15MouseClicked
        float aux2 = parseFloat(VisorCalc.getText());
        float result = 0;
        switch(op){
            case SOMA:
                result = aux + aux2;
                break;
            case SUB:
                result = aux - aux2;
                break;
            case MULT:
                result = aux * aux2;
                break;
            case DIV:
                result = aux / aux2;
                break;
            case POT:
                result = (float) Math.pow(aux, aux2);
            default:
                VisorCalc.setText("");
        }
        VisorCalc.setText(""+result);
        aux = 0;
        op = 0;
    }//GEN-LAST:event_button15MouseClicked

    private void jMenuItem5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseReleased
        hardcalcs.Cmat.run();
    }//GEN-LAST:event_jMenuItem5MouseReleased

    private void VisorCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisorCalcActionPerformed

    }//GEN-LAST:event_VisorCalcActionPerformed

    private void VisorCalcTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_VisorCalcTextValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_VisorCalcTextValueChanged

    private void jPanel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyReleased
        switch(evt.getKeyCode()){
            case KeyEvent.VK_0:
                VisorCalc.setText(VisorCalc.getText()+"0");
                break;
            case KeyEvent.VK_1:
                VisorCalc.setText(VisorCalc.getText()+"1");
                break;
            case KeyEvent.VK_2:
                VisorCalc.setText(VisorCalc.getText()+"2");
                break;
            case KeyEvent.VK_3:
                VisorCalc.setText(VisorCalc.getText()+"3");
                break;
            case KeyEvent.VK_4:
                VisorCalc.setText(VisorCalc.getText()+"4");
                break;
            case KeyEvent.VK_5:
                VisorCalc.setText(VisorCalc.getText()+"5");
                break;
            case KeyEvent.VK_6:
                VisorCalc.setText(VisorCalc.getText()+"6");
                break;
            case KeyEvent.VK_7:
                VisorCalc.setText(VisorCalc.getText()+"7");
                break;
            case KeyEvent.VK_8:
                VisorCalc.setText(VisorCalc.getText()+"8");
                break;
            case KeyEvent.VK_9:
                VisorCalc.setText(VisorCalc.getText()+"9");
                break;
        }
    }//GEN-LAST:event_jPanel1KeyReleased

    private void piMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_piMouseReleased
        VisorCalc.setText(""+Math.PI);
    }//GEN-LAST:event_piMouseReleased

    private void fiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiMouseReleased
        VisorCalc.setText("1.618033");
    }//GEN-LAST:event_fiMouseReleased

    private void eulerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eulerMouseReleased
        VisorCalc.setText(""+Math.E);
    }//GEN-LAST:event_eulerMouseReleased

    private void senMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senMouseReleased
        aux = parseFloat(VisorCalc.getText());
        VisorCalc.setText("sen("+aux+") = "+Math.sin(aux));
    }//GEN-LAST:event_senMouseReleased

    private void cosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cosMouseReleased
        aux = parseFloat(VisorCalc.getText());
        VisorCalc.setText("cos("+aux+") = "+Math.cos(aux));
    }//GEN-LAST:event_cosMouseReleased

    private void raizMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_raizMouseReleased
        aux = parseFloat(VisorCalc.getText());
        VisorCalc.setText(""+Math.sqrt(aux));
    }//GEN-LAST:event_raizMouseReleased

    private void PotQMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PotQMouseReleased
        aux = parseFloat(VisorCalc.getText());
        VisorCalc.setText(""+Math.pow(aux, 2));
    }//GEN-LAST:event_PotQMouseReleased

    private void PotMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PotMouseReleased
        aux = parseFloat(VisorCalc.getText());
        VisorCalc.setText("");
        op = POT;
    }//GEN-LAST:event_PotMouseReleased

    private void logMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logMouseReleased
        aux = parseFloat(VisorCalc.getText());
        VisorCalc.setText("log10("+aux+") = "+Math.log10(aux));
    }//GEN-LAST:event_logMouseReleased
    /*funcao que construira o objeto da tela ao qual apresentara as suas funcionalidades ao usuario*/
    public static void run(){
        TelaP t = new TelaP();
        t.setTitle("HardCalcs");
        t.VisorCalc.setEditable(false);
        t.VisorCalc.setBackground(Color.WHITE);
        t.BarraDeSel.setFocusable(true);
        t.toBack();
        t.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraDeSel;
    private java.awt.Button CE;
    private java.awt.Button Pot;
    private java.awt.Button PotQ;
    private javax.swing.JMenu Sob;
    private java.awt.TextField VisorCalc;
    private java.awt.Button button1;
    private java.awt.Button button10;
    private java.awt.Button button11;
    private java.awt.Button button12;
    private java.awt.Button button13;
    private java.awt.Button button14;
    private java.awt.Button button15;
    private java.awt.Button button16;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private java.awt.Button button7;
    private java.awt.Button button8;
    private java.awt.Button button9;
    private java.awt.Button cos;
    private java.awt.Button euler;
    private java.awt.Button fi;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private java.awt.Button log;
    private java.awt.Button pi;
    private java.awt.Button raiz;
    private java.awt.Button sen;
    // End of variables declaration//GEN-END:variables
}
