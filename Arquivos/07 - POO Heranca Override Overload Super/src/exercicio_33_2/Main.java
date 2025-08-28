package exercicio_33_2;

public class Main {
    /*
    Duas empresas de um mesmo ramo de atividade, vão se fundir em uma única empresa. A
    empresa ABC do Brasil comprou a XYZ S.A.. Como resultado da todos os clientes da XYZ
    tiveram os seus dados transferidos para a ABC bem como os seus produtos em estoque. A
    empresa ABC possuía para os clientes os seguintes dados, código, nome, endereço, telefone,
    bairro, CPF e RG e a empresa XYZ possui código, nome, endereço, bairro, CPF e fone. Para
    os produtos da ABC tem-se código, nome, grupo, preço venda, unidade, quantidade em
    estoque, e a XYZ possui código, nome, grupo, preço custo, preço venda, unidade e
    Quantidade em estoque. Mostrar a situação das empresas antes e depois da fusão
     */
    public static void main(String[] args) {
        ClientesXYZAntes cli1 = new ClientesXYZAntes("000000000", "Cliente 1", "Palhoça", "Passa-Vinte", "100000000000", "88888888888");
        ClientesABCAntes cli2 = new ClientesABCAntes("1111111111111", "Cliente 2", "Palhoça", "99999999", "Pedra Branca", "200000000", "88888888");
        ClientesXYZ cli3 = new ClientesXYZ("2222222222", "Arroz", "Alimento", 10.0, "Kg", 100, 5.99);
        ClientesABC cli4 = new ClientesABC("333333333", "Feijão", "Alimento", 12.99, "Kg", 23);

        System.out.println(cli1);
        System.out.println(cli2);
        System.out.println(cli3);
        System.out.println(cli4);


    }
}
