import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
class Hora{
    
    public static void main(String[] args){
        Saudação();
    }

    public static void Saudação(){
        var hora_A =LocalTime.now();
        var horaf = hora_A.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("o horário é: " + horaf);
        int hora = hora_A.getHour();
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