# Ejercicio: Sistema de Recetas de Mazapanes


**Gestión de recetas de mazapanes en una aplicación modular.**  
 

## Enunciado
Se debe diseñar un sistema que permita manejar diferentes **variantes de mazapanes** a través de una **interfaz genérica** de recetas.  
El usuario podrá seleccionar distintas versiones de la receta y obtener información sobre los ingredientes y el procedimiento.

---

## 📌 Requisitos

1. **Crea una interfaz `RecetaMazapan`** con el método:
   ```java
   String obtenerReceta();
   ```
   - Este método devolverá la información sobre la receta de mazapán.

2. **Implementa las siguientes clases que representen variantes de mazapanes:**
   - **`MazapanClasico`** → Receta tradicional con almendras, azúcar y clara de huevo (es mezclar y hornear, escribe tú la frase).
   - **`MazapanChocolate`** → Receta con cacao añadido para una versión chocolatada (es mezclar y hornear, escribe tú la frase).

3. **Crea una clase `RecetarioMazapan`** que:
   - Contenga un **atributo privado `RecetaMazapan receta`**.
   - Tenga un **constructor que permita asignar una receta inicial**.
   - Tenga un método getter.
   - Tenga un método `setReceta(RecetaMazapan receta)` para cambiar la receta activa.
   - Tenga un método `mostrarReceta()`, que imprima la receta actual.

4. **En el método `main()` de la clase principal `Main[Nombre][Apellido]`**:
   - Crea un `RecetarioMazapan` con la receta de **mazapán clásico**.
   - Muestra la receta actual.
   - Cambia a la receta de **mazapán con chocolate**.
   - Muestra la nueva receta.

