public class Periodico implements Producto {
    private String id;
    private String nombre;
    private String fechaPublicacion;
    private double precio;

    public Periodico(String id, String nombre, String fechaPublicacion, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.fechaPublicacion = fechaPublicacion;
        this.precio = precio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Periodico: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Fecha de publicacion: " + fechaPublicacion);
        System.out.println("Precio: " + precio);
    }
}
