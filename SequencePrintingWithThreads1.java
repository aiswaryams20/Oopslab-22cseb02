/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication32;
public class SequencePrintingWithThreads {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new SequencePrinter(1));
        Thread thread2 = new Thread(new SequencePrinter(2));
        Thread thread3 = new Thread(new SequencePrinter(3));
        thread1.start();
        thread2.start();
        thread3.start();
    }

    static class SequencePrinter implements Runnable {
        private static final int SEQUENCE_LIMIT = 9;
        private static final int TOTAL_THREADS = 3;
        private final int threadNumber;

        public SequencePrinter(int threadNumber) {
            this.threadNumber = threadNumber;
        }

        @Override
        public void run() {
            for (int i = threadNumber; i <= SEQUENCE_LIMIT; i += TOTAL_THREADS) {
                System.out.println("Thread " + threadNumber + ": " + i);
            }
        }
    }
}
