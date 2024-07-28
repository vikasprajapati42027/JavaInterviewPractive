
package org.example.collections.practice.MutiThreading;
public class EvenOrOddM {

    private int count = 1;
    private final Object lock = new Object();

    public void displayEven() {
        synchronized (lock) {
            while (count <= 20) {
                try {
                    if (count % 2 != 0) {
                        lock.wait();
                    } else {
                        System.out.print(count + " ");
                        count++;
                        lock.notify();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void displayOdd() {
        synchronized (lock) {
            while (count <= 20) {
                try {
                    if (count % 2 == 0) {
                        lock.wait();
                    } else {
                        System.out.print(count + " ");
                        count++;
                        lock.notify();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        EvenOrOddM eo=new EvenOrOddM();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                eo.displayEven();
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                eo.displayOdd();
            }
        });
        t1.start();
        t2.start();
    }
}


//
//public class EvenOrOddM{
//    private int c=1;
//
//   public void displayEven()
//   {
//       synchronized (this) {
//           for (int i = 1; i <= 20; i++) {
//               try {
//                   wait();
//               } catch (Exception e) {
//                   e.printStackTrace();
//               }
//               if (i % 2 == 0) {
//                   System.out.print(c + " ");
//
//               }
//               c++;
//               notify();
//           }
//       }
//   }
//   public void displayOdd()
//   {
//       synchronized (this) {
//           for (int i = 1; i <= 20; i++) {
//               try {
//                   wait();
//               } catch (Exception e) {
//                   e.printStackTrace();
//               }
//               if (i % 2 != 0) {
//                   System.out.print(c + " ");
//               }
//               c++;
//               notify();
//           }
//       }
//   }
//
//    public static void main(String[] args) {
//       EvenOrOddM eo=new EvenOrOddM();
//        Thread t1=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                eo.displayEven();
//            }
//        });
//
//        Thread t2=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                eo.displayOdd();
//            }
//        });
//        t1.start();
//        t2.start();
//    }
//}
