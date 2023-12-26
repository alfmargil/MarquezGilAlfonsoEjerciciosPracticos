/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Alfonso
 */
public class Main
{

    public static void main(String[] args)
    {

        Vestimenta[] vestimentas = new Vestimenta[9];

        vestimentas[0] = new Zapato("Cuero", "Cordones", 10, "Zapatos cuero", 99.99, "Levi's", "47", "Marrón");
        vestimentas[1] = new Zapato("Tela", "Cordones", 3, "Adidas Azul", 69.99, "Adidas", "43", "Azul");
        vestimentas[2] = new Zapato("Tela", "Velcro", 6, "Negros Velcro", 32.00, "Nike", "39", "Negro");
        vestimentas[3] = new Pantalon("Tejano", "Algodon", 4, "Vaqueros azul", 49.99, "Vaqueritos", "41", "Azul");
        vestimentas[4] = new Pantalon("Chino", "Lino", 5, "Chino beige", 67.99, "Pantaloncitos", "36", "Beige");
        vestimentas[5] = new Pantalon("Mezclilla", "Algodon", 8, "Jeans clásicos", 59.99, "Marquitos", "38", "Azul");
        vestimentas[6] = new Camiseta("Manga corta", "Redondo", 15, "Camiseta básica", 29.99, "MarcaA", "M", "Blanco");
        vestimentas[7] = new Camiseta("Manga larga", "V", 12, "Camiseta rayada", 39.99, "MarcaB", "L", "Azul");
        vestimentas[8] = new Sombrero("Paja", "Grande", 7, "Sombrero playero", 19.99, "Verano", "Única", "Beige");

         for (Vestimenta prenda : vestimentas) {
            if (prenda instanceof Zapato) {
                ((Zapato) prenda).mostrarMensaje();
            } else if (prenda instanceof Pantalon) {
                ((Pantalon) prenda).mostrarMensaje();
            } else if (prenda instanceof Camiseta) {
                ((Camiseta) prenda).mostrarMensaje();
            } else if (prenda instanceof Sombrero) {
                ((Sombrero) prenda).mostrarMensaje();
            }
         }
        
        
    }

}
