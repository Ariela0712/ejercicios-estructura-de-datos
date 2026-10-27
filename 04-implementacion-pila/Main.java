public class Main {
    public static void main(String[] args) {

        System.out.println("Pruebas de LinkedStack");

        LinkedStack<String> pila = new LinkedStack<String>();

        System.out.println("Pruebas positivas");
        System.out.println("L1 Pila nueva está vacía -> Esperado: true | Obtenido: "+pila.isEmpty());

        pila.push("Texto 1");
        pila.push("Texto 2");
        pila.push("Texto 3");
        pila.push("Texto 4");

        System.out.println("L2 size tras 4 push -> Esperado: 4 | Obtenido: "+pila.size());
        System.out.println("L3 Top tras 4 Push -> Esperado: Texto 4 | Obtenido: "+pila.top());
        System.out.println("L4 size no cambia tras Top -> Esperado: 4 | Obtenido: "+pila.size());
        System.out.println("L5 Pop devuelve el último -> Esperado: Texto 4 | Obtenido: "+pila.pop());
        System.out.println("L6 Top tras Pop -> Esperado: Texto 3 | Obtenido: "+pila.top());
        System.out.println("L7 size tras Pop -> Esperado: 3 | Obtenido: "+pila.size());

        pila.pop();
        pila.pop();
        pila.pop();
        System.out.println("L8 Pila vacía tras sacar todo -> Esperado: true | Obtenido: "+pila.isEmpty());

        System.out.println("Pruebas negativas");
        System.out.println("L9 Pop con pila vacía -> Esperado: null | Obtenido: "+pila.pop());
        System.out.println("L10 Top con pila vacía -> Esperado: null | Obtenido: "+pila.top());
        System.out.println("L11 size tras Pop con pila vacía -> Esperado: 0 | Obtenido: "+pila.size());

        System.out.println();
        System.out.println("Pruebas de EditorNotas");

        EditorNotas editor = new EditorNotas();

        System.out.println("Pruebas positivas ---");
        System.out.println("P1a Escribir \"Hola\" -> Esperado: Escrito correctamente | Obtenido: "+editor.escribir("Hola"));
        editor.escribir(" mundo");
        editor.escribir("!");
        System.out.println("P1b Texto tras tres fragmentos -> Esperado: Hola mundo! | Obtenido: "+editor.getTexto());
        System.out.print("P1c Mostrar -> Esperado: Hola mundo! | Obtenido: ");
        editor.mostrar();
        System.out.println("P2 Cantidad de estados -> Esperado: 3 | Obtenido: "+editor.getCantidadEstados());

        System.out.println("P3a Deshacer una vez -> Esperado: Se ha deshecho el último cambio. | Obtenido: "+editor.deshacer());
        System.out.println("P3b Texto tras deshacer -> Esperado: Hola mundo | Obtenido: "+editor.getTexto());
        System.out.println("P3c Cantidad de estados -> Esperado: 2 | Obtenido: "+editor.getCantidadEstados());
        System.out.println("P4 Último estado guardado -> Esperado: Hola | Obtenido: "+editor.ultEstado());

        editor.deshacer();
        editor.deshacer();
        System.out.println("P5a Texto tras deshacer todo -> Esperado: (vacío) | Obtenido: "+editor.getTexto());
        System.out.println("P5b Hay historial -> Esperado: false | Obtenido: "+editor.hayCambios());
        System.out.println("P5c Cantidad de estados -> Esperado: 0 | Obtenido: "+editor.getCantidadEstados());

        EditorNotas editor2 = new EditorNotas();

        System.out.println("Pruebas negativas");
        System.out.println("N1a Deshacer con historial vacío -> Esperado: Nada que deshacer | Obtenido: "+editor2.deshacer());
        System.out.println("N1b Texto sin cambios -> Esperado: (vacío) | Obtenido: "+editor2.getTexto());
        System.out.println("N2 Ultimo estado con historial vacío -> Esperado: No hay cambios guardados. | Obtenido: "+editor2.ultEstado());
        System.out.println("N3 Escribir cadena vacía -> Esperado: No se puede escribir un fragmento vacío o nulo. | Obtenido: "+editor2.escribir(""));
        System.out.println("N5 Escribir null -> Esperado: No se puede escribir un fragmento vacío o nulo.|Obtenido: "+editor2.escribir(null));
        System.out.println("N6a Texto sin cambios -> Esperado: (vacío) | Obtenido: "+editor2.getTexto());
        System.out.println("N6b Cantidad de estados -> Esperado: 0 | Obtenido: "+editor2.getCantidadEstados());
    }
}
