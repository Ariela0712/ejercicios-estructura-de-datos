# Ejercicios de Estructuras de Datos

Colección de ejercicios en **Java** donde las estructuras de datos se implementan **desde cero** (sin usar `java.util.ArrayList`, `java.util.LinkedList` ni otras colecciones de Java) y se aplican a casos prácticos.

## ¿Qué hace este repositorio?

Reúne ejercicios de la asignatura de Estructuras de Datos. Cada uno incluye:

- La implementación propia de una estructura (lista basada en arreglo, lista simplemente enlazada o pila enlazada).
- Un caso de uso concreto que la pone en práctica (sala de espera, cola de reproducción, editor con deshacer, registro de estudiantes y profesores...).
- Validación de datos y casos de prueba positivos y negativos.
- Su propio `README.md` con el enunciado, las clases y las instrucciones de ejecución.

## ¿Por qué es útil?

- **Para aprender:** ver cómo funcionan por dentro nodos, punteros, índices y arreglos dinámicos ayuda a entender qué hacen las colecciones que Java ofrece ya hechas.
- **Para comparar:** puedes ver la misma interfaz `List<E>` implementada con un arreglo (`ArrayList`) y con nodos (`LinkedList`).
- **Para practicar:** los ejercicios cubren operaciones habituales: insertar, eliminar, invertir, rotar, concatenar, ordenar y contar.
- **Para reutilizar:** el código es sencillo, está separado por responsabilidades y puede servir de base para tus propias prácticas.

## Contenido

| Carpeta | Ejercicio | Estructura | Qué practica |
| --- | --- | --- | --- |
| [`00-arraylist-linkedlist/consultorio-arraylist`](./00-arraylist-linkedlist/consultorio-arraylist/README.md) | Sala de espera del consultorio "Dr. Salas" | `ArrayList<E>` propia | Arreglo dinámico, inserción por índice, validación de datos |
| [`00-arraylist-linkedlist/listaMusical-linkedlist`](./00-arraylist-linkedlist/listaMusical-linkedlist/README.md) | Cola de reproducción de la app Sonora | `LinkedList<E>` propia | Nodos, inserción y eliminación por índice, inversión de enlaces |
| [`01-ejercicio-cp2`](./01-ejercicio-cp2/README.md) | Clase práctica 2 | Lista simplemente enlazada | Eliminar repetidos, rotar a la derecha, concatenar listas |
| [`02-lista-estudiantes`](./02-lista-estudiantes/README.md) | Control de estudiantes | Lista simplemente enlazada | Filtrar, ordenar y contar elementos |
| [`03-lista-profesores`](./03-lista-profesores/README.md) | Control de profesores | Lista simplemente enlazada | Selección, ordenamiento y conteo por categoría |
| [`04-implementacion-pila`](./04-implementacion-pila/README.md) | Editor de notas con deshacer | Pila enlazada (`LinkedStack<E>`) | Comportamiento LIFO: `push`, `pop`, `top` |

> Se recomienda seguir el orden de las carpetas: de las listas básicas a las aplicaciones más completas.

## Cómo comenzar

### Requisitos

- **JDK** instalado (incluye `javac` y `java`). Puedes comprobarlo con:

  ```bash
  java -version
  javac -version
  ```

- Un editor o IDE de tu preferencia (VS Code, IntelliJ, Eclipse...) o simplemente una terminal.
- No se necesitan dependencias externas.

### 1. Obtener el código

```bash
git clone https://github.com/<tu-usuario>/ejercicios-estructura-de-datos.git
cd ejercicios-estructura-de-datos
```

También puedes descargar el repositorio como ZIP desde el botón **Code** de GitHub.

### 2. Elegir un ejercicio y ejecutarlo

Cada ejercicio es independiente: entra en su carpeta, compila y ejecuta `Main`. Por ejemplo, con la lista de estudiantes:

```bash
cd 02-lista-estudiantes
javac *.java
java Main
```

Los ejercicios `01`, `02` y `03` muestran un menú interactivo; en `02` y `03` la opción **6** ejecuta casos de prueba, y en `01` lo hace la opción **9**. Los ejercicios `00` y `04` ejecutan sus pruebas directamente al correr `Main`. Si algún ejercicio requiere pasos distintos, su propio `README.md` lo indica.

## Estructura del repositorio

```text
ejercicios-estructura-de-datos/
├── README.md
├── 00-arraylist-linkedlist/
│   ├── consultorio-arraylist/
│   └── listaMusical-linkedlist/
├── 01-ejercicio-cp2/
├── 02-lista-estudiantes/
├── 03-lista-profesores/
└── 04-implementacion-pila/
```

Dentro de cada carpeta de ejercicio están los archivos `.java` y su `README.md`.

## Ayuda

- Empieza por el `README.md` de cada ejercicio: explica el enunciado, las clases y cómo ejecutarlo.
- Si encuentras un error o tienes una duda, abre un [issue](../../issues) en este repositorio.
- Si no consigues compilar o ejecutar, revisa que `javac -version` funcione y que estés dentro de la carpeta del ejercicio.

## Autoría y contribuciones

Repositorio creado y mantenido por [@Ariela0712](https://github.com/<Ariela0712>) con fines didácticos.
