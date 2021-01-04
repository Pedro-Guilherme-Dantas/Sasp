/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


import AudiosFaceis.SonsF;
import javax.swing.ImageIcon;
import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.util.ArrayList;
import Entidade.Jogador;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Grafith 2001
 */
public class TelaGameplay extends javax.swing.JFrame {

    private int avat;
    
    private URL somf;
    private AudioClip clip2;

    private SonsF b = new SonsF();
    private Jogador p = new Jogador();
    private URL som2;
    private int contador = 0;
    private int contador1 = 0;
    private URL som;
    private AudioClip clip;
    private String sort;
    private String sig;
    private String[] sorteio;
    private ImageIcon img;
    private ImageIcon img1;

    public TelaGameplay(int avat,String nome) {
        
        
        img1 = new ImageIcon(getClass().getResource("/Images/Caipira.png"));
        URL u = getClass().getResource("/Images/IconJanela.png");
        Image i = Toolkit.getDefaultToolkit().getImage(u);
        this.setIconImage(i);
        setTitle("Sasp - Soletre as Palavras");
        initComponents();
        this.setSize(600,520);
        this.avat = avat;
        //Setar o inone do avatar pela tela anterior
        if (avat == 1) {
            img = new ImageIcon(getClass().getResource("NerdLbl.png"));
            jLabel1.setIcon(img);
        } else if (avat == 2) {
            img = new ImageIcon(getClass().getResource("Moça1Lbl.png"));
            jLabel1.setIcon(img);
        } else if (avat == 3) {
            img = new ImageIcon(getClass().getResource("RapazLbl.png"));
            jLabel1.setIcon(img);
        } else {
            img = new ImageIcon(getClass().getResource("Moça2Lbl.png"));
            jLabel1.setIcon(img);
        }
        btnOk.setVisible(false);

        p.setFase(1);
        p.setNome(nome);
        lblNick.setText(p.getNome());
        lblFase.setText("1");
        somf = SonsF.class.getResource("Music.wav");
        clip2 = Applet.newAudioClip(somf);
        clip2.loop();
        
        lblVidas.setText(p.getVidas()+"");
        jpSenha.setEnabled(false);
        btnDica.setEnabled(false);
        
    
    }

    @Override
    public void dispose() {
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        super.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpSenha = new javax.swing.JPasswordField();
        btnPalavra = new javax.swing.JButton();
        btnDica = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblCerto = new javax.swing.JLabel();
        lblErrado = new javax.swing.JLabel();
        lblFase = new javax.swing.JLabel();
        lblVidas = new javax.swing.JLabel();
        lblCoracao = new javax.swing.JLabel();
        lblNick = new javax.swing.JLabel();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jpSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpSenhaMouseClicked(evt);
            }
        });
        jpSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jpSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 260, 60));

        btnPalavra.setBackground(new java.awt.Color(255, 255, 255));
        btnPalavra.setText("Ouça a palavra");
        btnPalavra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalavraActionPerformed(evt);
            }
        });
        getContentPane().add(btnPalavra, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 120, 50));

        btnDica.setBackground(new java.awt.Color(255, 255, 255));
        btnDica.setText("Significado");
        btnDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDicaActionPerformed(evt);
            }
        });
        getContentPane().add(btnDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 120, 50));

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        getContentPane().add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 80, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(java.awt.SystemColor.control);
        jLabel3.setText("Fase:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 60, 50));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 260, 240));

        lblCerto.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblCerto.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblCerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 370, 30));

        lblErrado.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblErrado.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblErrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 380, 30));

        lblFase.setBackground(new java.awt.Color(0, 0, 0));
        lblFase.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblFase.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 50, 30));

        lblVidas.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblVidas.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblVidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 40, 30));

        lblCoracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Heart.png"))); // NOI18N
        getContentPane().add(lblCoracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 50, 30));

        lblNick.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblNick.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 250, 20));

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FundoTelaGameplay.jpg"))); // NOI18N
        getContentPane().add(labelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    

    private void jpSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpSenhaActionPerformed

    }//GEN-LAST:event_jpSenhaActionPerformed

    private void jpSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSenhaMouseClicked
        
    }//GEN-LAST:event_jpSenhaMouseClicked

    private void btnDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDicaActionPerformed
        JOptionPane.showMessageDialog(this, sig,
                    "Significado", JOptionPane.INFORMATION_MESSAGE,img1);
        btnDica.setEnabled(false);
    }//GEN-LAST:event_btnDicaActionPerformed

    private void btnPalavraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalavraActionPerformed
        
        if(p.getAcertos() >= 10 && p.getAcertos() <= 20){
            p.setFase(2);
        }if(p.getAcertos() > 20){
            p.setFase(3);
        }
        
        lblFase.setText(p.getFase()+"");
        
        jpSenha.setText("");
        lblCerto.setText("");
        lblErrado.setText("");
        
        
        btnOk.setVisible(false);
        try{
        if(contador ==0){
            if(p.getFase() == 1){
            sorteio = b.sorteioF();
            sort = sorteio[0];
            sig =  sorteio[1];
            som = SonsF.class.getResource(sort);
            }else if(p.getFase() == 2){
                sorteio = b.sorteioM();
                sort = sorteio[0];
                sig = sorteio[1];
                som = SonsF.class.getResource(sort);
            }else{
                sorteio = b.sorteioD();
                sort = sorteio[0];
                sig = sorteio[1];
                som = SonsF.class.getResource(sort);
            }
        //Verificar fase    
        }
        if(contador ==0){
            som2 = som;
        }
        if(contador == 0){
             clip = Applet.newAudioClip(som);
             btnPalavra.setEnabled(true);
             jpSenha.setEnabled(false);
        }else{
            clip = Applet.newAudioClip(som2);
            btnOk.setVisible(true);
            btnPalavra.setEnabled(false);
            jpSenha.setEnabled(true);
            btnDica.setEnabled(true);
        }
        clip.play();
        
        
        
        if(contador == 0){
            contador = 1;
        }else{
            contador = 0;
        }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(this," Não foi possível reproduzir a palavra",
                    "Parabéns, você ganhou!! ", JOptionPane.INFORMATION_MESSAGE,img1);
        }
          
        
    }//GEN-LAST:event_btnPalavraActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        
        
        
        String senha = String.valueOf(jpSenha.getPassword());
        //Tirar .wav
        String[] px = new String[1];
        px = sort.split("[.]");
        
        if((senha+".wav").equalsIgnoreCase(sort)){
            lblCerto.setText("Você acertou!  "+senha.toUpperCase());
            p.setAcertos(p.getAcertos() +1);
            contador1 ++;
            if(contador1 == 5){
                p.setVidas(p.getVidas()+1);
                lblVidas.setText(p.getVidas()+"");
                contador1 = 0;
            }
        }else{
           lblCerto.setText("Você errou!  "+senha.toUpperCase());
           lblErrado.setText("Correto: "+px[0].toUpperCase());
           p.setErros(p.getErros()+1);
           p.setVidas(p.getVidas() -1);
           lblVidas.setText(p.getVidas()+"");
        }
        btnPalavra.setEnabled(true);
        btnOk.setVisible(false);
        
        
        lblVidas.setText(p.getVidas()+"");
         
        if(p.getAcertos() == 30){
            p.setPontos((p.getAcertos()*3)-p.getErros());
            TelaFinal ty = new TelaFinal(p.getAcertos(),p.getErros(),p.getPontos(),p.getNome(),img);
            JOptionPane.showMessageDialog(this, "Você Ganhou!!",
                    "PARABÉNS ", JOptionPane.INFORMATION_MESSAGE,img1);
        btnDica.setEnabled(false);
        ty.setVisible(true);
        }
        
        if(p.getVidas()==0){
            p.setPontos((p.getAcertos()*3)-p.getErros());
            TelaFinal ty = new TelaFinal(p.getAcertos(),p.getErros(),p.getPontos(),p.getNome(),img);
            JOptionPane.showMessageDialog(this, "Você perdeu! ",
                    "QUE PENA ", JOptionPane.INFORMATION_MESSAGE,img1);
            ty.setVisible(true);
            
            super.dispose();
        }
        
    }//GEN-LAST:event_btnOkActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDica;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnPalavra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jpSenha;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel lblCerto;
    private javax.swing.JLabel lblCoracao;
    private javax.swing.JLabel lblErrado;
    private javax.swing.JLabel lblFase;
    private javax.swing.JLabel lblNick;
    private javax.swing.JLabel lblVidas;
    // End of variables declaration//GEN-END:variables
}
