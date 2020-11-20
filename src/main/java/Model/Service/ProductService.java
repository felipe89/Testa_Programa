package Model.Service;

import Entidade.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double listarSomada(List<Product>list, Predicate <Product> criterio){
        double sum = 0.0;
        for (Product p : list){
            if (criterio.test(p)){
                sum += p.getPreco();
            }
        }
        return sum;
    }
}
