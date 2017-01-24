
package hardcalcs;

import java.awt.event.KeyEvent;
import static java.lang.Float.parseFloat;
import javax.swing.JFrame;

/*Painel Escalonamento de matrizes*/
public class Cmat_EscPanel3x3 extends javax.swing.JFrame {

    
    public Cmat_EscPanel3x3() {
        initComponents();
    }
   
    public static final int EliminarElePivo2 = 0;
    public static final int EliminarElePivo3 = 1;
    public static final int EliminarEleLin32 = 2;
    public static final int CalcPivo1 = 3;
    public static final int CalcPivo2 = 4;

    
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
        x3 = new java.awt.TextField();
        y3 = new java.awt.TextField();
        z3 = new java.awt.TextField();
        w1 = new java.awt.TextField();
        w2 = new java.awt.TextField();
        w3 = new java.awt.TextField();

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
        button2x2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button2x2MouseReleased(evt);
            }
        });

        button3x3.setActionCommand("button3x3");
        button3x3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        button3x3.setLabel("3x3");

        equals.setActionCommand("equals");
        equals.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        equals.setLabel("=");
        equals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                equalsMouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 60)); // NOI18N
        jLabel1.setText("(");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 60)); // NOI18N
        jLabel2.setText(")");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 60)); // NOI18N
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

        x3.setText("X3");
        x3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                x3KeyReleased(evt);
            }
        });

        y3.setText("Y3");
        y3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                y3KeyReleased(evt);
            }
        });

        z3.setText("Z3");
        z3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                z3KeyReleased(evt);
            }
        });

        w1.setText("W1");
        w1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                w1KeyReleased(evt);
            }
        });

        w2.setText("W2");
        w2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                w2KeyReleased(evt);
            }
        });

        w3.setText("W3");
        w3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                w3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(x1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(w3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(z1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(z3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button2x2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button3x3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button2x2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button3x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equals, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(x3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(y3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(z3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(w1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(w2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(w3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*declaracao de variaveis a serem ultilizadas*/
    LineClass l1 = new LineClass();
    LineClass l2 = new LineClass();
    LineClass l3 = new LineClass();
    
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
            if((number == l1.x)&&(!"".equals(VisorCalc.getText()))){ /*Verifica os valores de number e do bloco de texto VisorCalc*/
                VisorCalc.setText(c+"="+number+"\n");   /*caso seja verdadeiro seta os valores para o usuario*/
            }else{
                VisorCalc.setText(VisorCalc.getText()+c+"="+number+"\n"); /*caso contrario concatena a string contida no bloco de texto acrecendo oque o usuario inseriu*/
            }
        }
    }
    
    private void PrintValuesAllScreens(){ /*printa todos os valores das variaveis para o usuario tanto no bloco grande quanto nos pequenos*/
        VisorCalc.setText("");
        PrintValuesUpScreen();
        PrintValuesDownScreen();
    }
    
    private void PrintValuesDownScreen(){
        VisorCalc.setText(VisorCalc.getText()+"x1="+l1.x+"\n");
        VisorCalc.setText(VisorCalc.getText()+"y1="+l1.y+"\n");
        VisorCalc.setText(VisorCalc.getText()+"w1="+l1.w+"\n");
        VisorCalc.setText(VisorCalc.getText()+"z1="+l1.z+"\n");
        VisorCalc.setText(VisorCalc.getText()+"x2="+l2.x+"\n");
        VisorCalc.setText(VisorCalc.getText()+"y2="+l2.y+"\n");
        VisorCalc.setText(VisorCalc.getText()+"w2="+l2.w+"\n");
        VisorCalc.setText(VisorCalc.getText()+"z2="+l2.z+"\n");
        VisorCalc.setText(VisorCalc.getText()+"x3="+l3.x+"\n");
        VisorCalc.setText(VisorCalc.getText()+"y3="+l3.y+"\n");
        VisorCalc.setText(VisorCalc.getText()+"w3="+l3.w+"\n");
        VisorCalc.setText(VisorCalc.getText()+"z3="+l3.z+"\n");
    }
    
    private void PrintValuesUpScreen(){
        x1.setText(""+l1.x);
        y1.setText(""+l1.y);
        w1.setText(""+l1.w);
        z1.setText(""+l1.z);
        x2.setText(""+l2.x);
        y2.setText(""+l2.y);
        w2.setText(""+l2.w);
        z2.setText(""+l2.z);
        x3.setText(""+l3.x);
        y3.setText(""+l3.y);
        w3.setText(""+l3.w);
        z3.setText(""+l3.z);
    }
    
    private void CEvent(){  /*reseta as variáveis*/
        l1.ZerarLinha();
        l2.ZerarLinha();
        l3.ZerarLinha();
        x1.setText("");
        x2.setText("");
        x3.setText("");
        y1.setText("");
        y2.setText("");
        y3.setText("");
        w1.setText("");
        w2.setText("");
        w3.setText("");
        z1.setText("");
        z2.setText("");
        z3.setText("");
        VisorCalc.setText("");
    }
    /*assim que acionada a funcao sera responsavel por chamar os metodos para o calculo do escalonamento*/
    private void EventEquals(){
        Opt3x();
    }
    
    private void Opt2x(){
        hardcalcs.Cmat_EscPanel2x2.run();
        this.setVisible(false);
        this.dispose();
    }
    /*este teste sera responsavel pela verificacao de n caso seja possivel eliminar algum elemento da linha desejada*/
    private boolean TestePreliminar(float eliminado,float eliminador,float constante){
        eliminado += eliminador*constante;
        return eliminado == 0;
    }
    
    private LineClass CalcToline(LineClass linha1,LineClass linha2,int tr){
        float n = 0;
        switch(tr){
            case EliminarElePivo2:
                if(linha2.y!=0){
                    n = (linha1.y/linha2.y)*(-1);
                    if(!TestePreliminar(linha2.y,linha1.y,n)){
                        n = (linha2.y/linha1.y)*(-1);
                    }
                }else{
                    n = 0;
                }
                break;
            case EliminarElePivo3:
                if(linha2.w!=0){
                    n = (linha2.w/linha1.w)*(-1);
                    if(!TestePreliminar(linha1.w,linha2.w,n)){
                        n = (linha1.w/linha2.w)*(-1);
                    }
                }else{
                    n = 0;
                }
                break;
            case CalcPivo1:
                if(linha2.x!=0){
                    n = (linha2.x/linha1.x)*(-1);   /*armazena a razao de x2 com x1 multiplica por -1 e joga em um float*/
                    if(!TestePreliminar(linha1.x,linha2.x,n)){
                        n = (linha2.x/linha1.x)*(-1);
                    }
                }else{
                    n = 0;
                }
                break;
            case CalcPivo2:
                if(linha2.y!=0){
                    n = (linha2.y/linha1.y)*(-1);   /*armazena a razao de y2 com y1 multiplica por -1 e joga em um float*/
                    if(!TestePreliminar(linha1.y,linha2.y,n)){
                        n = (linha2.y/linha1.y)*(-1);
                    }
                }else{
                    n = 0;
                }
                break;
        }
        linha2.MultSumLines(linha1,n); /*tenta zerar o elemento pivo abaixo*/
        if((tr == CalcPivo1)||(tr == CalcPivo2)){
            if(linha2.x!=0){ /*verifica se o float e diferente de zero*/
                linha2.x = Math.abs(linha2.x); /*calcula o modulo do float*/
            }
            if(linha2.y!=0){
                linha2.y = Math.abs(linha2.y);
            }
            if(linha2.w!=0){
               linha2.w = Math.abs(linha2.w);
            }
            if(linha2.z!=0){
                linha2.z = Math.abs(linha2.z);
            }
        }
        return linha2;
    }
    
    private void Opt3x(){   /*metodo que calcula o escalonamento*/
        l2 = CalcToline(l1,l2,CalcPivo1);
        l3 = CalcToline(l1,l3,CalcPivo1);
        l3 = CalcToline(l2,l3,CalcPivo2);
        l2 = CalcToline(l3,l2,EliminarElePivo3);
        l1 = CalcToline(l3,l1,EliminarElePivo3);
        l1 = CalcToline(l2,l1,EliminarElePivo2);
        
        l1.DivideFirstToLast();/*divide os valores restantes de cada coeficiente*/
        l2.DivideSecondToLast();
        l3.DivideThirdToLast();
        PrintValuesAllScreens();
    }
    
    
    /*selecao de blocos,responsavel por pegar os valores inseridos pelo o usuario*/
    private void x1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x1KeyReleased
        l1.x = EventKeyX(evt,x1);/*funcao responsavel por setar o valor na variavel*/
        EventTextVisor("x1",l1.x,evt); /*funcao responsavel por mostrar o valor ao usuario atraves do bloco de texto*/
    }//GEN-LAST:event_x1KeyReleased

    private void y1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y1KeyReleased
        l1.y = EventKeyX(evt,y1);
        EventTextVisor("y1",l1.y,evt);
    }//GEN-LAST:event_y1KeyReleased

    private void x2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x2KeyReleased
        l2.x = EventKeyX(evt,x2);
        EventTextVisor("x2",l2.x,evt);
    }//GEN-LAST:event_x2KeyReleased

    private void y2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y2KeyReleased
        l2.y = EventKeyX(evt,y2);
        EventTextVisor("y2",l2.y,evt);
    }//GEN-LAST:event_y2KeyReleased

    private void z1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_z1KeyReleased
        l1.z = EventKeyX(evt,z1);
        EventTextVisor("z1",l1.z,evt);
    }//GEN-LAST:event_z1KeyReleased

    private void z2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_z2KeyReleased
        l2.z = EventKeyX(evt,z2);
        EventTextVisor("z2",l2.z,evt);
    }//GEN-LAST:event_z2KeyReleased
/*assim que selecionado,o botao sera responsavel por chamar os metodos para o calculo do escalonamento*/
    private void equalsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalsMouseReleased
        EventEquals();
    }//GEN-LAST:event_equalsMouseReleased
/*botao de insercao de dados,os dados serao inseridos e mostrados ao usuario seus valores nos blocos de texto*/
    private void InsertMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertMouseReleased
        l1.x = parseFloat(x1.getText());
        l1.y = parseFloat(y1.getText());
        l1.w = parseFloat(w1.getText());
        l1.z = parseFloat(z1.getText());
        l2.x = parseFloat(x2.getText());
        l2.y = parseFloat(y2.getText());
        l2.w = parseFloat(w2.getText());
        l2.z = parseFloat(z2.getText());
        l3.x = parseFloat(x3.getText());
        l3.y = parseFloat(y3.getText());
        l3.w = parseFloat(w3.getText());
        l3.z = parseFloat(z3.getText());
        VisorCalc.setText("");
        PrintValuesDownScreen();
        
    }//GEN-LAST:event_InsertMouseReleased
/*botoes que definirao os tamanhos da matriz*/
    private void button2x2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2x2MouseReleased
        Opt2x();
    }//GEN-LAST:event_button2x2MouseReleased
/*botao CE que resetera todas as variaveis e os blocos de texto*/
    private void CEMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CEMouseReleased
        CEvent();
    }//GEN-LAST:event_CEMouseReleased

    private void x3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x3KeyReleased
        l3.x = EventKeyX(evt,x3);
        EventTextVisor("x3",l3.x,evt);
    }//GEN-LAST:event_x3KeyReleased

    private void y3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y3KeyReleased
        l3.y = EventKeyX(evt,y3);
        EventTextVisor("y1",l3.y,evt);
    }//GEN-LAST:event_y3KeyReleased

    private void z3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_z3KeyReleased
        l3.z = EventKeyX(evt,z3);
        EventTextVisor("z3",l3.z,evt);
    }//GEN-LAST:event_z3KeyReleased

    private void w1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_w1KeyReleased
        l1.w = EventKeyX(evt,w1);
        EventTextVisor("w1",l1.w,evt);
    }//GEN-LAST:event_w1KeyReleased

    private void w2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_w2KeyReleased
        l2.w = EventKeyX(evt,w2);
        EventTextVisor("w2",l2.w,evt);
    }//GEN-LAST:event_w2KeyReleased

    private void w3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_w3KeyReleased
        l3.w = EventKeyX(evt,w3);
        EventTextVisor("w3",l3.w,evt);
    }//GEN-LAST:event_w3KeyReleased
/*funcao run responsavel por criar a janela*/
    public static void run(){
        Cmat_EscPanel3x3 c = new Cmat_EscPanel3x3();
        c.setTitle("HardCalcs-Calcular Matrizes - Escalonar");
        c.setSize(600, 400);
        c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        c.toFront();
        c.VisorCalc.setText("x1 + y1 + w1  =  z1\nx2 + y2 + w2  =  z2\nx3 + y3 + w3  =  z3");
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
    private java.awt.TextField w1;
    private java.awt.TextField w2;
    private java.awt.TextField w3;
    private java.awt.TextField x1;
    private java.awt.TextField x2;
    private java.awt.TextField x3;
    private java.awt.TextField y1;
    private java.awt.TextField y2;
    private java.awt.TextField y3;
    private java.awt.TextField z1;
    private java.awt.TextField z2;
    private java.awt.TextField z3;
    // End of variables declaration//GEN-END:variables
}
