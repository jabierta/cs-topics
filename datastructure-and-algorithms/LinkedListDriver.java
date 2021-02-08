public class LinkedListDriver {

    public void run() {
        System.out.println("=============Single Linked List=============");
        SingleLinkNode head = new SingleLinkNode(0);
        System.out.println("Creating First Node(" + head.getData() + ")");

        SingleLinkedList singleLinkedList = new SingleLinkedList(head);

        SingleLinkNode secondNode = new SingleLinkNode(1);
        System.out.println("Adding Node(" + secondNode.getData());
        head.setNext(secondNode);

        SingleLinkNode thirdNode = new SingleLinkNode(2);
        System.out.println("Adding Node(" + thirdNode.getData());
        secondNode.setNext(thirdNode);

        SingleLinkNode fourthNode = new SingleLinkNode(3);
        System.out.println("Adding Node(" + fourthNode.getData());
        thirdNode.setNext(fourthNode);

        SingleLinkNode fifthNode = new SingleLinkNode(4);
        System.out.println("Adding Node(" + fifthNodegetData());
        fourthNode.setNext(fifthNode);

        fifthNode.setNext(null);

        singleLinkedList.prettyPrintList();

        // System.out.println("Traversing through the SingleLinkedList\n");
        // singleLinkedList.prettyPrintList();
        // System.out.println("Reversing the list");
        // singleLinkedList.reverseList();
        // System.out.println("Traversing through the Reversed SingleLinkedList\n");
        // singleLinkedList.prettyPrintList();
        // singleLinkedList.prettyPrintList();

        // Node seventhNode = new Node(7);
        // Node sixthNode = new Node(6);



        System.out.println("=============Single Linked List=============");

        // Linked List Operations:
        // Insertion
        // Deletion
        // Display
        // Search -> Wait for algorithms
        // Delete

    }


}
