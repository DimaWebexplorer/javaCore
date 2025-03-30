package lr3;

class NodeExample {
    int value;
    NodeExample next;

    NodeExample(int value, NodeExample next) {
        this.value = value;
        this.next = next;
    }
}

class LinkedList {
    private NodeExample head;

    public void createHead(int[] values) {
        for (int value : values) {
            head = new NodeExample(value, head);
        }
    }

    public void createTail(int[] values) {
        NodeExample tail = null;
        for (int value : values) {
            NodeExample newNode = new NodeExample(value, null);
            if (tail == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        NodeExample ref = head;
        while (ref != null) {
            sb.append(ref.value).append(" ");
            ref = ref.next;
        }
        return sb.toString().trim();
    }

    public void addFirst(int value) {
        head = new NodeExample(value, head);
    }

    public void addLast(int value) {
        NodeExample newNode = new NodeExample(value, null);
        if (head == null) {
            head = newNode;
        } else {
            NodeExample ref = head;
            while (ref.next != null) {
                ref = ref.next;
            }
            ref.next = newNode;
        }
    }

    public void insert(int index, int value) {
        if (index == 0) {
            addFirst(value);
            return;
        }
        NodeExample ref = head;
        for (int i = 0; i < index - 1 && ref != null; i++) {
            ref = ref.next;
        }
        if (ref != null) {
            ref.next = new NodeExample(value, ref.next);
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        NodeExample ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }
        NodeExample ref = head;
        for (int i = 0; i < index - 1 && ref != null; i++) {
            ref = ref.next;
        }
        if (ref != null && ref.next != null) {
            ref.next = ref.next.next;
        }
    }

    public void createHeadRec(int[] values) {
        head = createHeadRecHelper(values, 0);
    }

    private NodeExample createHeadRecHelper(int[] values, int index) {
        if (index >= values.length) return null;
        return new NodeExample(values[index], createHeadRecHelper(values, index + 1));
    }

    public void createTailRec(int[] values) {
        head = createTailRecHelper(values, values.length - 1);
    }

    private NodeExample createTailRecHelper(int[] values, int index) {
        if (index < 0) return null;
        NodeExample newNode = new NodeExample(values[index], null);
        newNode.next = createTailRecHelper(values, index - 1);
        return newNode;
    }

    public String toStringRec() {
        return toStringRecHelper(head).trim();
    }

    private String toStringRecHelper(NodeExample node) {
        if (node == null) return "";
        return node.value + " " + toStringRecHelper(node.next);
    }
}

public class OwnTask8 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.createHead(new int[]{1, 2, 3, 4, 5});
        System.out.println("Список после ввода с головы: " + list);

        list.createTail(new int[]{6, 7, 8, 9, 10});
        System.out.println("Список после ввода с хвоста: " + list);

        list.addFirst(0);
        System.out.println("Список после добавления элемента в начало: " + list);

        list.addLast(11);
        System.out.println("Список после добавления элемента в конец: " + list);

        list.insert(5, 99);
        System.out.println("Список после вставки элемента: " + list);

        list.removeFirst();
        System.out.println("Список после удаления элемента с головы: " + list);

        list.removeLast();
        System.out.println("Список после удаления последнего элемента: " + list);

        list.remove(5);
        System.out.println("Список после удаления элемента с указанным номером: " + list);

        list.createHeadRec(new int[]{1, 2, 3, 4, 5});
        System.out.println("Список после ввода с головы (рекурсия): " + list.toStringRec());

        list.createTailRec(new int[]{6, 7, 8, 9, 10});
        System.out.println("Список после ввода с хвоста (рекурсия): " + list.toStringRec());
    }
}
