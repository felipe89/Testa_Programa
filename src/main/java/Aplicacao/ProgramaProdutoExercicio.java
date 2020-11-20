package Aplicacao;

import Entidade.ProdutoExercicio;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

public class ProgramaProdutoExercicio {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre caminho do arquivo: ");
        String path = entrada.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List <ProdutoExercicio> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(", ");
                list.add(new ProdutoExercicio(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            double media = list.stream()
                    .map(p -> p.getPreço())
                    .reduce(0.0, (x, y) -> x + y) / list.size();
            System.out.println("Media do preço: " + String.format("%.2f", media));

            Comparator<String> comparar = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            Stream<String> nomes = list.stream()
                    .filter(p -> p.getPreço() < media)
                    .map(p -> p.getNome())
                    .sorted(comparar.reversed());

                    nomes.forEach(System.out::println);
        }catch (IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }
        entrada.close();
    }
}
