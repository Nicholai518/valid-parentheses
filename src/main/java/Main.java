public class Main {
    public static void main(String[] args) {
        String exampleOne = "()";
        String exampleTwo = "()[]{}";
        String exampleThree = "(]";
        String exampleFour = "([}}])";

        Solution solution = new Solution();
        System.out.println(exampleOne + " : " + solution.isValid(exampleOne));
        System.out.println(exampleTwo + " : " + solution.isValid(exampleTwo));
        System.out.println(exampleThree + " : " + solution.isValid(exampleThree));
        System.out.println(exampleFour + " : " + solution.isValid(exampleFour));
    }
}
