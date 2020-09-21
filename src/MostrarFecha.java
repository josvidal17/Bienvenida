import calendario.Calendario;

public class MostrarFecha {
    public void inicio(){
        Calendario cale = new Calendario();
        System.out.println("Buenos dias." +
                "\nSon las "+cale.getHora()+" horas "+cale.getMinuto()+" minutos del dia "+cale.getDia()+" de "+cale.convertirMes(cale.getMes())+" de "+cale.getAnio());

     }
    public static void main(String[] args){
        new MostrarFecha().inicio();
    }
}
