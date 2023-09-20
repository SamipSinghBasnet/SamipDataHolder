

import java.util.Arrays;
public class TestSamipDataHolder {
    public static void main(String[] args) {
        SamipDataHolder holder = new SamipDataHolder();
        holder.addValue(5);
        holder.addValue(10);
        holder.addValue(15);
        System.out.println("Size: " + holder.getSize()); // Output: Size:

        holder.removeValue(1);
        System.out.println("Size: " + holder.getSize()); // Output: Size:

        for (int i=0;i<holder.getSize();i++)
        {

        System.out.println(holder.getElements(i));
        }

    }
}

