
import java.util.ArrayList;

public class TestSanduba {
    public static void main(String[] args) {
        ArrayList<Sanduba> sandubas = new ArrayList<>();
        sandubas.add(new Sanduba("x- salada", 12.00));
        sandubas.add(new Sanduba("x- Banco", 13.00));
        sandubas.add(new Sanduba("x- Vegano", 12.00));
        for (Sanduba sands : sandubas) {
            System.out.println(sands);

        }
    }

}
