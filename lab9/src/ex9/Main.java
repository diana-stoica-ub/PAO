package ex9;

/**
 * There are five silent philosophers (P1 – P5) sitting around a circular table, spending their lives eating and thinking.
 *
 * There are five forks for them to share (1 – 5) and to be able to eat, a philosopher needs to have forks in both his hands.
 * After eating, he puts both of them down and then they can be picked by another philosopher who repeats the same cycle.
 *
 * The goal is to come up with a scheme/protocol that helps the philosophers achieve their goal of eating
 * and thinking without getting starved to death.
 *
 * more: https://www.baeldung.com/java-dining-philoshophers
 */
public class Main {

    public static void main(String[] args) throws Exception {

        Philosopher[] philosophers = new Philosopher[5];
        Object[] forks = new Object[philosophers.length];

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < philosophers.length; i++) {

            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % forks.length];

            if (i == philosophers.length - 1) {
                philosophers[i] = new Philosopher(rightFork, leftFork); // The last philosopher picks up the right fork first to avoid a deadlock
            } else {
                philosophers[i] = new Philosopher(leftFork, rightFork);
            }

            Thread t = new Thread(philosophers[i], "Philosopher " + (i + 1));
            t.start();
        }
    }
}
