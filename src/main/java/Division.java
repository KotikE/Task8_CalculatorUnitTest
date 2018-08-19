import java.util.ArrayList;

public class Division implements Operation{
    public ArrayList list;
    public Division (ArrayList list) {
        this.list = list;
    }

    public Division() {

    }

    public double calculate(ArrayList args) {
        double delenie = Double.parseDouble(args.get(1).toString());
        for (int i = 2; i < args.size(); i++) {
            if (!args.get(i).equals("0")) {
                delenie /= Double.parseDouble(args.get(i).toString());
            } else {
                throw new ArithmeticException();
            }
        }
        return delenie;
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }


}