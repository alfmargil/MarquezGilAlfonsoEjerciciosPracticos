package ejercicio2;

import java.util.ArrayList;
import models.*;

// Autor Alfonso
public class Main
{

    public static void main(String[] args)
    {
        ArrayList<Producto> inventario = new ArrayList<>();

        inventario.add(new Producto(1, "Teléfono", "Marca1", "Electrónico", 200, 400, 10));
        inventario.add(new Producto(2, "Laptop", "Marca2", "Computadora", 800, 1200, 15));
        inventario.add(new Producto(3, "Auriculares", "Marca3", "Accesorio", 50, 100, 20));
        inventario.add(new Producto(4, "Cargador", "Marca4", "Accesorio", 15, 30, 30));
        inventario.add(new Producto(5, "Tablet", "Marca5", "Electrónico", 300, 500, 12));
        inventario.add(new Producto(6, "Smartwatch", "Marca6", "Electrónico", 150, 250, 18));
        inventario.add(new Producto(7, "Teclado", "Marca7", "Accesorio", 40, 80, 25));
        inventario.add(new Producto(8, "Monitor", "Marca8", "Accesorio", 250, 400, 8));
        inventario.add(new Producto(9, "Impresora", "Marca9", "Electrónico", 180, 300, 10));
        inventario.add(new Producto(10, "Altavoces", "Marca10", "Accesorio", 80, 150, 22));

        // He optado por recorrer el arraylist una sola vez y hacer todas las comparaciones necesarias
        Producto maxPrecioVenta = inventario.get(0);
        Producto minPrecioCosto = inventario.get(0);
        Producto maxStock = inventario.get(0);

        for (Producto producto : inventario) {
            if (producto.getPrecioVenta() > maxPrecioVenta.getPrecioVenta()) {
                maxPrecioVenta = producto;
            }

            if (producto.getPrecioCosto() < minPrecioCosto.getPrecioCosto()) {
                minPrecioCosto = producto;
            }

            if (producto.getCantidadStock() > maxStock.getCantidadStock()) {
                maxStock = producto;
            }

        }

        System.out.println("El producto con el mayor precio de venta es: " + maxPrecioVenta);
        System.out.println("El producto con el menor precio de costo es: " + minPrecioCosto);

        // Elimino el producto de la posicion 5
        if (inventario.size() > 5) {
            Producto productoBorrado = inventario.remove(5);
            System.out.println("Se ha eliminado el producto en la posición 5: " + productoBorrado);
        } else {
            System.out.println("No hay un producto en la posición 5 para borrar.");
        }

        // Descontar 3 unidades del producto con la mayor cantidad en stock
        if (maxStock.getCantidadStock() >= 3) {
            maxStock.setCantidadStock(maxStock.getCantidadStock() - 3);
            System.out.println("Se han descontado 3 unidades del producto con la mayor cantidad en stock.");
        } else {
            System.out.println("No hay suficientes unidades para descontar del producto con la mayor cantidad en stock.");
        }

    }

}
