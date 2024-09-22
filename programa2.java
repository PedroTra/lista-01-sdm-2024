public class Programa2 {
    public static void main(String[] args) {
        Atleta atleta = new Atleta();
        atleta.setNome("Gabriel Medina");
        atleta.setPais("Brasil");  
        atleta.setQtdeMedalhas(10);    

        System.out.printf("O atleta " + atleta.getNome() + " que veio do " + atleta.getPais() + " possui " +  atleta.getQtdeMedalhas() + " Medalhas. ");
    }
    
}
