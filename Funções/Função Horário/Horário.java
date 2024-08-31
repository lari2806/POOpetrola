import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
class Hora{
    
    public static void main(String[] args){
        saudação();
    }

    public static void saudação(){
        var horaAtual =LocalTime.now();
        var horaFormatada = horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("o horário é: " + horaFormatada);
        int hora = horaAtual.getHour();
         if (hora >= 5 && hora <= 11){
            System.out.println( "Bom Dia!");
        } else if(hora >=12 && hora <=18){
            System.out.println("Boa Tarde!");
        }else if(hora >=19 && hora <=23){
            System.out.println(" Boa Noite!");
        }else if(hora >=0 && hora <=4){
            System.out.println("Vai Dormir!!");
        }
    }
}