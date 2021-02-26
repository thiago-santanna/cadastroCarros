import java.util.Locale;
import java.util.Scanner;

public class Produtos {
    public static void main(String[] args) {
        System.out.println("Olá bem vindo ao sistema ded cadastro de carros.");
        System.out.println("===============================================");
        System.out.println("");
        System.out.println("Deseja cadastrar um carro? S/N -> ");
        System.out.println("");
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);
        try {
            String cadAtivo =  sc.next().toUpperCase();
            System.out.println("-> "+ cadAtivo);
            if (cadAtivo.equals("S")){
                do {
                    System.out.println("Informe o nome do carro -> ");
                    String nomeCarro = sc.next();

                    System.out.println("Informe o número de portas -> ");
                    Integer nomeroPortas = sc.nextInt();

                    System.out.println("Informe o número de chassi -> ");
                    String chassi = sc.next();

                    System.out.println("Informe o Ano de fabricação -> (AAAA)");
                    String anoFabricacao = sc.next();

                    System.out.println("Informe o tipo de combustível -> Informe: GASOLINA, ALCOOL, GAS, FLEX");
                    String comb = sc.next().toUpperCase();

                    Carro car = new Carro(
                            nomeCarro,
                            nomeroPortas,
                            chassi,
                            anoFabricacao,
                            Combustiveis.valueOf(comb)
                    );

                    System.out.println("");
                    System.out.println("===============================================");
                    System.out.println("Carro cadastrado");
                    System.out.println(car.toString());
                    System.out.println("");
                    System.out.println("===============================================");

                    System.out.println("Deseja informa cor agora? Informe: VERMELHO, BRANCO, PRETO, AMARELO, VERDE");
                    String cor = sc.next().toUpperCase();
                    if(!cor.isEmpty()){
                        car.setCor(Cores.valueOf(cor));

                        System.out.println("");
                        System.out.println("===============================================");
                        System.out.println("Carro atualizado");
                        System.out.println(car.toString());
                        System.out.println("");
                        System.out.println("===============================================");
                    }

                    System.out.println("Deseja cadastrar um carro? S/N");
                    cadAtivo = sc.next().toUpperCase();
                }while (cadAtivo.equals("S"));
            }
        }finally {
            sc.close();
        }

        System.out.println();
        System.out.println();
    }
}
