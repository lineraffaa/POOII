package POOII.TiposGenericos;

public class TesteGen {
    public static void main(String[] args) {
        // Cria referencias Gen para Integer e para String.
        Gen<Integer> iOb;
        Gen<String> strOb;

        // Cria um objeto Gen<Integer> e atribui sua
        // referencia para iOb. Note o uso de autoboxing
        // para encapsular o valor 88 em um objeto Integer.
        iOb = new Gen<Integer>(88);

        // Mostra o tipo de dado usado por iOb.
        iOb.showType();

        // Obtém o valor em iOb. Note que
        // nenhuma coerção (cast) é necessário.
        int v = iOb.getOb();
        System.out.println("valor: " + v);

        System.out.println();

        // Cria um objeto Gen para Strings.
        strOb = new Gen<String>("Testa Genericos");

        // Mostra o tipo de dado usado por strOb.
        strOb.showType();

        // Obtém o valor de strOb. Novamente, note
        // que nenhum coerção (cast) é necessário.
        String str = strOb.getOb();
        System.out.println("valor: " + str);
    }
}
