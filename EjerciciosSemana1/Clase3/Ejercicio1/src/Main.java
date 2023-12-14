public class Main {
    public static void main(String[] args) {
        Electrodomestico e1 = new Electrodomestico(1,"Bosch","Lavadora E1",100,"Blanco");
        Electrodomestico e2 = new Electrodomestico(2,"Fujitsu","Aire acondicionado A1",400,"Blanco");
        Electrodomestico e3 = new Electrodomestico(3,"Fagor","Horno H1",1000,"Gris");
        Electrodomestico e4 = new Electrodomestico();

        System.out.println("Electrodomestico " + e1.getCod()+" Marca: "+e1.getMarca()+" Modelo: "+e1.getModelo()+" Consumo(KwH): "+e1.getConsumo());
        System.out.println("Electrodomestico " + e2.getCod()+" Marca: "+e2.getMarca()+" Modelo: "+e2.getModelo()+" Consumo(KwH): "+e2.getConsumo());
        System.out.println("Electrodomestico " + e3.getCod()+" Marca: "+e3.getMarca()+" Modelo: "+e3.getModelo()+" Consumo(KwH): "+e3.getConsumo());
        System.out.println("Electrodomestico " + e4.getMarca());


    }
}