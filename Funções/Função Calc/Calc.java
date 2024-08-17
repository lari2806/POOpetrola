class Calc {

    public static void main(String[] args){
        int escolha = (int)(Math.random()*4+1);
        System.out.println("escolha: \n 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão ");
        System.out.println("Escolheu:\n" + escolha);

        int x = (int) (Math.random()*10+1);
        System.out.println("Primeiro Número:\n" + x);
        
        int y = (int) (Math.random()*10+1);
        System.out.println("Segundo Número:\n" + y);

        if(escolha == 1){
        System.out.println("Resultado\n" + (x+y));
        }else if(escolha == 2){
        System.out.println("Resultado\n"+ (x-y));
        }else if (escolha == 3){
        System.out.println("Resultado\n"+ (x*y));
        }else if (escolha == 4){
         System.out.println("Resultado\n"+ (x/y));
        }else{
        System.out.println("opcão inválida");
        }
    
}
    }