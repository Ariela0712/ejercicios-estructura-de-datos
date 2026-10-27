import java.util.Scanner;

public class Validaciones {
    Scanner in = new Scanner(System.in);

    public int validarEntero(String mensaje,int min,int max) {
        int num = min-1;
        boolean val = false;
        while (!val) {
            System.out.print(mensaje);
            String entrada = in.nextLine().trim();
            try {
                num = Integer.parseInt(entrada);
                if (num >= min && num <= max) {
                    val = true;
                } else {
                    System.out.println("Debe estar entre "+min+" y "+max+".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida: escribe un número entero.");
            }
        }
        return num;
    }

    public String validarNombre(String mensaje) {
        String texto = "";
        boolean val = false;
        while (!val) {
            System.out.print(mensaje);
            texto = in.nextLine().trim();
            if (texto.isEmpty()) {
                System.out.println("El nombre no puede estar vacío.");
            } else if (!soloLetrasYEspacios(texto)) {
                System.out.println("Solo se permiten letras y espacios.");
            } else {
                val = true;
            }
        }
        return texto;
    }

    private boolean soloLetrasYEspacios(String texto) {
        boolean val = true;
        for (int i=0; i<texto.length();i++) {
            char c = texto.charAt(i);
            if (!Character.isLetter(c) && c != ' ') {
                val = false;
            }
        }
        return val;
    }
}