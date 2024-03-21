public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;
    private String login;
    private String senha;
    private boolean bloqueado;

    public Usuario(String nome, String cpf, String email, String telefone, String endereco, String cep, String cidade, String estado, String pais, String login, String senha, boolean bloqueado) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.login = login;
        this.senha = senha;
        this.bloqueado = bloqueado;
    }

    public String retornaDadosUsuario() {
        return "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nE-mail: " + this.email + "\nTelefone: " + this.telefone + "\nEndereço: " + this.endereco + "\nCEP: " + this.cep + "\nCidade: " + this.cidade + "\nEstado: " + this.estado + "\nPaís: " + this.pais + "\nLogin: " + this.login + "\nSenha: " + this.senha + "\nBloqueado: " + this.bloqueado;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getCep() {
        return this.cep;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getPais() {
        return this.pais;
    }

    public String getLogin() {
        return this.login;
    }

    public String getSenha() {
        return this.senha;
    }

    public boolean isBloqueado() {
        return this.bloqueado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
