package Behavioral.Observer;

public class MyTopicSubscriber implements Observer {
    private String name;
    private Subject topic;
    public MyTopicSubscriber(String m){
        this.name = m;
    }
    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if(msg == null){
            System.out.println(": No new message");
        }else{
            System.out.println(name +":: Consuming message ::"+msg);
        }
    }

    @Override
    public void setSubject(Subject sub) {
        this.topic = sub;
    }
}
