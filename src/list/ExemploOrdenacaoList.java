package list;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public ExemploOrdenacaoList() {
    }

    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<Gato>() {
            {
                this.add(new Gato("Jon", 12, "preto"));
                this.add(new Gato("Simba", 6, "tigrado"));
                this.add(new Gato("Jon", 18, "amarelo"));
            }
        };
        meusGatos.sort(Comparator.comparing(Gato::getNome));
        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);
        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        System.out.println("--\tOrdem Idade\t---");
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);
        System.out.println("--\tOrdem cor\t---");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);
        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}
