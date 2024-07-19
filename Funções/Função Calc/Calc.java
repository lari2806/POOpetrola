class Calc {
    public static void main(String[] args){
        int Escolha = (int)(Math.random()*4+1);
        System.out.println("Escolha: \n 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão ");
        System.out.println("Escolheu:\n" + Escolha);
        int x = (int) (Math.random()*10+1);
        System.out.println("Primeiro Número:\n" + x);
        int y = (int) (Math.random()*10+1);
        System.out.println("Segundo Número:\n" + y);

        if(Escolha == 1){
        System.out.println("Resultado\n" + (x+y));
        }else if(Escolha == 2){
        System.out.println("Resultado\n"+ (x-y));
        }else if (Escolha == 3){
        System.out.println("Resultado\n"+ (x*y));
        }else if (Escolha == 4){
         System.out.println("Resultado\n"+ (x/y));
        }else{
        System.out.println("opcão inválida");
        }
    
}
    }