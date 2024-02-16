package POOII.TiposGenericos;

public class Gen<T> {
    private T ob; // declara uma referência a um objeto de tipo T

    // passa para o construtor uma referência
    // a um objeto de tipo T.
    public Gen(T o) {
        ob = o;
    }

    // retorna ob.
    public T getOb() {
        return ob;
    }

    // O método showType() exibe o tipo de T.
    // Ele faz isso chamando getName() no objeto Class
    // retornado pela chamada a getClass() em ob
    public void showType() {
        System.out.println("Tipo de T = " + ob.getClass().getName());
    }
}