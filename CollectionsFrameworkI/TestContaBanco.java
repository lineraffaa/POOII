
import java.util.ArrayList;

public class TestContaBanco {
    public static void main(String[] args) {
        ArrayList<ContaBanco> contas = new ArrayList<>();
        contas.add(new ContaBanco(100002, 1000));
        contas.add(new ContaBanco(12343, 7000));
        contas.add(new ContaBanco(122321, 8000));
        contas.add(new ContaBanco(2089797, 89000));

        for (ContaBanco c : contas) {
            System.out.println(c);
        }
        for(int i = 0; i < contas.size(); i++){

        }
    }
}
