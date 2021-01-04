
package Entidade;

public class Jogador {
    
    private int pontos;
    private String nome;
    private int vidas;
    private int fase ;
    private int acertos ;
    private int erros ;
    

    

    public Jogador() {
        acertos = 0;
        fase = 1;
        pontos = 0;
        vidas = 10;
    }

    public int getErros() {
        return erros;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }
    
    

    public int getAcertos() {
        return acertos;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    
    
    public int getPontos() {
        return pontos;
    }

    public String getNome() {
        return nome;
    }

    public int getVidas() {
        return vidas;
    }

    public int getFase() {
        return fase;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    
    
    
    
    
    
}
