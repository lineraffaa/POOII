package POOII.TiposGenericos;

public class TesteDoisGen {
    public static void main(String[] args) {
        DoisGen<Integer, String> obj = new DoisGen<>(88, "generi");

        DoisGen<String, String> obj2 = new DoisGen<>("POO", "POO");

        obj.showType();
        obj2.showType();

        int v = obj.getOb1();
        System.out.println(obj.getOb1());

        System.out.println(obj.getOb2());

        System.out.println("valor: " + v);
        String str = obj.getOb2();
        System.out.println("valor: " + str);
    }
}
