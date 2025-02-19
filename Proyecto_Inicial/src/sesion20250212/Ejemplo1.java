package sesion20250212;

class Empleado{
    // Quiero que todos los empleados tengan un nombre, un salario y un método que resuma esta información
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario){
        this.nombre=nombre;
        this.salario=salario;
    }

    public void resumen(){
        System.out.println("El empleado "+ nombre+ " tiene un salario de "+ salario+"€.");
    }
}

class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, double salario, String departamento){
        super(nombre,salario);
        this.departamento=departamento;
    }

    @Override
    public void resumen(){
        System.out.println("El gerente "+ nombre+ " del departamento "+ departamento +" tiene un salario de "+ salario+"€.");
    }

}

class Programador extends Empleado{
    private String lenguaje;
    public Programador(String nombre, double salario, String lenguaje){
        super(nombre, salario);
        this.lenguaje=lenguaje;
    }

    @Override
    public void resumen(){
        System.out.println("El programador "+ nombre+ " de lenguaje "+ lenguaje +" tiene un salario de "+ salario+"€.");
    }
}







public class Ejemplo1 {
    public static void main(String[] args) {
        Gerente ana = new Gerente("Ana", 5000, "IT");
        Programador juan = new Programador("Juan", 2500, "Java");
        ana.resumen();
        juan.resumen();
}
}
