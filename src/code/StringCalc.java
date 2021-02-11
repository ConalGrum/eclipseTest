package code;

public class StringCalc {

    public int add(String input) throws Exception {

        String[] numbers = input.split(",|\n");
        if (input.isEmpty()) {

            return 0;
        }
        if (input.length() == 1) {

            return stringToInt(input);
        } else {
            return sumOf(numbers);
        }

    }
  
    
    
    
    
   private int stringToInt(String input) {
        return Integer.parseInt(input);
    }


    private int sumOf(String[] nums) throws Exception {
        int sum = 0;

        for (String input : nums) {
            if(stringToInt(input) < 0){
                throw new Exception("Number is below zero");
            }
            sum += Integer.parseInt(input);
        }

        return sum;
    }
}
