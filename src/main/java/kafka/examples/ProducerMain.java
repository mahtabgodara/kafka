package kafka.examples;

public class ProducerMain {

	public static void main(String[] args)
	  {
	    Producer producerThread = new Producer(KafkaProperties.topic);
	    producerThread.start();
	    
	  }
}
