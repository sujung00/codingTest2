package Java2;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(11);
    }

    public void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n/2);
            System.out.print(n%2 + " ");
        }
    }
}
