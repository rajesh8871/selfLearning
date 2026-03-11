package FactoryDemoApi;


public class SendDataToKakfkaTopic {
    public static void main(String[] args) {
        DemoFactory obj = new DemoFactory();
        Data data = obj.getApi("Api1");
        String messageData = data.getData();//get d

        //KafkaTemplateClass obj
        //obj will send message to my topic.("data", TopicName);
    }


}
