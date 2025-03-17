public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero = Integer.valueOf(args[0]);
        String agenca = args[1];
        String nome = args[2];
        double saldo = Double.valueOf(args[3]);

        System.out.println("Por favor, digite o número da Agência");
        System.out.println(numero);
        System.out.println("Por favor, digite o sua Agência");
        System.out.println(agenca);
        System.out.println("Por favor, digite o seu Nome");
        System.out.println(nome);
        System.out.println("Por favor, digite o seu Saldo");
        System.out.println(saldo);

        System.out.println("Olá " + nome + ", obrigado por criar uma cona em nosso banco, sua agência é " + agenca + ", conta " + numero + " e seu saldo " + saldo + "já está disponível para saque" );


    }
}
