import java.util.ArrayList;
import java.util.List;

public class Observer {
    public static void main(String[] args) {
        ReceiverObserver r1 = new ConcreteReceiver("Phạm Hương Quỳnh");
        ReceiverObserver r2 = new ConcreteReceiver("Nguyễn Huy Hoàn");

        SourceNews source = new SourceNews();
        source.addReceover(r1);
        source.addReceover(r2);
        source.sendNews();
    }
}

interface ReceiverObserver {
    void update(String news);
}

class SourceNews{
    private List<ReceiverObserver> observers = new ArrayList<>();
    public void addReceover(ReceiverObserver receiver){
        observers.add(receiver);
    }

    public void sendNews(){
        String content = "Hoàn bị chó cắn hóa dại";
        observers.forEach(receiver -> receiver.update(content));
    }
}

class ConcreteReceiver implements ReceiverObserver{
    private String name;

    public ConcreteReceiver(String name){
        this.name = name;
    }

    @Override
    public void update(String news){
        System.out.println("Bạn " + name + " đã nhận được tin");
    }
}