public class Revista implements Producto {
    private String issn;
    private String nombre;
    private int numeroEdicion;
    private double precio;
    private String periodicidad;

    public Revista(String issn, String nombre, int numeroEdicion, double precio, String periodicidad) {
        this.issn = issn;
        this.nombre = nombre;
        this.numeroEdicion = numeroEdicion;
        this.precio = precio;
        this.periodicidad = periodicidad;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Revista: " + nombre);
        System.out.println("ISSN: " + issn);
        System.out.println("Numero de edicion: " + numeroEdicion);
        System.out.println("Precio: " + precio);
        System.out.println("Periodicidad: " + periodicidad);
    }
}
