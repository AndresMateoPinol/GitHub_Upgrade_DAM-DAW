package sesion20250115;

public class Persona {
    
    public static void main(String[] args) {
        System.out.println(sumar(1,2,3));
        System.out.println(sumar(1,2,3,4));
    }

    public static int sumar(int... numeros){ //esto es lo de usar varargs
        int suma = 0;
        for (int num : numeros){
            suma += num;
        }
        return suma;
    }
}

// String palabra = "Hola mundo";
// for (char c : palabra.toCharArray()){
//     System.out.println(c);
// }
