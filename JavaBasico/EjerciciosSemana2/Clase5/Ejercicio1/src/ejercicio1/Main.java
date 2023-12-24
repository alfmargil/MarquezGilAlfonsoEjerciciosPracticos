package ejercicio1;
public class Main
{

    public static void main(String[] args)
    {
        
        
        Mamifero animal1 = new Mamifero();
        Ave animal2 = new Ave();
        Reptil animal3 = new Reptil();
        
        animal1.saludar();
        animal2.saludar();
        animal3.saludar();
        
        Animal animal4 = animal1;
        
        animal4.saludar();
        
    }
    
}
