import static java.lang.IO.*;

void main() {

    Cofrinho cofrinho = new Cofrinho("Meu Cofrinho", 100);

    println("Nome: " + cofrinho.getNome());
    println("Saldo: " + cofrinho.getSaldo());
    println("Meta: " + cofrinho.getMeta());
    println("Progresso: " + cofrinho.getProgresso() + "%");
    println("Status: " + cofrinho.getStatus());

    println("\n--- ADICIONANDO DINHEIRO ---");
    cofrinho.adicionarDinheiro(50);

    println("Saldo: " + cofrinho.getSaldo());
    println("Progresso: " + cofrinho.getProgresso() + "%");
    println("Status: " + cofrinho.getStatus());

    println("\n--- RETIRANDO DINHEIRO ---");
    cofrinho.retirarDinheiro(20);

    println("Saldo: " + cofrinho.getSaldo());
    println("Progresso: " + cofrinho.getProgresso() + "%");
    println("Status: " + cofrinho.getStatus());

    println("\n--- ADICIONANDO MAIS DINHEIRO ---");
    cofrinho.adicionarDinheiro(70);

    println("Saldo: " + cofrinho.getSaldo());
    println("Progresso: " + cofrinho.getProgresso() + "%");
    println("Status: " + cofrinho.getStatus());
}