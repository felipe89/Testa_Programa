package Aplicacao;

import Entidade.Product;
import Model.Service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramaTestaProduto {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

//        double sum = ps.listarSomada(list, p -> p.getNome().charAt(0) == 'M');
        double sum = ps.listarSomada(list, p -> p.getPreco() < 100);

        System.out.println("Soma: " + String.format("%.2f", sum));
    }
}
