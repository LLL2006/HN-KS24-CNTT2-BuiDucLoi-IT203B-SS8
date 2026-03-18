public class Adapter {
}

class YoungHuman{
    void move2foot(){
        System.out.println("Đi bằng 2 chân");
    }
}

interface OldHuman{
    void move2foot();
}

class HumanAdapter implements OldHuman{
    private YoungHuman old;
    public HumanAdapter(YoungHuman old){
        this.old = old;
    }
    public void move2foot(){
        old.move2foot();
    }
}
