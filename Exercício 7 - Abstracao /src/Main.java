import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("SISTEMA DE PAGAMENTOS");
            System.out.println("ESCOLHA SUA FORMA DE PAGAMENTO:");
            System.out.println("\n[1] PARA BOLETO\n" + "\n[2] PARA CARTÃO DE CRÉDITO\n" + "\n[3] PARA PIX\n");
            int forma = sc.nextInt();
            sc.nextLine();

  switch (forma) {
                case 1:
                    System.out.println("Insira o código de barras do boleto (contém 44 caracteres)");
                    String codigoDeBarras = sc.nextLine();
                    FormaDePagamento boleto = new BoletoDaConta(codigoDeBarras);

                    System.out.println("Valor ao pagar: ");
                    float valorBoleto = sc.nextFloat();
                    sc.nextLine();
                    boleto.processarOPagamento(valorBoleto);
                    break;
                case 2:
                    System.out.println("Insira o limite do cartão: ");
                    float limite = sc.nextFloat();
                    FormaDePagamento cartao = new CartaoDeCredito(limite);

                    System.out.println("Valor ao pagar: ");
                    float valorCartao = sc.nextFloat();
                    sc.nextLine();
                    cartao.processarOPagamento(valorCartao);
                    break;
                case 3:
                    System.out.println("Insira a chave do pix: ");
                    String chave = sc.nextLine();
                    FormaDePagamento pix = new Pix(chave);

                    System.out.println("Valor ao pagar: ");
                    float valorPix = sc.nextFloat();
                    sc.nextLine();
                    pix.processarOPagamento(valorPix);
                    break;
                default:
                    System.out.println("Forma inválida!");
                    break;
            }

            Object FormaDePagamento;
            System.out.println("ENCERRANDO A INFORMAÇÃO DO PAGAMENTO!")
        }
    }
