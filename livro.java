public class Livro {
    private static String Nome;
    private static String Autor;
    private static double Preço;
    private static String isbn;
    public String getNome() {
        return Nome;
    }
    public static void setNome(String nome) {
        Nome = nome;
    }
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String autor) {
        Autor = autor;
    }
    public double getPreço() {
        return Preço;
    }
    public void setPreço(double preço) {
        Preço = preço;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        Livro.isbn = isbn;
    }

}
