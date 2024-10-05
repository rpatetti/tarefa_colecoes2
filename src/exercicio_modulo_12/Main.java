package exercicio_modulo_12;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			Map<String, List<String>> grupos = new HashMap<>();
			
			grupos.put("Masculino", new ArrayList<>());
			grupos.put("Feminino", new ArrayList<>());
			
			while (true) {
			    System.out.println("Digite o nome (ou 'sair' para encerrar): ");
			    String nome = scanner.nextLine();
			    
			    if (nome.equalsIgnoreCase("sair")) {
			        break;
			    }
			    
			    System.out.println("Digite o sexo (Masculino/Feminino): ");
			    String sexo = scanner.nextLine();
			    
			    if (sexo.equalsIgnoreCase("Masculino")) {
			        grupos.get("Masculino").add(nome);
			    } else if (sexo.equalsIgnoreCase("Feminino")) {
			        grupos.get("Feminino").add(nome);
			    } else {
			        System.out.println("Sexo inválido. Tente novamente.");
			    }
			}
			
			System.out.println("\nGrupo Masculino: " + grupos.get("Masculino"));
			System.out.println("Grupo Feminino: " + grupos.get("Feminino"));
		}
    }
}
