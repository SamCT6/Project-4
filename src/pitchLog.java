import java.util.*;

public class pitchLog {

    ArrayList fastballs = new ArrayList<Integer>();
    ArrayList changeUps = new ArrayList<Integer>();
    ArrayList breakingBalls = new ArrayList<Integer>();
    calculator calculator = new calculator();

    ArrayList strikes = new ArrayList<Enum>();

    Stack log = new Stack();

    public void addPitch(Enum spot, Enum pitch, int velo, boolean swing){
        String add = spot.toString()+" "+pitch.toString()+"  "+ String.valueOf(velo);
        log.push(add);
        if (!spot.equals(location.BallUpLeft) && !spot.equals(location.BallUpRight) && !spot.equals(location.BallDownLeft)
                && !spot.equals(location.BallDownRight) || swing) {
            strikes.add(pitch);
        }
    }


    public float strikePercent(){
        return calculator.getStrikePercentage(strikes, log);
    }

    public String seeLastPitch(){
        System.out.println(log.peek());
        return Objects.toString(log.peek());
    }

    public int pitchCount(){
        return log.size();
    }

    public float fastballK(){
        return calculator.pitchStrike(pitchTypes.FASTBALL, strikes, fastballs);
    }

    public float changUpK(){
        return calculator.pitchStrike(pitchTypes.CHANGEUP, strikes, changeUps);
    }

    public float breakingBallK(){
        return calculator.pitchStrike(pitchTypes.BREAKINGBALL, strikes, breakingBalls);
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
