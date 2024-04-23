import java.util.*;

public class pitchLog {

    Stack log = new Stack();

    public void addPitch(Enum location, Enum pitch, int velo){
        String add = location.toString()+" "+pitch.toString()+"  "+String.valueOf(velo);
        log.push(add);
        System.out.println(log.peek());
    }

    public void seeLastPitch(){
        log.peek();
    }

}
