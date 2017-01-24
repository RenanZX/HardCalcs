
package hardcalcs;

import java.awt.event.KeyEvent;
import static java.lang.Float.parseFloat;
import javax.swing.JFrame;

/*Painel Escalonamento de matrizes*/
public class Cmat_EscPanel2x2 extends javax.swing.JFrame {

    
    public Cmat_EscPanel2x2() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        x1 = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        VisorCalc = new javax.swing.JTextArea();
        x2 = new java.awt.TextField();
        y1 = new java.awt.TextField();
        y2 = new java.awt.TextField();
        z1 = new java.awt.TextField();
        z2 = new java.awt.TextField();
        button2x2 = new java.awt.Button();
        button3x3 = new java.awt.Button();
        equals = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Insert = new java.awt.Button();
        CE = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        x1.setText("X1");
        x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                x1KeyReleased(evt);
            }
        });

        VisorCalc.setColumns(20);
        VisorCalc.setRows(5);
        jScrollPane1.setViewportView(VisorCalc);

        x2.setText("X2");
        x2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                x2KeyReleased(evt);
            }
        });

        y1.setText("Y1");
        y1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                y1KeyReleased(evt);
            }
        });

        y2.setText("Y2");
        y2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                y2KeyReleased(evt);
            }
        });

        z1.setText("Z1");
        z1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                z1KeyReleased(evt);
            }
        });

        z2.setText("Z2");
        z2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                z2KeyReleased(evt);
            }
        });

        button2x2.setActionCommand("button2x2");
        button2x2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        button2x2.setLabel("2x2");

        button3x3.setActionCommand("button3x3");
        button3x3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        button3x3.setLabel("3x3");
        button3x3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button3x3MouseReleased(evt);
            }
        });

        equals.setActionCommand("equals");
        equals.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        equals.setLabel("=");
        equals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                equalsMouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        jLabel1.setText("(");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        jLabel2.setText(")");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        jLabel3.setText("|");

        Insert.setActionCommand("inserir");
        Insert.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Insert.setLabel("Inserir");
        Insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                InsertMouseReleased(evt);
            }
        });

        CE.setActionCommand("CE");
        CE.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        CE.setLabel("CE");
        CE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CEMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(x1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(z1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button2x2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button3x3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(x2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(y2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(z2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jLabel3))
                            .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button2x2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button3x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(equals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*declaracao de variaveis a serem ultilizadas*/
    float x1n=0,y1n=0,z1n=0,x2n=0,y2n=0,z2n=0;
    
    /*metodos que serao ultilizados nos botoes e talvez re-ultilizados*/
    private float EventKeyX(java.awt.event.KeyEvent evt,java.awt.TextField x){  /*recebe dois objetos como parametro*/
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){    /*testa se o usuario apertou enter*/
            return (parseFloat(x.getText()));   /*retorna o valor que o usuario inseriu no bloco*/
        }
        return 0;   /*caso contrario retorna 0*/
    }
    /*recebe tres parametros uma string um float e um objeto do tipo evento*/
    private void EventTextVisor(String c,float number,java.awt.event.KeyEvent evt){
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){  /*verifica se o usuario apertou enter*/  
            if((number == x1n)&&(!"".equals(VisorCalc.getText()))){ /*Verifica os valores de number e do bloco de texto VisorCalc*/
                VisorCalc.setText(c+"="+number+"\n");   /*caso seja verdadeiro seta os valores para o usuario*/
            }else{
                VisorCalc.setText(VisorCalc.getText()+c+"="+number+"\n"); /*caso contrario concatena a string contida no bloco de texto acrecendo oque o usuario inseriu*/
            }
        }
    }
    
    private void PrintValues(){ /*printa todos os valores das variaveis para o usuario tanto no bloco grande quanto nos pequenos*/
        VisorCalc.setText("");
        VisorCalc.setText(VisorCalc.getText()+"x1="+x1n+"\n");
        x1.setText(""+x1n);
        VisorCalc.setText(VisorCalc.getText()+"y1="+y1n+"\n");
        y1.setText(""+y1n);
        VisorCalc.setText(VisorCalc.getText()+"z1="+z1n+"\n");
        z1.setText(""+z1n);
        VisorCalc.setText(VisorCalc.getText()+"x2="+x2n+"\n");
        x2.setText(""+x2n);
        VisorCalc.setText(VisorCalc.getText()+"y2="+y2n+"\n");
        y2.setText(""+y2n);
        VisorCalc.setText(VisorCalc.getText()+"z2="+z2n+"\n");
        z2.setText(""+z2n);
    }
    
    private void CEvent(){  /*reseta as variáveis*/
        x1n = 0;
        x1.setText("");
        x2n = 0;
        x2.setText("");
        y1n = 0;
        y1.setText("");
        y2n = 0;
        y2.setText("");
        z1n = 0;
        z1.setText("");
        z2n = 0;
        z2.setText("");
        VisorCalc.setText("");
    }
    /*assim que acionada a funcao sera responsavel por chamar os metodos para o calculo do escalonamento*/
    private void EventEquals(){
        Opt2x();
    }
    
    private void Opt2x(){   /*metodo que calcula o escalonamento*/
        float n = (x2n/x1n)*(-1);   /*armazena a razao de x2 com x1 multiplica por -1 e joga em um float*/
        x2n += n*x1n;   /*incrementa x2,y2 e z2,para zerar x2*/
        y2n += n*y1n;
        z2n += n*z1n;
        if(x2n!=0){ /*verifica se o float e diferente de zero*/
            x2n = Math.abs(x2n); /*calcula o modulo do float*/
        }
        if(y2n!=0){
            y2n = Math.abs(y2n);
        }
        if(z2n!=0){
            z2n = Math.abs(z2n);
        }
        n = (y1n/y2n)*(-1); /*n recebe a razao y1 e y2 multiplicada por -1*/
        x1n += n*x2n;   /*mesmo procedimento porem dessa vez tentamos zerar y1*/
        y1n += n*y2n;
        z1n += n*z2n;
        if((x1n!=1)||(y1n!=1)||(x2n!=1)||(y2n!=1)){
            z1n = z1n/x1n;/*divide os valores restantes de cada coeficiente*/
            x1n = x1n/x1n;
            z2n = z2n/y2n;
            y2n = y2n/y2n;
        }
        PrintValues();
    }
    
    private void Opt3x(){
        hardcalcs.Cmat_EscPanel3x3.run();
        this.setVisible(false);
        this.dispose();
    }
    /*selecao de blocos,responsavel por pegar os valores inseridos pelo o usuario*/
    private void x1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x1KeyReleased
        x1n = EventKeyX(evt,x1);/*funcao responsavel por setar o valor na variavel*/
        EventTextVisor("x1",x1n,evt); /*funcao responsavel por mostrar o valor ao usuario atraves do bloco de texto*/
    }//GEN-LAST:event_x1KeyReleased

    private void y1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y1KeyReleased
        y1n = EventKeyX(evt,y1);
        EventTextVisor("y1",y1n,evt);
    }//GEN-LAST:event_y1KeyReleased

    private void x2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x2KeyReleased
        x2n = EventKeyX(evt,x2);
        EventTextVisor("x2",x2n,evt);
    }//GEN-LAST:event_x2KeyReleased

    private void y2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y2KeyReleased
        y2n = EventKeyX(evt,y2);
        EventTextVisor("y2",y2n,evt);
    }//GEN-LAST:event_y2KeyReleased

    private void z1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_z1KeyReleased
        z1n = EventKeyX(evt,z1);
        EventTextVisor("z1",z1n,evt);
    }//GEN-LAST:event_z1KeyReleased

    private void z2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_z2KeyReleased
        z2n = EventKeyX(evt,z2);
        EventTextVisor("z2",z2n,evt);
    }//GEN-LAST:event_z2KeyReleased
/*assim que selecionado,o botao sera responsavel por chamar os metodos para o calculo do escalonamento*/
    private void equalsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalsMouseReleased
        EventEquals();
    }//GEN-LAST:event_equalsMouseReleased
/*botao de insercao de dados,os dados serao inseridos e mostrados ao usuario seus valores nos blocos de texto*/
    private void InsertMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertMouseReleased
        x1n = parseFloat(x1.getText());
        VisorCalc.setText("x1="+x1n+"\n");
        y1n = parseFloat(y1.getText());
        VisorCalc.setText(VisorCalc.getText()+"y1="+y1n+"\n");
        z1n = parseFloat(z1.getText());
        VisorCalc.setText(VisorCalc.getText()+"z1="+z1n+"\n");
        x2n = parseFloat(x2.getText());
        VisorCalc.setText(VisorCalc.getText()+"x2="+x2n+"\n");
        y2n = parseFloat(y2.getText());
        VisorCalc.setText(VisorCalc.getText()+"y2="+y2n+"\n");
        z2n = parseFloat(z2.getText());
        VisorCalc.setText(VisorCalc.getText()+"z2="+z2n+"\n");
    }//GEN-LAST:event_InsertMouseReleased

    private void button3x3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3x3MouseReleased
        Opt3x();
    }//GEN-LAST:event_button3x3MouseReleased
/*botao CE que resetera todas as variaveis e os blocos de texto*/
    private void CEMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CEMouseReleased
        CEvent();
    }//GEN-LAST:event_CEMouseReleased
/*funcao run responsavel por criar a janela*/
    public static void run(){
        Cmat_EscPanel2x2 c = new Cmat_EscPanel2x2();
        c.setTitle("HardCalcs-Calcular Matrizes - Escalonar");
        c.setSize(600, 400);
        c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        c.toFront();
        c.VisorCalc.setText("x1 + y1  =  z1\nx2 + y2  =  z2");
        c.VisorCalc.setEditable(false);
        c.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button CE;
    private java.awt.Button Insert;
    private javax.swing.JTextArea VisorCalc;
    private java.awt.Button button2x2;
    private java.awt.Button button3x3;
    private java.awt.Button equals;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.TextField x1;
    private java.awt.TextField x2;
    private java.awt.TextField y1;
    private java.awt.TextField y2;
    private java.awt.TextField z1;
    private java.awt.TextField z2;
    // End of variables declaration//GEN-END:variables
}
