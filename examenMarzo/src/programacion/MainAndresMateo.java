package programacion;

// Interfaz que define la estructura de una receta de mazapán
interface RecetaMazapan {
    String obtenerReceta();
}

// Implementación de la receta clásica de mazapán
class MazapanClasico implements RecetaMazapan {
    @Override
    public String obtenerReceta() {
        return "Receta de Mazapán Clásico:\nIngredientes: Almendras, azúcar, clara de huevo.\nPreparación: Mezclar, triturar y hornear.";
    }
}

// Implementación de la receta de mazapán con chocolate
class MazapanChocolate implements RecetaMazapan {
    @Override
    public String obtenerReceta() {
        return "Receta de Mazapán con Chocolate:\nIngredientes: Almendras, azúcar, clara de huevo, cacao en polvo.\nPreparación: Mezclar, triturar, añadir cacao y hornear.";
    }
}

// Clase que gestiona las recetas de mazapán
class RecetarioMazapan {
    private RecetaMazapan receta;

    // Constructor que inicializa con una receta específica
    public RecetarioMazapan(RecetaMazapan receta) {
        this.receta = receta;
    }

    // Getter del atributo
    public RecetaMazapan getReceta() {
        return receta;
    }

    // Método para cambiar la receta actual
    public void setReceta(RecetaMazapan receta) {
        this.receta = receta;
    }

    // Método para mostrar la receta actual
    public void mostrarReceta() {
        System.out.println("Receta seleccionada:\n" + receta.obtenerReceta());
    }
}

// Clase principal para ejecutar el programa
public class MainAndresMateo {
    public static void main(String[] args) {
        // Se inicia el recetario con la receta clásica
        RecetarioMazapan miRecetario = new RecetarioMazapan(new MazapanClasico());
        miRecetario.mostrarReceta();

        // Se cambia la receta a mazapán con chocolate
        miRecetario.setReceta(new MazapanChocolate());
        miRecetario.mostrarReceta();
    }
}
