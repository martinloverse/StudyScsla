import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class CopyOfM3 {
    public static void main(String[] args) {
        List<String> inputLines = Arrays.asList("a,b,c","1,3,4","1,3,4");
//        List<String> inputLines = inputString();
        String header = inputLines.get(0);
        int columnCount = header.split(",").length;
        double[] avarages = new double[columnCount];
        for (int i = 0; i < columnCount; i++) {
            avarages[i] = 0;
        }

        for (int i = 1; i < inputLines.size(); i++) {
            String[] line = inputLines.get(i).split(",");
            for (int j = 0; j < columnCount; j ++) {
                avarages[j] += Integer.parseInt(line[j]);
            }
        }

        StringBuffer buffer = new StringBuffer();
        for (int j = 0; j < columnCount; j ++) {
            buffer.append(Math.round(avarages[j] / (double)columnCount));
            buffer.append(",");
        }

        System.out.println(header);
        String ret = buffer.toString();
        System.out.println(ret.substring(0,ret.length()-1));
    }

    private static List<String> inputString() {
        Scanner in = new Scanner(System.in);
        List<String> input = new ArrayList<String>();
        while(in.hasNext()) {
            String buf = in.nextLine();
            input.add(buf);
        }
        return input;
    }

}
