public class Pile <T>{
    private Node<T> testa=null;
    public int lenght=0;

    public Pile(){};

    public Pile(T data) {
        testa = new Node<T>(data,null);
        lenght ++;
    }
    public boolean isFull(){
        return (Runtime.getRuntime().freeMemory()==0);
    }
    public void push(T data) {
        testa=new Node<T>(data,testa);
        lenght++;
    }



    public T pop() throws Exception {
        if (isEmpty()) throw new Exception("Pila Vuota");
        T b=testa.getData();
        testa=testa.getPrevious();
        lenght--;
        return b;
    }

    public T pop(int indice) throws Exception{
       if (isEmpty()) throw new Exception("pila vuota");
        T b=null;
        Pile<T> buffer = new Pile<>();
        int lunghezza=this.lenght;
        for (int k=0;k<lunghezza;k++){
            if (k==indice) {
                b = this.pop();
            } else{
                buffer.push(this.pop());

            }
        }
        this.testa=null;
        for (int k=0;k<lunghezza;k++){
            this.push(buffer.pop());
        }
        System.gc();
        return b;
    }
    public boolean isEmpty(){
        if (testa==null) return true;
        return false;
    }
    public int size(){
        return lenght;
    }
    public T peek() throws Exception{
        if (isEmpty())throw new Exception("impossibile visualizzare coda vuota") ;
        return testa.getData();

    }

    @Override
    public String toString() {
        StringBuilder s=new StringBuilder();
        Node<T> corrente=testa;
        for (int k=0;k<lenght;k++){
            s.append(corrente.getData().toString()).append(corrente.getPrevious()==null ? "" : ",");
            corrente=corrente.getPrevious();
        }
        return s.toString();
    }
}
