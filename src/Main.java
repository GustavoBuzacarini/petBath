import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        var petMachine = new PetMachine();
        var option = -1;

        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verifica água da máquina");
            System.out.println("5 - Verifica shampoo da máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - sair");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> petMachine.takeShower();
                case 2 -> petMachine.addWater();
                case 3 -> petMachine.addShampoo();
                case 4 -> System.out.println("A máquina está com " + petMachine.getWater() + " litros de água");
                case 5 -> System.out.println("A máquina está com " + petMachine.getShampoo() + " litros de shampoo");
                case 6 -> {
                    if (petMachine.hasPet()) {
                        System.out.println("Tem pet no banho");
                    } else {
                        System.out.println("Não tem pet no banho");
                    }
                }
                case 7 -> {
                    System.out.println("Informe o nome do pet:");
                    var name = scanner.nextLine();
                    petMachine.setPet(new Pet(name));
                }
                case 8 -> {
                    if (petMachine.hasPet()) {
                        petMachine.removePet();
                    } else {
                        System.out.println("Não há pet na máquina para retirar");
                    }
                }
                case 9 -> petMachine.wash();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida");
            }
        } while (option != 0);
    }
}
