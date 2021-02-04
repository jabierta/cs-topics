public class Arrays {
    private String[] stringArray;
    private int[] intArray;
    private int[][] intMatrix;
    private Object[] objectArray;

    public Arrays(int stringArraySize, int intArraySize, int matrixSizeAtX, int matrixSizeAtY, int objectArraySize) {
        this.stringArray = new String[stringArraySize];
        this.intArray = new int[intArraySize];
        this.intMatrix = new int[matrixSizeAtX][matrixSizeAtY];
        this.objectArray = new Object[objectArraySize];
    }

    public String[] getStringArray() {
        return this.stringArray;
    }

    public int[] getIntArray() {
        return this.intArray;
    }

    public int[][] getIntMatrix() {
        return this.intMatrix;
    }

    public Object[] getObjectArray() {
        return this.objectArray;
    }
}
