import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class pessoa {
    protected String Nome;
    protected int Nascimento;
    public String Apelido = "";

    public pessoa(String Nome, int Nascimento){
        this.Nome = Nome;
        this.Nascimento = Nascimento;

    }
    private int calcIdade(){
        return(LocalDate.now().getYear()-this.Nascimento);
    }
    public String Saudação(){
        LocalTime hora_atual = LocalTime.now();
        String horaformat = hora_atual.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        int hora = hora_atual.getHour();
        if (hora >= 5 && hora <= 11){
            return horaformat+ "Bom Dia!" +this.Nome + "é de" + calcIdade() + "anos";
        } else if(hora >=12 && hora <=18){
            return horaformat+"Boa Tarde!" +this.Nome + "é de" + calcIdade() + "anos ";
        }else if(hora >=19 && hora <=23){
            return horaformat+" Boa Noite" +this.Nome + "é de" + calcIdade() + "anos";
        }else if(hora >=0 && hora <=4){
            return horaformat+"Vai Dormir" +this.Nome + "é de" +calcIdade() + "anos !";
        }else{
            return"erro na hora";
        }
    
    }

    public static void main(String[] args) {
        pessoa olá = new pessoa("Lari", 2007);
        System.out.println(olá.Saudação());
    }
}
    class Aluno extends pessoa{
        private String Curso;
        private int Matricula;
        public Aluno(String Nome, int Nascimento, String Curso, int Matricula){
        super(Nome,Nascimento);
        this.Matricula = Matricula;
        this.Curso = Curso;
    }
    @Override
    public String Saudação(){
        LocalTime hora_atual = LocalTime.now();
        String horaformat = hora_atual.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        int hora = hora_atual.getHour();
        if (hora >= 5 && hora <= 11){
            return "o nome do aluno é "+ this.Nome + "o numero de matricula é " + this.Matricula + "e seu curso é " + this.Curso;
        } else if(hora >=12 && hora <=18){
            return ;
        }else if(hora >=19 && hora <=23){
            return;
        }else if(hora >=0 && hora <=4){
            return ;
        }else{
            return"erro na hora";
        }
    }

    public static void main(String[] args) {
        Aluno obj1 = new Aluno("Marcos", 2009, 900887);
        
    }s

    }


