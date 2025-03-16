# Ejercicio: Sistema de Recetas de Galletas


**Gestión de recetas de galletas en una aplicación modular.**  


## Enunciado
Se debe diseñar un sistema que permita manejar diferentes **variantes de galletas** a través de una **interfaz genérica** de recetas.  
El usuario podrá seleccionar distintas versiones de la receta y obtener información sobre los ingredientes y el procedimiento.

---

## 📌 Requisitos

1. **Crea una interfaz `RecetaGalleta`** con el método:  
    ```java
    String obtenerReceta();
    ```  
    - Este método devolverá la información sobre la receta de la galleta.

2. **Implementa las siguientes clases que representen variantes de galletas:**  
    - **`GalletaChispas`** → Receta tradicional de galletas con chispas de chocolate (es mezclar y hornear, escribe tú la frase).  
    - **`GalletaAvena`** → Receta de galletas integrales con avena (es mezclar y hornear, escribe tú la frase).

3. **Crea una clase `RecetarioGalletas`** que:  
    - Contenga un **atributo privado `RecetaGalleta receta`**.  
    - Tenga un **constructor que permita asignar una receta inicial**.  
    - Tenga un método getter.  
    - Tenga un método `setReceta(RecetaGalleta receta)` para cambiar la receta activa.  
    - Tenga un método `mostrarReceta()`, que imprima la receta actual.

4. **En el método `main()` de la clase principal `Main[Nombre][Apellido]`**:  
    - Crea un `RecetarioGalletas` con la receta de **galleta de chispas de chocolate**.  
    - Muestra la receta actual.  
    - Cambia a la receta de **galleta de avena**.  
    - Muestra la nueva receta.
