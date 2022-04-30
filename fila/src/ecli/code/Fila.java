package ecli.code;

public class Fila {
	
	private static class Celula {
        Object item;
        Celula prox;
    }
	
    private Celula fundo, topo;
    Celula prox;
    private int tam;

    public Fila() {
        this.topo = null;
        this.tam = 0;
    }

    public boolean vazia() {
        return this.topo == null;
    }
    
    public int tamanho() {
        return this.tam;
    }	
    
    public void insert(Object x, int i) {
        Celula aux = this.topo;
        this.topo = new Celula();
        this.topo.item = x;
        this.topo.prox = aux;

        this.fundo = new Celula();
        this.fundo.item = i;
        this.fundo.prox = topo.prox;
    
        this.tam++;
    }

    public Object remove() throws Exception {
    	if(this.vazia()) {
            throw new Exception("PILHA VAZIA!");
        }
        
    	Object item = this.fundo.item;
        this.topo = this.fundo;
        this.fundo = this.fundo.prox;
        this.tam--;
        
        return item;

    }
}
