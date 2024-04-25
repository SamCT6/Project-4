import java.util.*;

public class pitchLog {

    ArrayList fastballs = new ArrayList<Integer>();
    ArrayList changeUps = new ArrayList<Integer>();
    ArrayList breakingBalls = new ArrayList<Integer>();
    calculator calculator = new calculator();

    Stack log = new Stack();

    public void addPitch(Enum location, Enum pitch, int velo){
        String add = location.toString()+" "+pitch.toString()+"  "+ String.valueOf(velo);
        log.push(add);
        System.out.println(log.peek());

    }

    public void seeLastPitch(){
        log.peek();
    }

    public void trackPitch(int velo, Enum pitch){
        if (pitch.equals(pitchTypes.FASTBALL)){
            fastballs.add(velo);
        }
        else if (pitch.equals(pitchTypes.CHANGEUP)){
            changeUps.add(velo);
        }
        else{
            breakingBalls.add(velo);
        }
    }
    public int fastballAvg(){
        return (calculator.avgVelo(fastballs));
    }

    public int changeUpAvg(){
        return (calculator.avgVelo(changeUps));
    }

    public int breakingBallAvg(){
        return (calculator.avgVelo(breakingBalls));
    }


}
