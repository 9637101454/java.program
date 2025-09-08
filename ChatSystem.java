public class ChatSystem {
    static class User extends Thread {
        private String name;
        private boolean running = true;
        private boolean suspended = false;

        public User(String name, int priority) {
            this.name = name;
            setPriority(priority);
        }

        public void sendMessage(String message) {
            System.out.println(name + " sends: " + message);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void receiveMessage(String message) {
            System.out.println(name + " receives: " + message);
        }

        public void suspendThread() {
            suspended = true;
            System.out.println(name + " suspended.");
        }

        public void resumeThread() {
            suspended = false;
            synchronized (this) {
                notify();
            }
            System.out.println(name + " resumed.");
        }

        public void stopThread() {
            running = false;
            System.out.println(name + " stopped.");
        }

        @Override
        public void run() {
            System.out.println(name + " started with priority " + getPriority());
            while (running) {
                if (suspended) {
                    try {
                        synchronized (this) {
                            wait();
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                sendMessage("Hello from " + name);
                receiveMessage("Reply to " + name);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        User user1 = new User("User1", Thread.MAX_PRIORITY);
        User user2 = new User("User2", Thread.NORM_PRIORITY);

        user1.start();
        user2.start();

        System.out.println("User1 is alive: " + user1.isAlive());
        System.out.println("User2 is alive: " + user2.isAlive());

        Thread.sleep(2000);
        user1.suspendThread();
        Thread.sleep(1000);
        user1.resumeThread();

        Thread.sleep(3000);
        user1.stopThread();
        user2.stopThread();

        user1.join();
        user2.join();

        System.out.println("User1 is alive: " + user1.isAlive());
        System.out.println("User2 is alive: " + user2.isAlive());
    }
}