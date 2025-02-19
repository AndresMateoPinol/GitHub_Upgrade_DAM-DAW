package sesion20250212;

<<<<<<< Updated upstream
=======

class Pedido {
    private String nombre;
    private int cantidad;
    private double precio;
    
    public Pedido(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public double calcularTotal() {
        return cantidad * precio;
    }
    
    public String toString() {
        return nombre + " x" + cantidad + " = " + calcularTotal();
    }
}

class Cliente {
    private String nombre;
    private Pedido[] pedidos;
    private int numPedidos;
    
    public Cliente(String nombre, int maxPedidos) {
        this.nombre = nombre;
        pedidos = new Pedido[maxPedidos];
        numPedidos = 0;
    }
    
    public void agregarPedido(Pedido pedido) {
        if (numPedidos < pedidos.length) {
            pedidos[numPedidos] = pedido;
            numPedidos++;
        }
    }
    
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < numPedidos; i++) {
            total += pedidos[i].calcularTotal();
        }
        return total;
    }
    
    public String toString() {
        String res = nombre + ":\n";
        for (int i = 0; i < numPedidos; i++) {
            res += "  " + pedidos[i] + "\n";
        }
        res += "Total: " + calcularTotal();
        return res;
    }

}




>>>>>>> Stashed changes
public class Ejemplo {

}
