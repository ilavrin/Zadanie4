public class Main {
    public static void main(String[] args) {
        int amountOfBricksLavrinenko = 67;
        int containerCapacityLavrinenko = 8;
        int numberOfBricksInTheLastBoxLavrinenko = amountOfBricksLavrinenko % containerCapacityLavrinenko;
        int numberOfFullBoxesLavrinenko = (amountOfBricksLavrinenko - numberOfBricksInTheLastBoxLavrinenko)/containerCapacityLavrinenko;
        System.out.println("The number of full boxes is " + numberOfFullBoxesLavrinenko);
        System.out.println("The number of bricks in the last box is " + numberOfBricksInTheLastBoxLavrinenko);
    }
}