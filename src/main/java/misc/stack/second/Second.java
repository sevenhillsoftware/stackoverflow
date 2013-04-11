package misc.stack.second;

import misc.stack.first.First;

public class Second extends First {

    public void delegate() {
        pro(); // compile succeeds, as expected
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        First fst = new First();
        //fst.pro(); // if uncommented, compile fails, as expected

        Second sec = new Second();
        sec.pro(); // called in context of implementation, compile succeeds
    }
}