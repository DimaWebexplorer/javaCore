package lr3;

class NodeHead {
    public int value;
    public NodeHead next;

    NodeHead(int value, NodeHead next) {
        this.value = value;
        this.next = next;
    }
}

public class OwnTask7Part1 {
    public static void main(String[] args) {
        NodeHead node3 = new NodeHead(3, null);
        NodeHead node2 = new NodeHead(2, node3);
        NodeHead node1 = new NodeHead(1, node2);
        NodeHead node0 = new NodeHead(0, node1);

        NodeHead ref = node0;

        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
