package petshop2;

import java.util.Scanner;

public class PetShop2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Gerente2 gerente = new Gerente2("Ana", "12345678900");
        Veterinario2 vet = new Veterinario2("Carlos", "09876543211");
        Atendente2 atendente = new Atendente2("Beatriz", "11223344556");

        gerente.exibirFuncao();
        vet.exibirFuncao();
        atendente.exibirFuncao();

        System.out.println("\n--- Cadastro do Tutor ---");
        System.out.print("Nome do tutor: ");
        String nomeTutor = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        Tutor2 tutor = new Tutor2(nomeTutor, telefone, email, endereco);

        System.out.println("\n--- Cadastro do Pet ---");
        System.out.print("Tipo (ex: Cachorro, Gato): ");
        String tipo = scanner.nextLine();
        System.out.print("Raça: ");
        String raca = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        Pet2 pet = new Pet2(tipo, raca, idade, tutor);

        System.out.println("\n--- Serviços disponíveis ---");
        System.out.println("1. Banho - " + Preco2.BANHO);
        System.out.println("2. Tosa - " + Preco2.TOSA);
        System.out.println("3. Brinquedos - " + Preco2.BRINQUEDOS);
        System.out.println("4. Ração - " + Preco2.RACAO);
        System.out.println("5. Remédios - " + Preco2.REMEDIOS);
        System.out.print("Escolha o número do serviço desejado: ");
        int servicoEscolhido = scanner.nextInt();
        scanner.nextLine();

        String servico = switch (servicoEscolhido) {
            case 1 -> "Banho - " + Preco2.BANHO;
            case 2 -> "Tosa - " + Preco2.TOSA;
            case 3 -> "Brinquedos - " + Preco2.BRINQUEDOS;
            case 4 -> "Ração - " + Preco2.RACAO;
            case 5 -> "Remédios - " + Preco2.REMEDIOS;
            default -> "Serviço inválido";
        };

        System.out.println("\n--- Formas de Pagamento ---");
        System.out.println("1. Dinheiro");
        System.out.println("2. Cartão");
        System.out.println("3. PIX");
        System.out.print("Escolha o número da forma de pagamento: ");
        int pagamento = scanner.nextInt();

        FormaPagamento2 formaPagamento = switch (pagamento) {
            case 1 -> FormaPagamento2.DINHEIRO;
            case 2 -> FormaPagamento2.CARTAO;
            case 3 -> FormaPagamento2.PIX;
            default -> FormaPagamento2.DINHEIRO;
        };

        System.out.println("\n--- Resumo do Atendimento ---");
        System.out.println("Tutor: " + tutor.getNome());
        System.out.println("Pet: " + pet.getTipo() + " - " + pet.getRaca() + ", " + pet.getIdade() + " anos");
        System.out.println("Serviço: " + servico);
        System.out.println("Pagamento: " + formaPagamento);

        scanner.close();
    }
}