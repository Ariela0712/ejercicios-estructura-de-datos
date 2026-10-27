# Sistema de control de profesores

Aplicación de consola desarrollada en Java para registrar profesores y consultar su información mediante una lista simplemente enlazada implementada en el proyecto.

## Enunciado

En el departamento de Informática se necesita controlar los datos de los profesores. De cada profesor se conoce su nombre, edad y categoría docente: Instructor, Asistente, Auxiliar o Titular. El sistema implementa una lista simplemente enlazada y ofrece operaciones para identificar instructores próximos a cambiar de categoría, mostrar los profesores ordenados por edad y contar profesores por categoría.

## Objetivos

- Implementar una lista simplemente enlazada genérica.
- Modelar los datos de un profesor.
- Recorrer y procesar los elementos de la lista.
- Aplicar criterios de selección, ordenamiento y conteo.
- Comprobar los métodos con casos de ejemplo desde el menú de la aplicación.

## Funcionalidades

- Registrar profesores con nombre, edad y categoría.
- Mostrar los profesores registrados.
- Listar los nombres de los instructores mayores de 26 años, que son quienes están próximos a cambiar a la categoría de Asistente. La condición es estrictamente `edad > 26`; un instructor de 26 años no se incluye.
- Mostrar los profesores ordenados de mayor a menor edad. El método genera una lista ordenada sin cambiar el orden de la lista original.
- Mostrar la cantidad de profesores en cada categoría, incluso si alguna categoría tiene cero profesores.
- Ejecutar los casos de ejemplo integrados en la opción 6 del menú.

## Requisitos

- JDK instalado (incluye `javac` y `java`).
- Terminal o consola para compilar y ejecutar el programa.

## Estructura del proyecto

```text
03-lista-profesores/
├── LinkedList.java
├── List.java
├── ListaProfesores.java
├── Main.java
├── Nodo.java
├── Profesor.java
├── Sistema.java
├── Validaciones.java
└── README.md
```

## Compilar y ejecutar

Abre una terminal en la carpeta del ejercicio (`03-lista-profesores`) y ejecuta:

```powershell
javac List.java LinkedList.java Nodo.java Profesor.java ListaProfesores.java Validaciones.java Sistema.java Main.java
java Main
```

Al ejecutar el programa aparecerá un menú. Selecciona una opción introduciendo su número:

| Opción | Acción |
| --- | --- |
| 1 | Agregar profesor |
| 2 | Mostrar profesores registrados |
| 3 | Mostrar instructores próximos al cambio de categoría |
| 4 | Mostrar profesores ordenados por edad |
| 5 | Mostrar la cantidad de profesores por categoría |
| 6 | Ejecutar casos de ejemplo de los métodos |
| 0 | Salir |

La compilación genera archivos `.class` en la carpeta del ejercicio.

## Implementación de la lista

`LinkedList<E>` implementa las operaciones básicas de la lista enlazada: agregar al final o en un índice, obtener y eliminar un elemento por índice, consultar el tamaño, comprobar si está vacía y limpiar la lista. Cada nodo (`Nodo<E>`) almacena un dato y una referencia al siguiente nodo.

`ListaProfesores` extiende la lista enlazada para trabajar con objetos `Profesor` e implementa los métodos requeridos:

- `proxCambio()`
- `mostrarLista()`
- `cantProfesores()`

## Casos de ejemplo

La opción 6 utiliza datos de muestra para enseñar los resultados de los tres métodos. Incluye una lista vacía, un caso sin instructores que cumplan la edad requerida y una comprobación visual de que el orden original se conserva al mostrar la lista ordenada. Estos casos se ejecutan desde el menú y muestran los resultados en consola.
