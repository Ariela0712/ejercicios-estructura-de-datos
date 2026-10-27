public class Sistema {
    private ListaProfesores lista;
    private Validaciones val;

    public Sistema() {
        this.lista = new ListaProfesores();
        this.val = new Validaciones();
    }

    public void iniciar() {
        int op = -1;
        while (op != 0) {
            mostrarMenu();
            op = val.validarEntero("Elige una opción: ",0,6);
            if(op == 1){
                agregarProfesor();
            } else if(op == 2){
                mostrarProfesores("Profesores registrados",lista);
            } else if(op == 3){
                mostrarNombres("Próximos a cambio de categoría", lista.proxCambio());
            } else if(op == 4){
                mostrarProfesores("Profesores ordenados por edad (mayor a menor)", lista.mostrarLista());
            } else if(op == 5){
                System.out.println("\nCantidad de profesores por categoría:");
                System.out.println(lista.cantProfesores());
            } else if(op == 6){
                ejecutarPruebas();
            } else {
                System.out.println("Saliendo del sistema....");
            }
        }
    }

    private void mostrarMenu() {
        System.out.println("\nMenu: Control de profesores");
        System.out.println("1. Agregar profesor");
        System.out.println("2. Mostrar profesores registrados");
        System.out.println("3. Profesores próximos a cambio de categoría");
        System.out.println("4. Mostrar lista ordenada por edad");
        System.out.println("5. Cantidad de profesores por categoría");
        System.out.println("6. Ejecutar casos de prueba");
        System.out.println("0. Salir");
    }

    private void agregarProfesor() {
        String nombre = val.validarNombre("Nombre: ");
        int edad = val.validarEntero("Edad (18 a 100): ",18,100);
        System.out.println("Categoría: 1.Instructor  2.Asistente  3.Auxiliar  4.Titular");
        int c = val.validarEntero("Categoría(1 a 4): ", 1, 4);
        String categoria;
        if (c == 1) {
            categoria = "Instructor";
        } else if (c == 2) {
            categoria = "Asistente";
        } else if (c == 3) {
            categoria = "Auxiliar";
        } else {
            categoria = "Titular";
        }
        lista.add(new Profesor(nombre,edad,categoria));
        System.out.println("Profesor agregado.");
    }

    private void ejecutarPruebas() {
        ListaProfesores p = new ListaProfesores();
        p.add(new Profesor("Ana", 25, "Instructor"));
        p.add(new Profesor("Luis", 27, "Instructor"));
        p.add(new Profesor("Marta", 26, "Instructor"));
        p.add(new Profesor("Pedro", 30, "Instructor"));
        p.add(new Profesor("Carla", 35, "Asistente"));
        p.add(new Profesor("Jose", 45, "Auxiliar"));
        p.add(new Profesor("Rosa", 60, "Titular"));
        p.add(new Profesor("Raul", 35, "Asistente"));

        System.out.println("\n1. Metodo proxCambio");
        mostrarNombres("Lista normal", p.proxCambio());

        ListaProfesores q = new ListaProfesores();
        q.add(new Profesor("Ana", 25, "Instructor"));
        q.add(new Profesor("Marta", 26, "Instructor"));
        q.add(new Profesor("Carla", 40, "Asistente"));
        mostrarNombres("Ningún instructor con más de 26",q.proxCambio());

        mostrarNombres("Lista vacía", new ListaProfesores().proxCambio());
        System.out.println("\n2. Metodo mostrarLista");
        mostrarProfesores("Ordenada",p.mostrarLista());
        mostrarProfesores("Original (no debe cambiar)",p);
        mostrarProfesores("Lista vacía",new ListaProfesores().mostrarLista());

        System.out.println("\n3. Metodo cantProfesores");
        System.out.println(p.cantProfesores());

        System.out.println(new ListaProfesores().cantProfesores());
    }

    private void mostrarNombres(String titulo, LinkedList<String> nombres) {
        String texto = "";
        for (int i=0; i<nombres.size();i++) {
            texto = texto+nombres.get(i);
            if (i<nombres.size()-1) {
                texto = texto + ", ";
            }
        }
        if (nombres.isEmpty()) {
            texto = "(ninguno)";
        }
        System.out.println(titulo + ": "+texto);
    }

    private void mostrarProfesores(String titulo,LinkedList<Profesor>profesores) {
        System.out.println(titulo + ":");
        if (profesores.isEmpty()) {
            System.out.println("  (vacía)");
        } else {
            for (int i=0;i<profesores.size();i++) {
                System.out.println("  "+(i + 1)+". " + profesores.get(i));
            }
        }
    }
}