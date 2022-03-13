import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) throws ParseException, IOException {

        Scanner leia = new Scanner(System.in);
        List<Tarefa> NovaLista = new ArrayList<>();
        int NumeroMenu = 0;
        Collections.sort(NovaLista);

        while(NumeroMenu!=6){
            try {
                System.out.println("MENU\n"+"1.Criar nova lista.\n"+"2.Mostrar listra.\n"+"3.Acessar lista.\n"+"4.Remover lista.\n"+"5.Remover todas as listas.\n"+"Tamanho da lista atual:"+ NovaLista.size()+"\n6.Sair.");
                NumeroMenu= leia.nextInt();
                switch (NumeroMenu) {
                    case 1:
                        Tarefa list = new Tarefa();
                        NovaLista.add(Entrada(list, leia));
                        Rebalaciamento((ArrayList) NovaLista);


                        break;
                    case 2:
                        MostrarTarefa((ArrayList) NovaLista);
                        break;
                    case 3:
                        AcessarTarefas((ArrayList) NovaLista, leia);
                        break;
                    case 4:
                        RemoverTarefa((ArrayList) NovaLista, leia);
                        break;
                    case 5:
                        LimparTudo((ArrayList) NovaLista);
                        break;
                    case 6:
                        System.out.println("Finalizado.");
                        break;

                }
            } catch (Exception e) {
                System.out.println(e.getStackTrace());

            }

        }}

    public static Tarefa Entrada(Tarefa lista, Scanner leia) throws ParseException, IOException {

        System.out.println("Digite um nome:");
        lista.setNome(leia.next());
        System.out.println("Adicione uma descrição:");
        lista.setDescricao(leia.next());
        System.out.println("Categoria:");
        lista.setCategoria(leia.next());
        data(lista, leia);
        Prioridade(lista, leia);
        Status(lista, leia);
        System.out.println("Lista criada com sucesso.");
        return lista;
    }
    public static void MostrarTarefa(ArrayList NovaLista){
        for(Object c : NovaLista){
            System.out.println(c.toString());
        }
    }
    public static void data(Tarefa lista, Scanner leia) throws ParseException {
        System.out.println("Data para Término:");
        String data = leia.next();
        Date day = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        lista.setDataTermino(day);
    }

    public static void Prioridade(Tarefa lista, Scanner leia)  {
        System.out.println("Adicione o nível de prioridade(1 á 5):");
        int N = leia.nextInt();
        if (N >= 1 || N <= 5) {
            lista.setPrioridade(N);
        } else {
            System.out.println("Número inválido.");
            Prioridade(lista, leia);
        }

    }

    public static void Status(Tarefa lista, Scanner leia) {
        System.out.println("Qual o status:\n"+"1.A fazer.\n"+"2.Em andamento\n"+"3.Concluido");
        int N = leia.nextInt();
        if (N == 1) {
            lista.setStatus("A fazer.\"");
        } else if (N == 2) {
            lista.setStatus("Em andamento.");
        } else if (N == 3) {
            lista.setStatus("Concluido.");
        } else {
            System.out.println("Valor invalido");
            Status(lista, leia);
        }

    }
    public static void RemoverTarefa(ArrayList<Tarefa> NovaLista, Scanner leia){
        System.out.println("Digite o numero da Lista que quer remover:");
        int r = leia.nextInt();
        NovaLista.remove(r - 1);
        System.out.println("Tarefa removida");
    }
    public static void LimparTudo(ArrayList<Tarefa> NovaLista){
        NovaLista.clear();
        System.out.println("Todas as tarefas foram removidas.");
    }
    public  static int AcessarTarefas(ArrayList<Tarefa> NovaLista, Scanner leia){
        System.out.println("Digite o número da Lista que deseja ver:");
        int a = leia.nextInt();
        int b = NovaLista.size();
         if ( a == b) {
                System.out.println(NovaLista.get(a-1));
            } else {
                System.out.println("Número invalido.");
                AcessarTarefas(NovaLista, leia);
            }

        return a;
    }
    public static void Rebalaciamento(ArrayList<Tarefa> NovaLista) {
        Collections.sort(ArrayList<Tarefa> NovaLista);

    }

}
