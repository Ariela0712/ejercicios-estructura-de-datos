# Estructura-de-datos-Pilas-LIFO
# Implementación de una pila enlazada y editor de notas

Ejercicio de Java que implementa una pila genérica enlazada (`LinkedStack`) y la utiliza para simular un editor de texto básico con opción de deshacer.

## Enunciado y problemática

Simular un editor de texto muy básico usando `LinkedStack<String>`. La pila almacena los estados anteriores del texto:

- `escribir(String fragmento)`: guarda el texto actual en el historial y agrega el fragmento.
- `deshacer()`: recupera el último estado guardado y lo establece como texto actual. Si no hay estados, informa que no hay nada que deshacer.
- `mostrar()`: imprime el texto actual.
- `ultEstado()`: consulta el estado al que se volvería al deshacer, sin modificar el historial.

El ejercicio también implementa la estructura de pila enlazada necesaria para almacenar esos estados.

## Objetivo

Practicar estructuras de datos genéricas en Java, especialmente una pila LIFO implementada con nodos enlazados, y aplicar sus operaciones para mantener y recuperar versiones anteriores de un texto.

## Funcionalidades

### Pila enlazada

La clase `LinkedStack<E>` implementa la interfaz `IStack<E>` y ofrece:

- `push(E item)`: agrega un elemento al tope.
- `pop()`: retira y devuelve el elemento del tope.
- `top()`: consulta el elemento del tope sin retirarlo.
- `isEmpty()`: indica si la pila está vacía.
- `size()`: devuelve la cantidad de elementos.

Cuando se llama a `pop()` o `top()` con la pila vacía, se imprime un mensaje de error y se devuelve `null`.

### Editor de notas

La clase `EditorNotas` ofrece:

- Escritura de fragmentos y almacenamiento de cada estado anterior.
- Deshacer del último cambio.
- Impresión y consulta del texto actual.
- Consulta del estado anterior que se recuperaría con `ultEstado()`.
- Rechazo de fragmentos `null` o vacíos (incluidos los que solo contienen espacios).

## Estructura del proyecto

```text
.
├── README.md
└── ImplementacionPila/
    ├── EditorNotas.java
    ├── IStack.java
    ├── LinkedStack.java
    ├── Main.java
    └── Nodo.java
```

Descripción de los archivos:

| Archivo | Responsabilidad |
|---|---|
| `IStack.java` | Define las operaciones de una pila genérica. |
| `Nodo.java` | Representa cada nodo y su enlace al siguiente. |
| `LinkedStack.java` | Implementa la pila enlazada genérica. |
| `EditorNotas.java` | Implementa el editor y su historial de texto. |
| `Main.java` | Ejecuta pruebas manuales de la pila y del editor. |

## Requisitos

- JDK instalado (incluye `javac` y `java`).
- No se requieren dependencias externas.

Puedes comprobar que Java está disponible con:

```text
java -version
javac -version
```

## Cómo compilar y ejecutar

Abre una terminal en la raíz del repositorio y entra a la carpeta de las clases.

### Windows (PowerShell)

```powershell
cd ImplementacionPila
New-Item -ItemType Directory -Force out
javac -d out IStack.java Nodo.java LinkedStack.java EditorNotas.java Main.java
java -cp out Main
```

### macOS o Linux

```bash
cd ImplementacionPila
mkdir -p out
javac -d out IStack.java Nodo.java LinkedStack.java EditorNotas.java Main.java
java -cp out Main
```

La compilación deja los archivos `.class` en `ImplementacionPila/out`, separados de los archivos fuente.

## Pruebas incluidas

Al ejecutar `Main`, se muestran resultados esperados y obtenidos:

- Estado vacío, tamaño y operaciones `push`, `pop` y `top`.
- Comportamiento de `pop` y `top` en una pila vacía.
- Escritura de varios fragmentos y recuperación de estados anteriores.
- Consulta del último estado guardado sin modificar el historial.
- Deshacer hasta volver al texto vacío.
- Rechazo de fragmentos vacíos y nulos.

## Posible uso

Este ejercicio sirve como demostración didáctica del patrón LIFO y de cómo una pila puede guardar estados para implementar una función de deshacer. La misma idea puede adaptarse a editores sencillos, formularios o aplicaciones que necesiten recuperar cambios recientes.
