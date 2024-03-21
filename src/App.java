import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ArrayList<Livro> livros = new ArrayList<Livro>();
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {
            clearScreen();
            System.out.println("Bem-vindo ao sistema de gerenciamento de biblioteca!");
            System.out.println("Digite 1 para cadastrar um novo livro");
            System.out.println("Digite 2 para listar os livros cadastrados");
            System.out.println("Digite 3 para cadastrar um novo usuário");
            System.out.println("Digite 4 para listar os usuários cadastrados");
            System.out.println("Digite 5 para cadastrar um novo empréstimo");
            System.out.println("Digite 6 para listar os empréstimos cadastrados");
            System.out.println("Digite 7 para cadastrar uma nova devolução");
            System.out.println("Digite 9 para sair do sistema");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarLivro(scanner, livros);
                    break;
                case 2:
                    listarLivros(scanner, livros);
                    break;
                case 3:
                    cadastrarUsuario(scanner, usuarios);
                    break;
                case 4:
                    listarUsuario(scanner, usuarios);
                    break;
                case 5:
                    cadastrarEmprestimo(scanner, livros, usuarios, emprestimos);
                    break;
                case 6:
                    listarEmprestimos(scanner, emprestimos);
                    System.out.println("Opção ainda não implementada! 6");
                    break;
                case 7:
                    cadastrarDevolucao(scanner, emprestimos);
                    break;
                case 9:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 9);

        scanner.close();
    }

    private static void cadastrarDevolucao(Scanner scanner, ArrayList<Emprestimo> emprestimos) {
        System.out.println("Digite o índice do empréstimo:");
        for (int i = 0; i < emprestimos.size(); i++) {
            System.out.println(i + " - " + emprestimos.get(i).getLivro().getTitulo() + " - " + emprestimos.get(i).getUsuario().getNome());
        }
        int indiceEmprestimo = scanner.nextInt();

        emprestimos.remove(indiceEmprestimo);
        System.out.println("Devolução cadastrada com sucesso!");
    }

    private static void listarEmprestimos(Scanner scanner, ArrayList<Emprestimo> emprestimos) {
        for (Emprestimo emprestimo : emprestimos) {
            System.out.println(emprestimo.retornaDadosEmprestimo());
        }

        System.out.println("Pressione enter para continuar...");
        scanner.next();
    }

    private static void cadastrarEmprestimo(Scanner scanner, ArrayList<Livro> livros, ArrayList<Usuario> usuarios, ArrayList<Emprestimo> emprestimos) {
        System.out.println("Digite o indice do livro:");
        for (int i = 0; i < livros.size(); i++) {
            System.out.println(i + " - " + livros.get(i).getTitulo());
        }
        int indiceLivro = scanner.nextInt();

        System.out.println("Digite o indice do usuário:");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(i + " - " + usuarios.get(i).getNome());
        }
        int indiceUsuario = scanner.nextInt();

        System.out.println("Digite a data de empréstimo:");
        String dataEmprestimo = scanner.next();
        System.out.println("Digite a data de devolução:");
        String dataDevolucao = scanner.next();

        Emprestimo emprestimo = new Emprestimo(livros.get(indiceLivro), usuarios.get(indiceUsuario), dataEmprestimo, dataDevolucao);

        emprestimos.add(emprestimo);

        System.out.println("Empréstimo cadastrado com sucesso!");
    }

    private static void listarUsuario(Scanner scanner, ArrayList<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.retornaDadosUsuario());
        }
        System.out.println("Pressione enter para continuar...");	
        scanner.next();
    }

    private static void cadastrarUsuario(Scanner scanner, ArrayList<Usuario> usuarios) {
        String nome = scanner.nextLine();
        System.out.println("Digite o nome do usuário:");
        nome = scanner.nextLine();
        System.out.println("Digite o CPF do usuário:");
        String cpf = scanner.next();
        System.out.println("Digite o e-mail do usuário:");
        String email = scanner.next();
        System.out.println("Digite o telefone do usuário:");
        String telefone = scanner.next();
        System.out.println("Digite o endereço do usuário:");
        String endereco = scanner.next();
        System.out.println("Digite o CEP do usuário:");
        String cep = scanner.next();
        System.out.println("Digite a cidade do usuário:");
        String cidade = scanner.next();
        System.out.println("Digite o estado do usuário:");
        String estado = scanner.next();
        System.out.println("Digite o país do usuário:");
        String pais = scanner.next();
        System.out.println("Digite o login do usuário:");
        String login = scanner.next();
        System.out.println("Digite a senha do usuário:");
        String senha = scanner.next();
        System.out.println("Digite se o usuário está bloqueado (true/false):");
        boolean bloqueado = scanner.nextBoolean();

        Usuario usuario = new Usuario(nome, cpf, email, telefone, endereco, cep, cidade, estado, pais, login, senha, bloqueado);
        usuarios.add(usuario);
        System.out.printf("Usuário %s cadastrado com sucesso!", usuario.getNome());
    }

    private static void listarLivros(Scanner scanner, ArrayList<Livro> livros) {
        for (Livro livro : livros) {
            System.out.println(livro.retornaDadosLivro());
        }
        System.out.println("Pressione enter para continuar...");	
        scanner.next();
    }

    private static void cadastrarLivro(Scanner scanner, ArrayList<Livro> livros) {
        String titulo = scanner.nextLine();
        System.out.println("Digite o título do livro:");
        titulo = scanner.nextLine();
        System.out.println("Digite o autor do livro:");
        String autor = scanner.nextLine();
        System.out.println("Digite a editora do livro:");
        String editora = scanner.nextLine();
        System.out.println("Digite o ano de publicação do livro:");
        int anoPublicacao = scanner.nextInt();
        System.out.println("Digite a edição do livro:");
        int edicao = scanner.nextInt();
        System.out.println("Digite o ISBN do livro:");
        String isbn = scanner.next();
        System.out.println("Digite a quantidade de páginas do livro:");
        int quantidadePaginas = scanner.nextInt();
        System.out.println("Digite o gênero do livro:");
        String genero = scanner.next();

        Livro livro = new Livro(titulo, autor, editora, anoPublicacao, edicao, isbn, quantidadePaginas, genero);
        livros.add(livro);
        System.out.printf("Livro %s cadastrado com sucesso!", livro.getTitulo());
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
