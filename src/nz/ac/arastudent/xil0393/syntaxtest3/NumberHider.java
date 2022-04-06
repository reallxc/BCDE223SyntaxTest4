package nz.ac.arastudent.xil0393.syntaxtest3;

public class NumberHider {
    private int targetNumber,count = 0;

    public  NumberHider(){
        this.targetNumber = (int)(Math.random() * 100);
    }

    public  NumberHider(int targetNumber){
        this.targetNumber = targetNumber;
    }

    public String makeGuess(int guessNumber) {
        this.count++;
        if (guessNumber==this.targetNumber) return "You got it in " + count + " trials!";
        else if (guessNumber>this.targetNumber) return "Try lower";
        else return "Try higher";
    }
}
