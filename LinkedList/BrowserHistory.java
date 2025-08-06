import java.util.*;

public class BrowserHistory {
    public class Node {
        String data;
        Node next;
        Node prev;

        public Node(String url) {
            this.data = url;
            this.next = null;
            this.prev = null;
        }
    }

    Node current;

    public BrowserHistory(String homePage) {
        current = new Node(homePage);
    }

    public void visit(String url) {
        Node newSite = new Node(url);
        current.next = newSite;
        newSite.prev = current;
        current = newSite;
    }

    public String forward(int steps) {
        while (steps-- > 0) {
            if (current.next != null) {
                current = current.next;
            } else {
                break;
            }
        }
        return current.data;
    }

    public String back(int steps) {
        while (steps-- > 0) {
            if (current.prev != null) {
                current = current.prev;
            } else {
                break;
            }
        }
        return current.data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}