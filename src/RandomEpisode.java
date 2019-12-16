import javax.swing.*;
import java.util.Random;
public class RandomEpisode {
    public static void main (String[] args) {
        int[] episodes = {24, 24, 25, 24, 24, 25, 24, 24, 24, 18};
        Random rnd = new Random();
        int s = rnd.nextInt(episodes.length)+1;
        int e = rnd.nextInt(episodes[s-1])+1;
        JOptionPane.showMessageDialog(null, "s:"+s+"e:"+e);
    }
}
