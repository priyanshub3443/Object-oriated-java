public public class ThreadStateExample {

    public static void main(String[] args) throws InterruptedException {
        // Create a new thread that will sleep for 2 seconds
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread is going to sleep.");
                Thread.sleep(2000);
                System.out.println("Thread has awakened.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread was interrupted.");
            }
        });

        // Display the initial state of the thread
        System.out.println("Initial thread state: " + thread.getState());

        // Start the thread and immediately check its state
        thread.start();
        System.out.println("State after starting: " + thread.getState());

        // Sleep for a short time to ensure the thread goes to sleep
        Thread.sleep(100);
        System.out.println("State while the thread is sleeping: " + thread.getState());

        // Wait for the thread to finish and check its final state
        thread.join();
        System.out.println("Final thread state: " + thread.getState());
    }
}
 
