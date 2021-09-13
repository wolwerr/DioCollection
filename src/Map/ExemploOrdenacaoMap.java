package Map;

import java.util.*;
import java.util.Map.Entry;

public class ExemploOrdenacaoMap {
    public ExemploOrdenacaoMap() {
    }

    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livro> meusLivros = new HashMap<>() {
            {
                this.put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
                this.put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
                this.put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
            }
        };
        for (Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<String, Livro>() {
            {
                put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
                put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
                put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
            }
        };
        for (Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem alfabética autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap(meusLivros1);
        for (Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem alfabética nomes dos livros\t--");
        Set<Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem por número de páginas\t--");
        List<Livro> meusLivros4 = new ArrayList<>() {{
            add(new Livro("Uma Breve História do Tempo", 256));
            add(new Livro("O Poder do Hábito", 408));
            add(new Livro("21 Lições Para o Século 21", 432));

        }};
        meusLivros4.sort(Comparator.comparing((Livro livro) -> livro.getPaginas()));
        System.out.println(meusLivros4);

    }
}



