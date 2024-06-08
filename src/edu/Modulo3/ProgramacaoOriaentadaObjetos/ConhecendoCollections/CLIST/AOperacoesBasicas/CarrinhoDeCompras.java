package src.edu.Modulo3.ProgramacaoOriaentadaObjetos.ConhecendoCollections.CLIST.AOperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //Atributos
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        if (!itemParaRemover.isEmpty()){
            for (Item i : itemList){
                if (i.getNome().equalsIgnoreCase(nome)){
                    itemParaRemover.add(i);
                }
            }
            itemList.removeAll(itemParaRemover);
        }else {
            System.out.println("Esta Lista de Compras Esta vazia");
        }
    }
    public double calcularValorTotal(){
        double valorTotal =0d;
        if (!itemList.isEmpty()){
            for (Item item : itemList ){
                double valorItem = item.getPreco() * item.getQuant();
                valorTotal += valorItem; // valorTotal = valorTotal + valorItem

            }
            return valorTotal;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens(){
        if ((!itemList.isEmpty())){
            System.out.println(this.itemList);
        }else {
            System.out.println("lista Vazia");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhosDeCompras = new CarrinhoDeCompras();

        carrinhosDeCompras.adicionarItem("banana", 3.49, 1);
        carrinhosDeCompras.adicionarItem("mamao", 5.59,2);
        carrinhosDeCompras.adicionarItem("maça", 8.99,1);

        carrinhosDeCompras.exibirItens();

        carrinhosDeCompras.removerItem("banana");
        carrinhosDeCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhosDeCompras.calcularValorTotal());

    }
}
