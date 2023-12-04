Questão 7 BM:

class Registro De Eleitor{ int tituloDeEleitor; Nome da string; // nome do eleitor short zonaEleitoral; // número da zona eleitoral }

Resposta: A classe "RegistroDeEleitor" é separada por espaços, além disso, a classe "RegistroDeEleitor" não apresenta a declaração dos modificadores de acesso, bem como a definição de construtores e métodos.

Questão 8 BM:

classe Teste2{
int num1,num2; int maior(){ if (num1 > num2) retorna verdadeiro; caso contrário, retorne falso; } void menor(){ if (num1 < num2) return num1; caso contrário retorne num2; } }

Resposta: o maior() está retornando um valor booleano, e também está querendo retornar valores int; o menor() é declarado como nulo;

Questão 9 BM:

class TesteImpressão{ main(String[] args){ System.out.println(“7+2=”+(7+2)); System.out.println(“7-2=”+(7-2)); System.out.println(“7 2=”+(7 2)); System.out.println(“7/2=”+(7/2)); retornar verdadeiro; } }

Resposta: Na declaração do método main(), o main precisa ser precisamente "public static void main(String[] args)", aspas usadas no system.out.println não são aspas simples, A divisão 7/2 está desconsiderando a parte decimal do resultado devido às partes serem inteiras. É necessário pelo menos um dos operandos da divisão ser do tipo float ou double.

Questão 10 BM: 

class TesteDatas { public void static main(String[] args){
Data2 hoje = new Data2(); 
hoje.inicializaData(7,1,2001); 
Data2 amanha; 
amanha.inicializaData(8,1,2001); 
System.out.println(amanha.eIgual(hoje));}} // fim da classe

class TesteObjetos { public static void main(String[] args) {
Data a;
Data b = new Data();
b = null;
b = a;}} // fim da classe

Reposta: Na declaração do método main(), o mais esta declarado incorretamente, não sendo possivel execução.