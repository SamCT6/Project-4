import java.util.ArrayList;
import java.util.Objects;

public class calculator {

    public int avgVelo(ArrayList<Integer> velos) {
        if (!velos.isEmpty()) {
            int i;
            int total = 0;
            for (i = 0; i < velos.size(); i++) {
                total += Integer.parseInt(Objects.toString(velos.get(i)));
            }
            return (total / velos.size());
        }
        return 00;
    }






}
