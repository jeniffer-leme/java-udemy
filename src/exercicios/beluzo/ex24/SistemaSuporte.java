package exercicios.beluzo.ex24;

import exercicios.beluzo.ex24.Enum.Prioridade;
import exercicios.beluzo.ex24.Enum.Status_Chamado;
import exercicios.beluzo.ex24.Enum.Tipo_Problema;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaSuporte {
    public static void main(String[] args) {
        ArrayList<Chamada> chamado = new ArrayList();
        Scanner sc = new Scanner(System.in);
        
        int opcao;
        
        do {
            System.out.println("===== MENU DE CHAMADOS =====");
            System.out.println("1. Abrir novo chamado");
            System.out.println("2. Listar chamados");
            System.out.println("3. Alterar status de um chamado");
            System.out.println("4. Buscar por descricao");
            System.out.println("5. Mostrar chamados por prioridade");
            System.out.println("0. Sair");
            
            System.out.print("\nDigite a opção desejada: ");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("----- NOVO CHAMADO -----");
                    System.out.print("Descrição do problema: ");
                    sc.nextLine(); 
                    String descricao = sc.nextLine();

                    System.out.println();
                    System.out.println("Selecione o Tipo de Problema:");
                    System.out.println("1 - Hardware");
                    System.out.println("2 - Software");
                    System.out.println("3 - Rede");
                    System.out.println("4 - Acesso");
                    System.out.print("Opção: ");
                    int opcaoTipo = sc.nextInt();

                    Tipo_Problema tipo = Tipo_Problema.HARDWARE; 
                    if (opcaoTipo == 2) tipo = Tipo_Problema.SOFTWARE;
                    else if (opcaoTipo == 3) tipo = Tipo_Problema.REDE;
                    else if (opcaoTipo == 4) tipo = Tipo_Problema.ACESSO;

                    System.out.println();
                    System.out.println("Selecione a Prioridade:");
                    System.out.println("1 - Baixa");
                    System.out.println("2 - Média");
                    System.out.println("3 - Alta");
                    System.out.print("Opção: ");
                    int opcaoPrioridade = sc.nextInt();

                    Prioridade prioridade = Prioridade.BAIXA; 
                    if (opcaoPrioridade == 2) prioridade = Prioridade.MEDIA;
                    else if (opcaoPrioridade == 3) prioridade = Prioridade.ALTA;

                    Chamada novoChamado = new Chamada(descricao, prioridade, Status_Chamado.ABERTO, tipo);

                    chamado.add(novoChamado);

                    System.out.println("Chamado aberto com sucesso (Status: ABERTO)!");
                    break;
                    
                case 2:
                    
                    break;
                    
                case 3:
                    
                    break;
                    
                case 4:
                    
                    break;
                    
                case 5:
                    
                    break;
                    
                case 0:
                    System.out.println("Você saiu!");
                    break;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
            
        }while(opcao != 0); 
    }
}
