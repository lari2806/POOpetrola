class Calc {

    public static void main(String[] args){
        int escolha = (int)(Math.random()*4+1);
        System.out.println("escolha: \n 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão ");
        System.out.println("Escolheu:\n" + escolha);

        int primeiroNumero = (int) (Math.random()*10+1);
        System.out.println("Primeiro Número:\n" + primeiroNumero);
        
        int segundoNumero = (int) (Math.random()*10+1);
        System.out.println("Segundo Número:\n" + y);

        if(escolha == 1){
        System.out.println("Resultado\n" + (primeiroNumero+segundoNumero));
        }else if(escolha == 2){
        System.out.println("Resultado\n"+ (primeiroNumero-segundoNumero));
        }else if (escolha == 3){
        System.out.println("Resultado\n"+ (primeiroNumero*segundoNumero));
        }else if (escolha == 4){
         System.out.println("Resultado\n"+ (primeiroNumero/segundoNumero));
        }else{
        System.out.println("opcão inválida");
        }
    
}
    }