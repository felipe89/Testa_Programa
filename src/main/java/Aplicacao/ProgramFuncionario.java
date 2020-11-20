package Aplicacao;

import Entidade.FuncionarioExercicio;
import Model.Service.FuncionalService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

public class ProgramFuncionario {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe o caminho do arquivo: ");
        String arquivo = entrada.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {

            List<FuncionarioExercicio> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String [] field = line.split(", ");
                list.add(new FuncionarioExercicio(field[0], Double.parseDouble(field[1])));
                line = br.readLine();
            }
            double salario = list.stream()
                    .map(p -> p.getSalario())
                    .reduce(0.0, (x, y) -> x + y) / list.size();
            System.out.println("Salario: " + String.format("%2.f", salario));

            List<FuncionarioExercicio>listII = new ArrayList<>();
            FuncionalService func = new FuncionalService();

            double valor = func.salarioFuncionario(listII, p -> p.getNome().charAt(0) == 'M');
            System.out.println("Ordenação: " + String.format("%.2f", valor));

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }
}
