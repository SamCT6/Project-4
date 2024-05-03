import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

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

    public float getStrikePercentage(ArrayList<Enum> strikes, Stack<String> pitchCount) {
        return ((float) strikes.size() /pitchCount.size()* 100);
    }

    public float pitchStrike(Enum pitch, ArrayList<Enum> strikes, ArrayList<Integer> allPitches){
        int total = 0;
        for (int i = 0; i < strikes.size(); i++) {
            if (strikes.get(i).equals(pitch)){
                total ++;
        }
        }
        return ((float) total/allPitches.size()*100);
    }






}
