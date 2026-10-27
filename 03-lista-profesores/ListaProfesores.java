public class ListaProfesores extends LinkedList<Profesor> {
    
    public ListaProfesores() {
        super();
    }

    public LinkedList<String> proxCambio(){
        LinkedList<String> result = new LinkedList<>();
        for(int i=0;i<this.size();i++){
            Profesor p = this.get(i);
            if(p.getCategoria().equals("Instructor") && p.getEdad() > 26){
                result.add(p.getNombre());
            }
        }
        return result;
    }

    public LinkedList<Profesor> mostrarLista() {
        LinkedList<Profesor> ordenada = new LinkedList<>();
        for (int i=0;i<this.size();i++) {
            Profesor p = get(i);
            int pos = 0;
            while (pos < ordenada.size() && ordenada.get(pos).getEdad()>=p.getEdad()) {
                pos++;
            }
            ordenada.add(p,pos);
        }
        return ordenada;
    }

    public String cantProfesores() {
        int inst = 0;
        int asist = 0;
        int aux = 0;
        int tit = 0;

        for (int i=0;i<this.size();i++) {
            Profesor p = get(i);
            if(p.getCategoria().equals("Instructor")) {
                inst++;
            } else if (p.getCategoria().equals("Asistente")) {
                asist++;
            } else if(p.getCategoria().equals("Auxiliar")){
                aux++;
            } else if(p.getCategoria().equals("Titular")){
                tit++;
            }
        }
        return "Instructor: "+inst+"\nAsistente: "+asist+"\nAuxiliar: "+aux+"\nTitular: "+tit;
    }
}
