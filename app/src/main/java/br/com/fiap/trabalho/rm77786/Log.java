package br.com.fiap.trabalho.rm77786;


public class Log {

    private String descricao;
    private int data;

    public Log() {
    }

    public Log(String descricao, int data) {
        this.descricao = descricao;
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
