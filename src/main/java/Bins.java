
public class Bins {

    private int numberOfDie;
    private int timesTossed;

    public Bins(int numberOfDie, int timesTossed){
        this.numberOfDie = numberOfDie;
        this.timesTossed = timesTossed;
    }

    public double[] saveRolls(){

        Dice die = new Dice(numberOfDie);
        double[] saveOcurrences = new double[numberOfDie * 6];

        for(int i = 0; i < timesTossed; i++){
            saveOcurrences[die.tossAndSum() - 1] += 1;

        }
        return saveOcurrences;

    }
    public void printOcurrences(){

        double[] result = saveRolls();

        for(int i = numberOfDie-1; i < result.length; i++){
            System.out.printf("%4d %s %7.0f %s %1.2f %s", i+1," : ", result[i], " : ", result[i]/timesTossed, "  ");

                for(int j = 0; j < (result[i]/timesTossed)*100; j++){
                    System.out.print("*");
                }
                System.out.println();
        }

    }








}
