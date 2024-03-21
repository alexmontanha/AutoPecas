public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(Livro livro, Usuario usuario, String dataEmprestimo, String dataDevolucao) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public String retornaDadosEmprestimo() {
        return "Livro: " + this.livro.getTitulo() + "\nUsuário: " + this.usuario.getNome() + "\nData de empréstimo: " + this.dataEmprestimo + "\nData de devolução: " + this.dataDevolucao;
    }

    public Livro getLivro() {
        return this.livro;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public String getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public String getDataDevolucao() {
        return this.dataDevolucao;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
