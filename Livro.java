public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private String editora;

    public Livro(String titulo, String autor, String editora, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
    }

    public String toString() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nEditora: " + editora + "\nAno: " + ano;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public String getEditora() {
        return editora;
    }
}
