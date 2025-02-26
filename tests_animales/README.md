# tests_animales

Este proyecto contiene una pequeña aplicación Java que ilustra el uso de **POO** (Programación Orientada a Objetos) con **herencia** e **interfaces**, además de **pruebas unitarias** y **pruebas de integración** con **JUnit 5**. Está estructurado como un proyecto **Maven** para facilitar la gestión de dependencias y la ejecución de las pruebas.

---

## Requisitos Previos

1. **Java JDK** (versión 8 o superior; se recomienda 11 o superior).
2. **Maven** instalado y configurado en tu PATH.
3. **VSCode** con las extensiones:
   - *Extension Pack for Java* (para soporte de Java, Maven y JUnit).
   - *Maven for Java* (opcional, pero recomendable).

---

## Estructura del Proyecto

```
tests_animales/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── ejemplo/
│   │               └── animales/
│   │                   ├── Animal.java
│   │                   ├── AbstractAnimal.java
│   │                   ├── Cat.java
│   │                   ├── Dog.java
│   │                   └── AnimalShelter.java
│   └── test/
│       └── java/
│           └── com/
│               └── ejemplo/
│                   └── animales/
│                       ├── CatTest.java
│                       ├── DogTest.java
│                       └── AnimalShelterTest.java
└── pom.xml
```

---

## Pasos para Crear los Archivos de Main (Código Principal)

1. **Animal.java**  
   Interfaz que define el método `makeSound()`.

2. **AbstractAnimal.java**  
   Clase abstracta que implementa `Animal` y contiene un atributo `nombre`.

3. **Cat.java**  
   Clase concreta que extiende `AbstractAnimal`.

4. **Dog.java**  
   Clase concreta que extiende `AbstractAnimal`.

5. **AnimalShelter.java**  
   Clase que integra las funcionalidades de `Animal` (almacena objetos y permite obtener los sonidos de todos ellos).

---

## Pasos para Crear los Archivos de Test

1. **CatTest.java**  
   Pruebas unitarias para verificar los métodos de la clase `Cat`.

2. **DogTest.java**  
   Pruebas unitarias para verificar los métodos de la clase `Dog`.

3. **AnimalShelterTest.java**  
   Pruebas de integración que validan el funcionamiento conjunto en `AnimalShelter`.

---

## Cómo Ejecutar el Proyecto

1. **Clonar o Descargar el Proyecto:**  
   - Si recibiste el proyecto comprimido, descomprímelo y abre la carpeta `tests_animales` en VSCode.
   - Alternativamente, si está en un repositorio Git, clónalo localmente.

2. **Abrir en VSCode:**  
   - Arrastra la carpeta `tests_animales` al explorador de VSCode o utiliza la opción *File > Open Folder...*.

3. **Compilar y Ejecutar las Pruebas:**  
   - Abre la terminal en VSCode (o una terminal del sistema) y ejecuta:
     ```bash
     mvn clean test
     ```
   - Esto descargará las dependencias, compilará el código y ejecutará todas las pruebas JUnit 5.

4. **Ejecución desde la Vista de Testing (opcional):**  
   - En VSCode, haz clic en la pestaña *Testing* (o el ícono de un matraz en la barra lateral).
   - Deberían aparecer las clases de prueba (`CatTest`, `DogTest`, `AnimalShelterTest`).
   - Puedes ejecutar todas las pruebas a la vez o individualmente haciendo clic en el botón de “play” junto a cada clase o método de prueba.

---

## Notas Adicionales

- En caso de que el arquetipo de Maven haya creado una dependencia para **JUnit 4**, revisa tu archivo `pom.xml` y reemplázala por la dependencia de **JUnit 5**:
  ```xml
  <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter</artifactId>
      <version>5.8.2</version>
      <scope>test</scope>
  </dependency>
  ```
- El plugin Surefire (versión 2.22.1 o superior) se encarga de detectar y ejecutar las pruebas con JUnit 5.

---

## Autor

Este proyecto de ejemplo fue diseñado para ilustrar los conceptos de POO en Java y la creación de pruebas unitarias e integración con JUnit 5 dentro de un proyecto Maven.
