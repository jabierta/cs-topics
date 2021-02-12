package src.hashing;

public class HashTable {
    private DataItem[] hashTable;

    public HashTable(int hashTableSize) {
        this.hashTable = new DataItem[hashTableSize];
    }

    public DataItem[] getHashTable() {
        return hashTable;
    }

    public void setHashTable(DataItem[] hashTable) {
        this.hashTable = hashTable;
    }


    public void insert(int data) {
        int key = this.hashCode(data);
        if (this.hashTable[key] != null) {
            System.out.println("Collision!");
        } else {
            this.hashTable[key] = new DataItem(key, data);
        }
    }

    public void delete(int data) {
        int key = this.hashCode(data);
        this.hashTable[key] = null;
    }

    public int hashCode(int data) {
        return data % hashTable.length;
    }

    public DataItem search(int data) {
        int key = this.hashCode(data);
        return hashTable[key];
    }
}
