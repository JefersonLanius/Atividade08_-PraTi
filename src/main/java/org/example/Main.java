//atividade 1 e 2
//
//package org.example;
//
//class Produto{
//    private String nomeProduto;
//    private double preco;
//    private int quantidade;
//
//    public String getNomeProduto() {
//        return nomeProduto;
//    }
//
//    public void setNomeProduto(String nomeProduto) {
//        this.nomeProduto = nomeProduto;
//    }
//
//    public double getPreco() {
//        return preco;
//    }
//
//    public void setPreco(double preco) {
//        if(preco < 0){
//            throw new IllegalArgumentException("Preco não pode ser negativo");
//        }
//        this.preco = preco;
//    }
//
//    public int getQuantidade() {
//        return quantidade;
//    }
//
//    public void setQuantidade(int quantidade) {
//        if(quantidade < 0){
//            throw new IllegalArgumentException("quantidade  não pode ser negativo");
//        }
//        this.quantidade = quantidade;
//    }
//
//    public Produto(String nomeProduto, double preco, int quantidade){
//        this.nomeProduto = nomeProduto;
//        setPreco(preco);
//        setQuantidade(quantidade);
//    }
//}
//class PrecoComdesconto extends Produto{
//    public PrecoComdesconto (String nomeProduto, double preco, int quantidade){
//        super(nomeProduto, preco, quantidade);
//    }
//    public void aplicarDesconto(double percentual){
//        if(percentual > 50.0){
//            throw new IllegalArgumentException("Desconto não pode ser superior a 50%");
//        }
//        double precoNovo = getPreco()-(getPreco()*percentual/100);
//        setPreco(precoNovo);
//        System.out.println("Novo Preco com desconto "+ precoNovo);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        PrecoComdesconto produto = new PrecoComdesconto("Caderno", 20.00,50);
//        produto.aplicarDesconto(20);
//    }
//}
//
//atividade 3 e 4
//package org.example;
//class Funcionario{
//    protected String nome;
//    protected double salario;
//
//    public Funcionario(String nome, double salario){
//        this.nome = nome;
//        this.salario = salario;
//    }
//
//    public double bonus(double salario, double percentual) {
//        return salario * percentual / 100;
//    }
//
//    public double bonus(){
//        return 0.0;
//    }
//
//    public void trabalhar(){
//        System.out.println("O funcionário está trabalhando");
//    }
//}
//class Gerente extends Funcionario {
//    double valorBonus;
//
//    public  Gerente(String nome, double salario){
//        super(nome, salario);
//
//    }
//
//    @Override
//    public double bonus() {
//        return this.salario * 0.20;
//    }
//
//    @Override
//    public void trabalhar() {
//        System.out.println("Gerente " + nome + " está trabalhando.");
//    }
//}
//class Desenvolvedor extends Funcionario {
//    double valorBonus;
//
//    public  Desenvolvedor(String nome, double salario){
//        super(nome, salario);
//        this.valorBonus = bonus(this.salario, 10.0);
//    }
//    @Override
//    public double bonus() {
//        return this.salario * 0.10;
//    }
//    @Override
//    public void trabalhar() {
//        System.out.println("Desenvolvedor " + nome + " trabalhando.");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//
//        Gerente gerente = new Gerente("João", 8000);
//        Desenvolvedor desenvolvedor = new Desenvolvedor("Fábio", 3000);
//        System.out.println("Bônus Gerente: R$" + gerente.bonus());
//        System.out.println("Bônus Desenvolvedor: R$" + desenvolvedor.bonus());
//    }
//}
//atividade 5
//        package org.example;
//interface ITransporte{
//    void acelerar();
//    void frear();
//}
//class Carro implements ITransporte{
//    @Override
//    public void acelerar(){
//        System.out.println("O carro acelerou");
//    }
//    @Override
//    public void frear(){
//        System.out.println("O carro freou");
//    }
//}
//class Bicicleta implements ITransporte{
//    @Override
//    public void acelerar(){
//        System.out.println("O bicicleta acelerou");
//    }
//    @Override
//    public void frear(){
//        System.out.println("O bicicleta freou");
//    }
//}
//class Trem implements ITransporte{
//    @Override
//    public void acelerar(){
//        System.out.println("O trem acelerou");
//    }
//    @Override
//    public void frear(){
//        System.out.println("O trem freou");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//
//        ITransporte[] transportes = {new Carro(), new Bicicleta(), new Trem()};
//        for (ITransporte transporte : transportes) {
//            transporte.acelerar();
//            transporte.frear();
//        }
//    }
//}
//atividade 6
//        package org.example;
//abstract class Animal{
//    public abstract void emitirSom();
//}
//class Cachorro extends Animal{
//    @Override
//    public void emitirSom(){
//        System.out.println("O cachorro faz au au");
//    }
//}
//class Gato extends Animal{
//    @Override
//    public void emitirSom(){
//        System.out.println("O gato faz miau");
//    }
//}
//class Vaca extends Animal{
//    @Override
//    public void emitirSom(){
//        System.out.println("A vaca faz mu");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//
//        Animal[] animais = {new Cachorro(), new Gato(), new Vaca()};
//        for (Animal animal : animais) {
//            animal.emitirSom();
//        }
//    }
//}
//atividade 7
//        package org.example;
//abstract class FormaPagamento{
//    public abstract void processarPagamento(double valor);
//    public abstract boolean validarPagamento();
//}
//
//class cartaoDeCredito extends  FormaPagamento{
//    @Override
//    public  void  processarPagamento(double valor){
//        if(validarPagamento()){
//            System.out.println("Pagamento de " + valor + " reais, com cartão foi aprovado");
//        }
//    }
//    @Override
//    public boolean validarPagamento(){
//        System.out.println("Pagamento validado");
//        return true;
//    }
//}
//class boleto extends  FormaPagamento{
//    @Override
//    public  void  processarPagamento(double valor){
//        if(validarPagamento()){
//            System.out.println("Pagamento de " + valor + " reais, com boleto");
//        }
//    }
//    @Override
//    public boolean validarPagamento(){
//        System.out.println("Pagamento validado");
//        return true;
//    }
//}
//class pix extends  FormaPagamento{
//    @Override
//    public  void  processarPagamento(double valor){
//        if(validarPagamento()){
//            System.out.println("Pagamento de " + valor + " reais, com pix");
//        }
//    }
//    @Override
//    public boolean validarPagamento(){
//        System.out.println("Pagamento validado");
//        return true;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//
//        FormaPagamento pagamento1 = new cartaoDeCredito();
//        pagamento1.processarPagamento(500);
//
//        FormaPagamento pagamento2 = new boleto();
//        pagamento2.processarPagamento(100);
//
//        FormaPagamento pagamento3 = new pix();
//        pagamento3.processarPagamento(200);
//    }
//}
//atividade 8
//        package org.example;
//abstract class Funcionario{
//    protected String nome;
//    protected double salario;
//
//    public Funcionario(String nome, double salario){
//        this.nome = nome;
//        this.salario = salario;
//    }
//
//    public abstract double CalcularBonus();
//
//    public void promover()
//}
//class Gerente extends Funcionario {
//
//    public  Gerente(String nome, double salario){
//        super(nome, salario);
//
//    }
//
//    @Override
//    public double CalcularBonus() {
//        return this.salario+(this.salario * 0.20);
//    }
//
//}
//class Desenvolvedor extends Funcionario {
//
//    public  Desenvolvedor(String nome, double salario){
//        super(nome, salario);
//
//    }
//
//    @Override
//    public double CalcularBonus() {
//        return this.salario+(this.salario * 0.10);
//    }
//
//}
//class Estagiario extends Funcionario {
//
//    public  Estagiario(String nome, double salario){
//        super(nome, salario);
//
//    }
//
//    @Override
//    public double CalcularBonus() {
//        return this.salario;
//    }
//
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        Funcionario[] funcionarios = {
//                new Gerente("Carlos", 7000),
//                new Desenvolvedor("Ana", 4000),
//                new Estagiario("João", 1500)
//        };
//        double totalFolha = 0;
//        for (Funcionario f : funcionarios) {
//            totalFolha += f.CalcularBonus();
//            System.out.println(f.nome + " - : R$" + f.CalcularBonus());
//        }
//        System.out.println("folha de pagamento total: R$" + totalFolha);
//    }
//}