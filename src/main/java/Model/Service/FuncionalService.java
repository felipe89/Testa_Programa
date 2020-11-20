package Model.Service;

import Entidade.FuncionarioExercicio;

import java.util.List;
import java.util.function.Predicate;

public class FuncionalService {

    public double salarioFuncionario (List<FuncionarioExercicio> list, Predicate <FuncionarioExercicio> criterio){
        double soma = 0.0;
        for (FuncionarioExercicio p : list){
            if (criterio.test(p)){
                soma += p.getSalario();
            }
        }
        return soma;
    }
}
