import java.util.ArrayList;

public class Subtraction implements Operation {
    private ArrayList list;

    public Subtraction(ArrayList list) {
        this.list = list;
    }
    public double calculate(ArrayList args) {
        double proizv = Double.parseDouble(args.get(1).toString());
        for (int i = 2; i < args.size(); i++) {
            proizv -= Double.parseDouble(args.get(i).toString());
        }
        return proizv;
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }
}