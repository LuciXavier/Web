public class Historico {
    Elemento topo;
    int tam;

    public HIstorico() {
        this.topo = null;
        this.tam = 0;
    }

    public void push(Web pagina) {
        Elemento e = new Elemento(pagina);
        e.proximo = topo;
        topo = e;
        tam++;
    }

    public Web pop() {
        if (empty()) {
            System.out.println("Pilha vazia");
            return null;
        }
        Elemento e = topo;
        topo = topo.proximo;
        tam--;
        return e.pagina;
    }

    public int size() {
        return tam;
    }

    public boolean empty() {
        return tam == 0;
    }

    public void imprimir() {
        if (empty()) {
            System.out.println("Pilha vazia");
            return;
        }
        Elemento atual = topo;
        while (atual != null) {
            System.out.println(atual.pagina);
            if (atual.proximo != null) {
                System.out.println(">");
            }
            atual = atual.proximo;
        }
        System.out.println();
    }
}
