public class Libro implements Producto {
    private String isbn;
    private String titulo;
    private String resena;
    private String autor;
    private double precio;
    private int numeroDePaginas;

    public Libro(String isbn, String titulo, String resena, String autor, double precio, int numeroDePaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.resena = resena;
        this.autor = autor;
        this.precio = precio;
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Libro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Resena: " + resena);
        System.out.println("Precio: " + precio);
        System.out.println("Numero de paginas: " + numeroDePaginas);
    }
}
