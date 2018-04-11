package br.com.fiap.trabalho.rm77786;

public class Pizza {

    private String nome;
    private double preco;
    private int imagem;
    private String ingredientes;
    private String ingredAlergia;
    private int pontuacao;


    public Pizza() {
    }

    public Pizza(String nome, double preco, int imagem, String ingredientes, String ingredAlergia, int pontuacao) {
        this.nome = nome;
        this.preco = preco;
        this.imagem = imagem;
        this.ingredientes = ingredientes;
        this.ingredAlergia = ingredAlergia;
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getIngredAlergia() {
        return ingredAlergia;
    }

    public void setIngredAlergia(String ingredAlergia) {
        this.ingredAlergia = ingredAlergia;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}
