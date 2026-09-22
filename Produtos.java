public class Produtos{
private String nome;
private String categoria;
private double preco;


public Produtos(String nome, String categoria, double preco){
this.nome = nome;
this.categoria = categoria;
this.preco = preco;

}

public String getNome(){
    return nome;
}

public String getCategoria(){
    return categoria;
}

public double getPreco(){
    return preco;
}






}