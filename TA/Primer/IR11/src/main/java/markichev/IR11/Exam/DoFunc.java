package markichev.IR11.Exam;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class DoFunc {

    public List<Double> myNumbers;
    public static List<Double> resultNumbers;

    public DoFunc() {
        CleenParam();
    }

    public DoFunc(int length) {
        CleenParam();

        Random random = new Random();

        for (int i = 0; i < length; i++) {
            double myRundomNumber = (double) random.nextInt(50);
            myNumbers.add(myRundomNumber);
        }

    }

    private void CleenParam() {
        myNumbers = new LinkedList<Double>();
        resultNumbers = new LinkedList<Double>();
    }

    public String getmyFunNumbers() {
        return myNumbers.toString();
    }

    public String DoCalculate() {
        resultNumbers = new LinkedList<Double>();

        int quantity = myNumbers.size();

        for (int i = 0; i < quantity; i++) {
            double getingNumber = myNumbers.get(i);
            double rezultCalculate = funcOnExem.Myformula(getingNumber);
            double roundRezultCalculate= RoundDouble(rezultCalculate);
            resultNumbers.add(roundRezultCalculate);
        }

        return resultNumbers.toString();
    }

    public double RoundDouble(double num) {
        return round(num, 2);
    }
    

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public void SetArgs(double[] args) {
        this.myNumbers.clear();
        for (int i = 0; i < args.length; i++) {
            this.myNumbers.add(args[i]);
        }
    }

}
