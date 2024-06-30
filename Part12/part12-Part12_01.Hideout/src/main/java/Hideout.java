
import java.util.ArrayList;
import java.util.List;

public class Hideout<T> {

    private final List<T> hideouts;

    public Hideout() {
        this.hideouts = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        if (hideouts.contains(toHide)) {
            hideouts.remove(toHide);
            return;
        }
        hideouts.add(toHide);
    }

    public T takeFromHideout() {
        if (hideouts.isEmpty()) {
            return null;
        }
        T hideout = hideouts.get(hideouts.size() - 1);
        hideouts.remove(hideout);
        return hideout;
    }

    public boolean isInHideout() {
        return !hideouts.isEmpty();
    }
}
