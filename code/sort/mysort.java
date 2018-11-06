import java.io.*;
import java.util.*;

public class mysort {

    ArrayList<Node> N = new ArrayList<Node>();

    public static void main(String args[]) {
        new mysort().go();
    }

    public void go() {

        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();

        for(int i = 0; i < n; ++i) {
            int x = cin.nextInt();
            int y = cin.nextInt();
            N.add(new Node(x, y));
        }


        Collections.sort(N, new xcmp());

        for(int i = 0; i < n; ++i) {
            System.out.println("x = " + N.get(i).getX() + " y = " + N.get(i).getY());
        }

        TreeSet<Node> nodeSet = new TreeSet<Node>(new xcmp());
        nodeSet.addAll(N);

        for(Node no:nodeSet) {
            System.out.println("x = " + no.getX() + " y = " + no.getY());
        }
    }

    class xcmp implements Comparator<Node> {
        public int compare(Node one, Node two) {
            if(one.getX() == two.getX()) {
                return one.getY() - two.getY();
            }
            return one.getX() - two.getX();
        }
    }

    class Node {
        private int x;
        private int y;

        Node(int xx, int yy) {
            x = xx;
            y = yy;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

}