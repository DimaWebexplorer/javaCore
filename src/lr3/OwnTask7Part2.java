package lr3;

class NodeTail {
    public int value;
    public NodeTail next;

    NodeTail(int value, NodeTail next) {
        this.value = value;
        this.next = next;
    }
}

public class OwnTask7Part2 {
    public static void main(String[] args) {
        NodeTail head = null;
        for (int i = 4; i >= 0; i--) {
            head = new NodeTail(i, head);
        }

        NodeTail ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
