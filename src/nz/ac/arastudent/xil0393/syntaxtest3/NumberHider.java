package nz.ac.arastudent.xil0393.syntaxtest3;

public class NumberHider {
    //Test marking point: protected attributes
    //Test marking point: use of at least one build-in type
    private int targetNumber,count = 0;

    //Test marking point: two constructors
    public  NumberHider(){
        //Test marking point: seeding of a random number
        this.targetNumber = (int)(Math.random() * 100);
    }
    public  NumberHider(int targetNumber){
        this.targetNumber = targetNumber;
    }

    public String makeGuess(int guessNumber) {
        //Test marking point: use of ++
        this.count++;
        //Test marking point: use of if statement
        if (guessNumber==this.targetNumber) return "You got it in " + count + " trials!";
        else if (guessNumber>this.targetNumber) return "Try lower";
        else return "Try higher";
    }
}
