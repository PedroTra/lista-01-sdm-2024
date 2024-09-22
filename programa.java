public class Programa4 {
    public static void main(String[] args) {
        
        PessoaFisica pessoafisica = new PessoaFisica();

        pessoafisica.setNome("Matheus");
        pessoafisica.setCep("30380-474");
        pessoafisica.setPais("Brasil");
        pessoafisica.setRg("MG-20.567.716");
        pessoafisica.setCpf("165.516.816");
        pessoafisica.setProfissão("Uber");
        
        pessoafisica.exibirInformacoes();
    }
}
