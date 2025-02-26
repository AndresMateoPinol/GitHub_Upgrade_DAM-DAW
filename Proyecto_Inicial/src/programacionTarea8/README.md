# ⭐ Actividad 8: Sistema de Vehículos y Transporte 🚗🚲🚢

## **📚 Objetivo**  
Crear un sistema de transporte en **múltiples archivos `.java`**, organizados en **diferentes paquetes** (`transporte` y `app`). 

---

## **📌 Requisitos**
1. **Crear un paquete `transporte`**, donde estarán todas las clases e interfaces necesarias.
2. **Dentro de `transporte`**, crear:
   - **Una clase `Vehiculo`** con:
     - Un atributo `velocidadMaxima`.
     - Un método `arrancar()`, que imprima `"El vehículo está en marcha."`.
     - Un método **abstracto** `describir()`, que cada subclase deberá implementar.
   - **Una interfaz `ConMotor`** con:
     - Un método `encenderMotor()`, que imprima `"El motor está encendido."`.
   - **Una interfaz `SinMotor`** con:
     - Un método `usarFuerzaHumana()`, que imprima `"Usando fuerza humana para moverse."`.
   - **Una clase `Coche` que herede de `Vehiculo` e implemente `ConMotor`**.
   - **Una clase `Bicicleta` que herede de `Vehiculo` e implemente `SinMotor`**.
   - **Una clase `Barco` que herede de `Vehiculo` e implemente `ConMotor`**.
   - **Una clase `Avion` que sea `final` y herede de `Vehiculo` e implemente `ConMotor`**.

3. **Crear otro paquete `app`**, donde estará la clase `Main` para probar todas las clases de `transporte`.
4. **Importar y usar las clases de `transporte` en `Main`**.

---

## **📂 Estructura de Archivos**
```
proyecto_transporte/
│── src/
│   ├── transporte/
│   │   ├── Vehiculo.java
│   │   ├── ConMotor.java
│   │   ├── SinMotor.java
│   │   ├── Coche.java
│   │   ├── Bicicleta.java
│   │   ├── Barco.java
│   │   ├── Avion.java
│   ├── app/
│   │   ├── Main.java
│── .gitignore 
│── README.md
```

---

## **🔍 Salida Esperada en Consola**
```plaintext
El vehículo está en marcha.
El motor del coche está encendido.
Soy un coche que puede alcanzar 180 km/h.

El vehículo está en marcha.
Usando fuerza humana para mover la bicicleta.
Soy una bicicleta con una velocidad máxima de 30 km/h.

El vehículo está en marcha.
El motor del barco está encendido.
Soy un barco que navega a 50 km/h.

El vehículo está en marcha.
El motor del avión está encendido.
Soy un avión que vuela a 900 km/h.
```

---

## **📚 Instrucciones:**
1. **Crear la estructura de paquetes y archivos como se indica**.
2. **Escribir el código asegurándose de que cada clase esté en su archivo correspondiente**.
3. **Implementar los atributos y métodos necesarios** en cada clase e interfaz, **asegurándose de emplear los modificadores de acceso correctos**.
4. **Crear los getters y setters necesarios** para los atributos de cada clase.
5. **Compilar y ejecutar `Main.java`** para verificar la salida esperada.
6. **(Opcional) Agregar más clases o métodos para ampliar el sistema**.
7. **(Opcional) Realizar la tarea en grupos de hasta 4 integrantes, realizando cada uno la entrega por separado pero indicándolo en el mensaje**.
8. **Subir el código a GitHub en un nuevo repositorio, dejar este archivo como `README.md` del mismo y enviar la URL del último commit como respuesta a la tarea en el aula virtual. Si hay varios integrantes, todos deberán ser colaboradores del repositorio**.

---

## **🔄 Conceptos que repasan con esta tarea**
✅ **Uso de paquetes (`transporte` y `app`)** para organizar mejor el código.  
✅ **Herencia y abstracción (`abstract`)** en `Vehiculo`.  
✅ **Interfaces (`implements`)** para definir comportamientos (`ConMotor`, `SinMotor`).  
✅ **Clases finales (`final`)** con `Avion`, evitando su herencia.  
✅ **Importación de clases desde otro paquete (`import transporte.*;`)**.  
✅ **Creación de un método `Main`** para probar las clases del sistema.