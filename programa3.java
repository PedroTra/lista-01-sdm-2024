public class Programa3 {
    public static void main(String[] args) {
        Livro livro = new Livro();
        Livro.setNome("Harry Potter e o Prisioneiro de Azkaban");
        livro.setAutor("J.K. Rowling");  
        livro.setPreço( 227.90);   
        livro.setIsbn("32.4567893467"); 

        System.out.printf("Livro: " + livro.getNome() + " Autor: " + livro.getAutor() + " Valor: R$" + livro.getPreço() + " isbn:  " + livro.getIsbn());
    }
    
}
