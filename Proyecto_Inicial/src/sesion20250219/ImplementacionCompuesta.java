package sesion20250219;

interface Hundible{
    void hundir();
}
interface Flotable{
    void flotar();
}
interface Permeable{
    default void mojar(){
        System.out.println("El objeto se ha mojado");
    }
}
interface Comestible{
    void comer();
}

abstract class Item {
    String nombre;
    int id;

    public Item(String nombre, int id){
        this.nombre=nombre;
        this.id=id;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
}


class Piedra extends Item implements Hundible, Permeable {
    public Piedra(String nombre, int id){       
        super(nombre, id);
    }
    public void hundir(){
        System.out.println("La piedra se ha hundido");
    }
    public void mojar(){
        System.out.println("La piedra se ha mojado");
    }
}

class Cosa extends Item implements Flotable, Permeable, Comestible {
    public Cosa(String nombre, int id){
        super(nombre, id);
    }
    public void flotar(){
        System.out.println("La cosa flota");
    }
    public void comer(){
        System.out.println("La cosa estaba rica");
    }
}



// class Cosa implements Flotable, Permeable, Comestible {
    
//     String nombre;
//     int id;

//     public Cosa(String nombre, int id){
//         this.nombre=nombre;
//         this.id=id;
//     }
//     public String getNombre(){
//         return nombre;
//     }
//     public int getId(){
//         return id;
//     }


//     public void flotar(){
//         System.out.println("La cosa flota");
//     }
//     public void mojar(){
//         System.out.println("La cosa está mojada");
//     }
//     public void comer(){
//         System.out.println("La cosa estaba rica");
//     }
// }



public class ImplementacionCompuesta {
    public static void main(String[] args) {
        Piedra piedra=new Piedra("Piedra", 1);
        Cosa cosa=new Cosa("Cosa", 2);
        System.out.println("La "+piedra.getNombre()+" con id "+piedra.getId()+" es: ");
        piedra.hundir();
        piedra.mojar();
        System.out.println("La "+cosa.getNombre()+" con id "+cosa.getId()+" es: ");
        cosa.flotar();
        cosa.mojar();
        cosa.comer();
    }
}
