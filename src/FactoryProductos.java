public class FactoryProductos {
    public static Producto crearProducto(String tipo, String... parametros) {
        if (tipo.equalsIgnoreCase("libro")) {
            return new Libro(parametros[0], parametros[1], parametros[2], parametros[3], Double.parseDouble(parametros[4]), Integer.parseInt(parametros[5]));

        } else if (tipo.equalsIgnoreCase("revista")) {
            return new Revista(parametros[0], parametros[1], Integer.parseInt(parametros[2]), Double.parseDouble(parametros[3]), parametros[4]);

        } else if (tipo.equalsIgnoreCase("periodico")) {
            return new Periodico(parametros[0], parametros[1], parametros[2], Double.parseDouble(parametros[3]));

            // se pueden agregar mas facilmente
        } else {
            throw new IllegalArgumentException("Tipo de producto no valido");
        }
    }
}
