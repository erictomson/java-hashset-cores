import javax.swing.*;
import java.util.*;

public class Main {

    // Atributos da classe
    String saida = "";
    private String[] cores = {"vermelho", "branco", "azul", "verde",
                        "cinza", "laranja", "bronzeado", "branco",
                        "ciano", "pêssego", "cinza", "laranja"};

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        // Declarando a nova lista
        List lista;

        // Instanciando e populando a lista
        // usando o Array de cores
        lista = new ArrayList(Arrays.asList(cores));

        // Montando a string com os elementos da lista
        saida += "Lista com elementos duplicados: ";
        saida += "\n" + lista;

        // Gerando nova lista com elementos não duplicados
        this.gerarListaNaoDuplicada(lista);

        // Configurando a TextArea para receber a lista
        JTextArea saidaArea = new JTextArea();
        // Atribuindo o conjunto à caixa de texto
        saidaArea.setText(saida);

        // Exibindo o conjunto com caixa de diálogo
        JOptionPane.showMessageDialog(null,saidaArea,"Trabalhando com Sets",JOptionPane.INFORMATION_MESSAGE);

        // Saindo do sistema
        System.exit(0);
    }

    public void gerarListaNaoDuplicada(Collection collection) {
        // Declarando e instanciando a nova coleção
        Set set = new HashSet(collection);

        Iterator iterator = set.iterator();

        saida += "\n\nLista com elementos não duplicados\n";

        while(iterator.hasNext()) {
            saida += iterator.next() + " ";
        }
    }
}
