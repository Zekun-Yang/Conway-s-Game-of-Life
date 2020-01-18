import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        Main main = new Main();
        main.test();
        
    }

    public void test(){
        ArrayList<Integer> test = new ArrayList<>();
        Inne inne = new Inne(test);
        inne.add();
        System.out.println(test.size());

    }


    private class Inne{

        private ArrayList<Integer> in;
        public Inne(ArrayList<Integer> in){
            this.in = in;
        }


        public void add(){
            in.add(1);
            in.add(1);
            in.add(1);
            in.add(1);
            in.add(1);
        }
    }
}