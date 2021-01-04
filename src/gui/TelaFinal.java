/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Grafith 2001
 */
public class TelaFinal extends javax.swing.JFrame {

   
    
    
    public TelaFinal(int acertos, int erros, int pont,String nome,ImageIcon img) {
        initComponents();
        try {
            gravar(nome,pont);
        } catch (IOException ex) {
            
        }
        
        this.setSize(600,520);
        lblNick.setText(nome);
        lblAcertos.setText(acertos+"");
        lblErros.setText(erros+"");
        lblPontuacao.setText(pont+"");
        lblAvat.setIcon(img);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        URL u = getClass().getResource("/Images/IconJanela.png");
        Image i = Toolkit.getDefaultToolkit().getImage(u);
        this.setIconImage(i);
        setTitle("Sasp - Soletre as Palavras");
    }
    
    @Override
    public void dispose(){
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        super.dispose();
    }
    
    public void gravar(String nome,int pont)throws IOException {
        try{
        FileWriter wr = new FileWriter("dados.txt",true);
        String x = ("NickGame:  "+nome);
        String y = ("Score:  "+pont);
        
        
        wr.write("NickGame:  "+nome);
        wr.write("\n");
        wr.write("Prontuação: "+y);
        wr.write("\n");
        wr.write("\n");
        wr.close();
        }catch(Exception e){
           JOptionPane.showMessageDialog(this, "Não foi possível gravar o arquivo",
                    "Erro", JOptionPane.INFORMATION_MESSAGE); 
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAcertos = new javax.swing.JLabel();
        lblErros = new javax.swing.JLabel();
        lblPontuacao = new javax.swing.JLabel();
        lblNick = new javax.swing.JLabel();
        lblAvat = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAcertos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblAcertos.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblAcertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 80, 50));

        lblErros.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblErros.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblErros, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 80, 50));

        lblPontuacao.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblPontuacao.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblPontuacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 80, 50));

        lblNick.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblNick.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 250, 40));
        getContentPane().add(lblAvat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 260, 240));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FundoFinal.png"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 513));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAcertos;
    private javax.swing.JLabel lblAvat;
    private javax.swing.JLabel lblErros;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblNick;
    private javax.swing.JLabel lblPontuacao;
    // End of variables declaration//GEN-END:variables
}
