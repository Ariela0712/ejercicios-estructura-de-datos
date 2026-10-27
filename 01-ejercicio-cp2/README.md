# Clase Práctica 2: Lista simplemente enlazada

Este proyecto implementa una lista simplemente enlazada en Java con operaciones básicas y funciones adicionales pedidas por el ejercicio práctico.

## ¿Qué hace el proyecto?

La aplicación permite trabajar con una lista enlazada y realizar las siguientes operaciones:

- Agregar elementos al final
- Insertar elementos en una posición específica
- Eliminar un elemento por posición
- Mostrar la lista actual
- Eliminar elementos duplicados
- Rotar una posición a la derecha
- Concatenar dos listas
- Vaciar la lista
- Ejecutar casos de prueba predefinidos

## ¿Por qué es útil?

Este proyecto sirve para practicar y comprender el funcionamiento de estructuras de datos lineales, especialmente:

- nodos
- listas enlazadas
- recorrido de nodos
- manipulación de punteros o referencias
- operaciones de eliminación, rotación y concatenación

Es un ejercicio ideal para reforzar conceptos de programación orientada a objetos y algoritmos básicos sobre listas.

## Cómo comenzar

1. Asegúrate de tener Java (JDK) instalado.
2. Abre una terminal en la carpeta del ejercicio: `cd 01-ejercicio-cp2`
3. Compila los archivos fuente:

```bash
javac *.java
```

4. Ejecuta la aplicación:

```bash
java Main
```

## Estructura del proyecto

```text
01-ejercicio-cp2/
├── LinkedList.java
├── List.java
├── Main.java
├── Nodo.java
├── Sistema.java
├── Validaciones.java
└── README.md
```

- `Main.java`: punto de entrada del programa
- `Sistema.java`: menú interactivo y lógica del usuario
- `LinkedList.java`: implementación de la lista enlazada
- `Nodo.java`: clase Nodo
- `List.java`: interfaz de la lista
- `Validaciones.java`: validación de entrada del usuario

## Requisitos del ejercicio

La lista implementa los siguientes métodos solicitados:

1. Eliminar elementos repetidos
2. Rotar una posición a la derecha
3. Concatenar dos listas

Ejemplos:

- `A-B-C-D` -> rotación derecha -> `D-A-B-C`
- `A-B-C-D` + `E-F-G-H` -> `A-B-C-D-E-F-G-H`
