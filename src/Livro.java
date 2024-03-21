public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;
    private int edicao;
    private String isbn;
    private int quantidadePaginas;
    private String genero;
    private boolean emprestado;

    public Livro(String titulo, String autor, String editora, int anoPublicacao, int edicao, String isbn, int quantidadePaginas, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.edicao = edicao;
        this.isbn = isbn;
        this.quantidadePaginas = quantidadePaginas;
        this.genero = genero;
        this.emprestado = false;
    }

    public void emprestar() {
        this.emprestado = true;
    }

    public void devolver() {
        this.emprestado = false;
    }

    public String retornaDadosLivro() {
        return "Título: " + this.titulo + "\nAutor: " + this.autor + "\nEditora: " + this.editora + "\nAno de publicação: " + this.anoPublicacao + "\nEdição: " + this.edicao + "\nISBN: " + this.isbn + "\nQuantidade de páginas: " + this.quantidadePaginas + "\nGênero: " + this.genero + "\nEmprestado: " + (this.emprestado ? "Sim" : "Não");
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getEditora() {
        return this.editora;
    }

    public int getAnoPublicacao() {
        return this.anoPublicacao;
    }

    public int getEdicao() {
        return this.edicao;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public int getQuantidadePaginas() {
        return this.quantidadePaginas;
    }

    public String getGenero() {
        return this.genero;
    }

    public boolean isEmprestado() {
        return this.emprestado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void setEmprestado() {
        this.emprestado = true;
    }

    public void setDevolvido() {
        this.emprestado = false;
    }
}
