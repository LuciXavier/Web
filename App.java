public class App {
    public static void main(String[] args) {
        Pilha historico = new Pilha();

        historico.push(new Web("https://www.unimes.com", "Exemplo 1"));
        historico.push(new Web("https://www.banco.com", "Exemplo 2"));
        historico.push(new Web("https://www.shoppe.com", "Exemplo 3"));

    
        System.out.println("Histórico de navegação:");
        historico.imprimir();

        Web paginaVolta = historico.pop();
        System.out.println("Voltando para: " + paginaVolta);

        System.out.println("Histórico de navegação após voltar:");
        historico.imprimir();
    }
}
