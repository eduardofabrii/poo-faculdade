package poo.exercicios.Caplicacaobancaria;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ContaBancaria {
    ArrayList<String> bancoDeCadastros = new ArrayList<>();
    private static boolean contaAtiva = false;
    private double saldo = 0;
    private double limiteCartaoCredito;
    private double scoreCliente = 0;
    private static int numeroDeConta;
    private Cliente cliente = new Cliente();

    public void menu() {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();

        while (loop) {
            System.out.println("(1) | Cadastro");
            System.out.println("(2) | Depositar");
            System.out.println("(3) | Sacar");
            System.out.println("(4) | Verificar Saldo");
            System.out.println("(5) | Alterar Informações");
            System.out.println("(6) | Informações Pessoais");
            System.out.println("(7) | Imprimir Extrato");
            System.out.println("(8) | Cartão de Crédito");
            System.out.println("(9) | Ver Banco de Cadastros");

            System.out.print("Escolha o número da opção: ");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    depositar();
                    break;
                case 3:
                    sacar();
                    break;
                case 4:
                    verificarSaldo();
                    break;
                case 5:
                    alterarInfosPessoais();
                    break;
                case 6:
                    verInfosPessoais();
                    break;
                case 7:
                    imprimirExtrato();
                    break;
                case 8:
                    menuCartaoCredito();
                    break;
                case 9:
                    verBancoDeCadastros();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    public int geradorDeNumeroDeConta(int min, int max) {
        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }


    public void cadastrar() {
        ArrayList<String> cadastroCliente = new ArrayList<>();
        numeroDeConta = geradorDeNumeroDeConta(10000, 15000);
        Scanner sc = new Scanner(System.in);

        String nome = "", email = "", senha = "", cpf = "";
        int idade = 0;

        while (!contaAtiva) {
            while (nome.isEmpty()) {
                System.out.print("Nome Completo: ");
                nome = sc.nextLine().trim();
                if (!nome.matches("[a-zA-Z\\s]+")) {
                    nome = "";
                    System.out.println("Nome inválido. Use apenas letras e espaços.");
                }
            }

            while (email.isEmpty()) {
                System.out.print("Email (formato x@y.com): ");
                email = sc.nextLine().trim();
                if (!email.contains("@") || !email.contains(".")) {
                    email = "";
                    System.out.println("Email inválido.");
                }
            }

            while (senha.isEmpty()) {
                System.out.print("Senha: ");
                senha = sc.nextLine().trim();
                if (senha.length() < 6 || !senha.matches(".*[a-zA-Z].*") || !senha.matches(".*\\d.*")) {
                    senha = "";
                    System.out.println("Senha inválida. Deve ter pelo menos 6 caracteres e incluir letras e números.");
                }
            }

            while (cpf.isEmpty()) {
                System.out.print("CPF (formato ###.###.###-##): ");
                cpf = sc.nextLine().trim();
                if (!cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
                    cpf = "";
                    System.out.println("CPF inválido. Use o formato ###.###.###-##.");
                }
            }

            while (idade <= 0) {
                System.out.print("Idade: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Entrada inválida. Digite um número inteiro para a idade.");
                    sc.next();
                    System.out.print("Idade: ");
                }
                idade = sc.nextInt();
                sc.nextLine();
                if (idade <= 0) {
                    System.out.println("Idade deve ser um número positivo.");
                }
            }

            cadastroCliente.add(nome);
            cadastroCliente.add(email);
            cadastroCliente.add(senha);
            cadastroCliente.add(cpf);
            cadastroCliente.add(String.valueOf(idade));
            cadastroCliente.add(String.valueOf(numeroDeConta));

            cliente.setNome(nome);
            cliente.setEmail(email);
            cliente.setSenha(senha);
            cliente.setCpf(cpf);
            cliente.setIdade(idade);

            bancoDeCadastros.add(String.valueOf(cadastroCliente));

            System.out.println("Conta criada com sucesso!");
            System.out.println("O número da sua conta é: " + this.numeroDeConta);

            contaAtiva = true;
        }
    }

    public void verBancoDeCadastros() {
        System.out.println("Banco de Cadastros: ");
        System.out.println(bancoDeCadastros);
    }

    public void depositar() {
        Scanner sc = new Scanner(System.in);
        if (contaAtiva) {
            System.out.print("Quanto deseja depositar: ");
            this.saldo += sc.nextFloat();
            scoreCliente += 2;
            System.out.println("Saldo atual: " + this.saldo +
                    "\n" + "A cada deposito feito você aumenta 2 pontos de score!" +
                    "\nSeu score: " + scoreCliente);
        } else {
            System.out.println("Você ainda não tem cadastro");
        }
    }

    public void sacar() {
        Scanner sc = new Scanner(System.in);
        if (contaAtiva) {
            if (this.saldo > 0) {
                System.out.print("Quanto deseja sacar: ");
                saldo -= sc.nextDouble();
                System.out.println("Saldo atual: " + this.saldo);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Você ainda não tem cadastro");

        }
    }

    public void verificarSaldo() {
        if (contaAtiva) {
            System.out.println("Saldo: R$" + this.saldo);
        } else {
            System.out.println("Você ainda não tem cadastro");
        }
    }

    private void alterarNome() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome Atual: " + cliente.getNome());
        System.out.print("Digite o novo nome: ");
        String alterando = sc.nextLine();
        cliente.setNome(alterando);
        System.out.println("Nome alterado com sucesso");
        System.out.println("Nome novo: " + cliente.getNome());
    }

    private void alterarEmail() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Email Atual: " + cliente.getEmail());
        System.out.println("Digite no novo email: ");
        String alterando = sc.nextLine();
        cliente.setEmail(alterando);
        System.out.println("Email alterado com sucesso");
        System.out.println("Email novo: " + cliente.getEmail());

    }

    private void alterarSenha() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dica de senha: ");
        String dica = cliente.getSenha().substring(0, 2) + "****"
                + cliente.getSenha().substring(cliente.getSenha().length() - 2);
        System.out.println(dica);

        System.out.print("Digite a senha completa para confirmar: ");
        String senhaDigitada = sc.nextLine();

        if (senhaDigitada.equals(cliente.getSenha())) {
            System.out.print("Digite a nova senha: ");
            String novaSenha = sc.nextLine();
            cliente.setSenha(novaSenha);
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Senha incorreta.");
        }
    }

    public void alterarInfosPessoais() {
        Scanner sc = new Scanner(System.in);

        if (contaAtiva) {
            System.out.println("(1) | Alterar Nome");
            System.out.println("(2) | Alterar Email");
            System.out.println("(3) | Alterar Senha");

            System.out.print("O que você deseja alterar: ");
            int escolha = sc.nextInt();

            if (escolha == 1) {
                alterarNome();
            } else if (escolha == 2) {
                alterarEmail();
            } else if (escolha == 3) {
                alterarSenha();
            } else {
                System.out.println("Opção inválida");
            }
        } else {
            System.out.println("Você ainda não tem cadastro");
        }
    }


    public void verInfosPessoais() {
        Scanner sc = new Scanner(System.in);
        if (contaAtiva) {
            String nome = cliente.getNome();
            String email = cliente.getEmail();
            String senha = cliente.getSenha();
            int idade = cliente.getIdade();
            System.out.println("(1) | Visualizar Nome");
            System.out.println("(2) | Visualizar Email");
            System.out.println("(3) | Visualizar Senha");
            System.out.println("(4) | Visualizar Idade");

            System.out.print("O que você deseja visualizar?: ");
            int escolha = sc.nextInt();

            if (escolha == 1) {
                System.out.println(nome);
            } else if (escolha == 2) {
                System.out.println(email);
            } else if (escolha == 3) {
                System.out.println(senha);
            } else if (escolha == 4) {
                System.out.println(idade);
            } else {
                System.out.println("Opção inválida.");
            }
        } else {
            System.out.println("Você ainda não tem cadastro");
        }
    }

    private void imprimirExtrato() {
        if (contaAtiva) {
            System.out.println("Numero da conta: " + this.numeroDeConta);
            System.out.println("Dono: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Saldo: R$" + this.saldo);
        } else {
            System.out.println("Você ainda não tem cadastro");
        }

    }

    private void menuCartaoCredito() {
        Scanner sc = new Scanner(System.in);

        if (contaAtiva) {
            System.out.println("Para abrir um cartão de crédito: \n" +
                    "1. Você precisa ser maior de idade \n" +
                    "2. Você precisa ter score maior que dez \n" +
                    "3. A cada deposito você ganha dois pontos no score.");
            System.out.println("Deseja criar? (1) ou Deseja voltar? (2)");
            int escolha = sc.nextInt();

            if (escolha == 1) {
                abrirCartaoCredito();
            } else if (escolha == 2) {
                System.out.println("Voltando...");
            } else {
                System.out.println("Opção invalida");
            }
        } else {
            System.out.println("Você ainda não tem cadastro");
        }
    }

    private void abrirCartaoCredito() {
        if (contaAtiva) {
            if (cliente.getIdade() >= 18)
                if (scoreCliente >= 10) {
                    System.out.println("Cartão aberto!");
                } else {
                    System.out.println("Você deve ter score maior que 10 para ter um cartão de crédito.");
                }
            else {
                System.out.println("Cartão de crédito disponivel para pessoas +18.");
            }
        } else {
            System.out.println("Você ainda não tem cadastro");
        }
    }

}
