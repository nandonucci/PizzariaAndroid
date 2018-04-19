package br.com.fiap.trabalho.rm77786;

public class Pizza {

    private String nome;
    private double preco;
    private int imagem;
    private int imagemGrande;
    private String ingredientes;
    private String ingredAlergia;
    private int calorias;
    private float pontuacao;

    public Pizza() {
    }

    public Pizza(String nome, double preco, int imagem, int imagemGrande, String ingredientes, String ingredAlergia, int calorias, float pontuacao) {
        this.nome = nome;
        this.preco = preco;
        this.imagem = imagem;
        this.imagemGrande = imagemGrande;
        this.ingredientes = ingredientes;
        this.ingredAlergia = ingredAlergia;
        this.calorias = calorias;
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

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public int getImagemGrande() {
        return imagemGrande;
    }

    public void setImagemGrande(int imagemGrande) {
        this.imagemGrande = imagemGrande;
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

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public float getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(float pontuacao) {
        this.pontuacao = pontuacao;
    }
}
