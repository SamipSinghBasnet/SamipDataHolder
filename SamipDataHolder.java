
import java.util.ArrayList;

public class SamipDataHolder {
    private int[] data;
    private int size;
    //ne constructor


    public SamipDataHolder() {
        data = new int[10];
        size = 0;
    }

    public void addValue(int value) {
        if (size < data.length) {
            data[size] = value;
            size++;
        } else {
            int[] newData = new int[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
            data[size] = value;
            size++;
        }

    }

    public void removeValue(int position) {
        if (position >= 0 && position < size) {
            for (int i = position; i < size - 1; i++) {
                data[i] = data[i + 1];
            }
            size--;
        }
    }

    public int getSize() {



        return size;
    }
    public  int getElements(int n){
        return data[n];

    }


}