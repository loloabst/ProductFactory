public class Main {
    public static void main(String[] args) {
        Producto libro = FactoryProductos.crearProducto("libro", "09786071728555"
                , "El atlas de Mexico", "El libro mas pesado de la SEP"
                , "Juan", "30.00", "300");
        libro.mostrarDetalles();

        System.out.println();

        Producto revista = FactoryProductos.crearProducto("revista",
                "12345678", "Revista de chismes",
                "10", "10.99", "Mensual");
        revista.mostrarDetalles();

        System.out.println();

        Producto periodico = FactoryProductos.crearProducto("periodico",
                "123", "Eldiario",
                "2025-04-02", "2.99");
        periodico.mostrarDetalles();
    }
}
