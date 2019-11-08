package Behavioral.Observer;

public class ObserverPatternTest {

    public static void main(String[] args) {
        MyTopic topic = new MyTopic();
        Observer obj1 = new MyTopicSubscriber("Obj1");
        Observer obj2 = new MyTopicSubscriber("obj2");
        Observer obj3 = new MyTopicSubscriber("obj3");
        //register
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);
        // attacj observer to subject
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);
        // check if any update available
        obj1.update();
        // now send message to subject
        topic.postMessage("New Message");
    }
}
