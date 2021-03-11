package src.stackandqueue;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    // This problem could be solve using a LinkedHashMap
    final Node head = new Node();
    final Node tail = new Node();
    Map<Integer, Node> nodeMap;
    int maximumCapacity;

    public LRUCache(int capacity) {
        nodeMap = new HashMap<Integer, Node>(capacity);
        this.maximumCapacity = capacity;
        head.next = tail;
        head.prev = null;
        tail.prev = head;
        tail.next = null;
    }


    public int get(int key) {
        Node node = nodeMap.get(key);
        if (node == null) {
            return -1;
        } else {
            remove(node);
            add(node);
            return node.value;
        }
    }

    public void put(int key, int value) {
        Node node = nodeMap.get(key);
        if (node != null) { // already exist just update the value
            remove(node); // this becomes the newest Node
            node.value = value;
            add(node);
        } else { // doesn't exist so we need to insert it
            if (nodeMap.size() == maximumCapacity) { // need to check if we reached max
                nodeMap.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node newNode = new Node();
            newNode.key = key;
            newNode.value = value;
            nodeMap.put(key, newNode);
            add(newNode);
        }
    }

    // adding to the top of the double linked list
    // since we are removing the tail
    public void add(Node node) {
        Node headNext = head.next;
        headNext.prev = node;
        node.next = headNext;
        node.prev = head;
        head.next = node;
    }

    public void remove(Node node) {
        Node nextNode = node.next;
        Node prevNode = node.prev;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    class Node {
        int key;
        int value;
        Node prev;
        Node next;
    }
}


// Remove Least Recently used item to make room
// Get and Put will make the key the most recently used item

/**
 * capacity=3 new LRUCache() -> Cache[] HashMap[]
 * 
 * put(2,2)-> Cache[{2}], HeadNode:2 TailNode:2, HashMap[{2,2}]
 * 
 * put(1,1)-> Cache[{1},{2}], HeadNode:1 TailNode:2, HashMap[{2,2},{1,1}]
 * 
 * put(3,3)-> Cache[{3},{1},{2}], HeadNode:3 TailNode:2, HashMap[{2,2},{1,1},{3,3}]
 * 
 * get(2)-> Cache[{2},{3},{1}], HeadNode:2 TailNode:1, HashMap[{2,2},{1,1},{3,3}]
 * 
 * put(4,4)-> Cache[{4}{2}{3}], HeadNode:4 TailNode:3, HashMap[{2,2},{4,4},{3,3}]
 * 
 * put(5,5)-> Cache[{5}{4}{2}], HeadNode:5 TailNode:2, HashMap[{2,2},{4,4},{5,5}]
 * 
 **/

// So to keep track the nodes in order we use a double linked list.
// If an item gets used we just remove it from the list and re add it again

// Pointers and references are confusing make sure to understand what you are pointing to and
// account for all references

