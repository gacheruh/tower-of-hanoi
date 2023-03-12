public class towerOfHanoi {
    public static void main(String[] args) {
        towerofHanoi(3, 'A', 'B', 'C');
    }

    public static void towerofHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
          System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
          return;
        }
      
        towerofHanoi(n - 1, source, auxiliary, destination);
        System.out.println("Move disk " + n +" from rod " + source + " to rod " + destination);
        towerofHanoi(n - 1, auxiliary, destination, source);
    }
}
