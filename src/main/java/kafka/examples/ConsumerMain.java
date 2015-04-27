package kafka.examples;

public class ConsumerMain {

	public static void main(String[] args)
	  {
	    Consumer consumerThread = new Consumer(KafkaProperties.topic);
	    consumerThread.start();
	    
	  }
}
