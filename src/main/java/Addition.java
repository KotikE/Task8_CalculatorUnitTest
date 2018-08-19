import java.util.ArrayList;

public class Addition implements Operation {
    public ArrayList list;
    public Addition (ArrayList list) {
        this.list = list;
    }

    public Addition() {

    }

    public double calculate(ArrayList args) {
        double proizv = Double.parseDouble(args.get(1).toString());
        for (int i = 2; i < args.size(); i++) {
            proizv += Double.parseDouble(args.get(i).toString());
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
