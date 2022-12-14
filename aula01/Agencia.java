//Pacote (package) organiza o nosso projeto e as classes do projeto (diz que a classe está em um diretório),
//o que trás a necessidade de ter imports pra usar classes que estão em outro pacotes.
package aula01;

//A Agencia que vai iniciar a ação, portanto, vai ter o método main, ou seja,
//ela que vai puxar as outras classes
public class Agencia {
    //Assinatura de método, segue essa declaração. O nome do parãmtero pode ser
    //modificado, o resto, não. "String []" é a declaração de um String array.
    public static void main (String [] parametro) {
        //Instanciar: criar um objeto na memória através do "new"
        ContaCorrente conta01 = new ContaCorrente();

        //Atribuir um valor a um atributo de um objeto. É preferível usar o set na
        //atribuição pra evitar que a informação seja sobrescrita com atribuições simples
        //do tipo "variável = valor". Se precisar sobrescrever a informação, usa-se o set novamente.
        conta01.setNumeroConta(1234);

        //Quando se usa um ponto após a variável podemos acessar e
        //interagir com algumas informações dela
        System.out.println(conta01.getNumeroConta());

        //Precisa colocar a casa decimal porque o wrapper Double
        //pede essa notação
        conta01.depositar(213.0);

        System.out.println(conta01.consultarSaldo());

        conta01.sacar(37d);

        System.out.println(conta01.consultarSaldo());
    }
}
