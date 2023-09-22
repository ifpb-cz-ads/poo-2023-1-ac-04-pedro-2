class BMExercicio03{

        private String nomeCorrentista; 
        private boolean contaBancariaEspecial;
        private float saldo;

         void abreContaSimples(String nome){
            nomeCorrentista = nome;
            saldo = 0;
            contaBancariaEspecial = false;
        }

         void abreContaEspecial(String nome){
            nomeCorrentista = nome;
            saldo = 0;
            contaBancariaEspecial = true;
        }

         void deposita(float valor){
            saldo += valor;
        }

        boolean retira(float valor){
            if( contaBancariaEspecial == false){
                if(valor <= saldo){
                    saldo -= valor;
                    return true;
                } 
                else {
                    return false;
                } 

                }
                else {
                saldo = saldo - valor;
                return true;
            }
        }

         void mostrarDados(){
            System.out.println("O nome do correntista é: " + nomeCorrentista);
            System.out.println("Saldo: " + saldo);
            if(contaBancariaEspecial){
                System.out.println("Essa conta é especial");
                if(saldo <= 0){
                    System.out.println("O saldo esta negativo!");
                }
            }
            else{
                System.out.println("Essa conta é comum");
            }
        }   


}

class TestaContaBancariaSimplificada {
    public static void main(String[] args){
        BMExercicio03 c1;
        c1 = new BMExercicio03();
        c1.abreContaEspecial("Maria");
         BMExercicio03 c2 = new BMExercicio03();
         c2.abreContaSimples("João");
         c1.deposita(200);
         if (c1.retira (300)) {
            System.out.println("Saque realizado");
            
         }
         else{
            System.out.println("Saldo negativo");
         }
         c1.mostrarDados();
         c2.mostrarDados();

}
    
}