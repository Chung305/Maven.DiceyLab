public class Dice {
    private int numberOfRolls;

    public Dice(int x){
        this.numberOfRolls = x;

    }

    public int tossAndSum(){
        int result = 0;
        for(int i = 0; i < numberOfRolls; i ++){
            result += (int)(Math.random() * ((6 - 1) + 1) + 1);
        }
        return result;

    }





}
