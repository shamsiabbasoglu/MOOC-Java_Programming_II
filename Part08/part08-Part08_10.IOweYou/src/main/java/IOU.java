
import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> oweList;

    public IOU() {
        oweList = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        oweList.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        if (oweList.containsKey(toWhom)) {
            return oweList.get(toWhom);
        } else {
            return 0;
        }
    }
}
