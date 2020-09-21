package calendario;

import java.util.Calendar;

public class Calendario {
    Calendar ahora = Calendar.getInstance();
    private int hora = ahora.get(Calendar.HOUR_OF_DAY);
    private int minuto = ahora.get(Calendar.MINUTE);
    private int mes = ahora.get(Calendar.MONTH);
    private int dia = ahora.get(Calendar.DAY_OF_MONTH);
    private int anio = ahora.get(Calendar.YEAR);

    public int getHora(){
        return hora;
    }
    public int getMinuto(){
        return minuto;
    }
    public int getMes(){
        return mes+1;
    }
    public int getDia(){
        return dia;
    }
    public int getAnio(){
        return anio;
    }

    public String convertirMes(int mes){
        String aux = "";
        switch (mes){
            case 1:
                aux="Enero";
                break;
            case 2:
                aux="Febrero";
                break;
            case 3:
                aux="Marzo";
                break;
            case 4:
                aux="Abril";
                break;
            case 5:
                aux="Mayo";
                break;
            case 6:
                aux="Junio";
                break;
            case 7:
                aux="Julio";
                break;
            case 8:
                aux="Agosto";
                break;
            case 9:
                aux="Septiembre";
                break;
            case 10:
                aux="Octubre";
                break;
            case 11:
                aux="Noviembre";
                break;
            case 12:
                aux="Diciembre";
                break;
        }
        return aux;
    }
}
