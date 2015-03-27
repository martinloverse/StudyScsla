import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class M3 {
    public static void main(String[] args) {
        String input = inputString();
        String[] inputWordsList = input.split(" ");
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < inputWordsList.length; i++) {
            String word = inputWordsList[i];
            char start = word.charAt(0);
            if ((Character.isUpperCase(start) || isNumber(word.substring(0))) && !result.contains(word)) {
                result.add(word);
            }
        }
        System.out.print(result.size());
    }

    private static int inputNum() {
        System.out.print("入力：");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        Integer target;
        try {
            target = Integer.parseInt(input);
        } catch (Exception e) {
            System.out.print("数値ではありません");
            return -1;
        } finally {
            scan.close();
        }
        return target;
    }

    private static String inputString() {
        Scanner in = new Scanner(System.in);
        String input = new String();
        while(in.hasNext()) {
            String buf = in.nextLine();
            input = input + buf;
        }
        return input;
    }

    public static boolean isNumber(String num) {
        try {
            Integer.parseInt(new String(num));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
