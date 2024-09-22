public class PessoaFisica {
    private String nome;
    private String cep;
    private String Pais;
    private String rg;
    private String cpf;
    private String profissão;
    
public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissão() {
        return profissão;
    }

    public void setProfissão(String profissão) {
        this.profissão = profissão;
    }

public void exibirInformacoes() {
    System.out.println("Nome: " + nome);
    System.out.println("Pais: " + Pais);
    System.out.println("CEP: " + cep);
    System.out.println("CPF: " + cpf);
    System.out.println("Profissão:  " + profissão);
    
}
}
