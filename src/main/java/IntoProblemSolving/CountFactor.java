package IntoProblemSolving;

public class CountFactor {

    public static void main(String[] args) {

        int number = 100;
        int count =0;
        for(int i=1;i<=Math.sqrt(number);i++){
            if(number/i > i){
                count += 2;
            }
        }
        System.out.println(count);
    }
}
