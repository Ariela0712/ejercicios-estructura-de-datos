public class EditorNotas {
    private String texto;
    private LinkedStack<String> historial;

    public EditorNotas() {
        this.texto = "";
        this.historial = new LinkedStack<String>();
    }
    
    public String getTexto() {
        return texto;
    }

    public String escribir(String fragmento) {
        if (fragmento == null || fragmento.trim().isEmpty()) {
            return "No se puede escribir un fragmento vacío o nulo.";
        }
        historial.push(texto);
        texto = texto + fragmento;
        return "Escrito correctamente";
    }

    public String deshacer(){
        if (historial.isEmpty()) {
            return "Nada que deshacer";
        } 
        texto = historial.pop();
        return "Se ha deshecho el último cambio.";
    }

    public void mostrar() {
        System.out.println(texto);
    }
    
    public String ultEstado(){
        if (historial.isEmpty()) {
            return "No hay cambios guardados.";
        } 
        return historial.top(); 
    }

    public boolean hayCambios(){
        return !historial.isEmpty();
    }

    public int getCantidadEstados(){
        return historial.size();
    }
}
