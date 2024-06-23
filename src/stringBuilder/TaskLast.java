package stringBuilder;

public class TaskLast {
    /*
    ===TASK
    create a method
    pass a StringBuilder parameter to a method
    that method will return sum of digits from given StringBuilder object

    Example "AFA@$%adfg56y2L" --> 5+6+2=13
     */
    public static int sumOfDigits(StringBuilder builder) {
        int sum = 0;
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) >= '0' && builder.charAt(i) <= '9') {

                sum += Integer.parseInt(String.valueOf(builder.charAt(i)));//we need to parse the String char to integer
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("AFA@$%adfg56y2L");
        sumOfDigits(builder);
    }
}
