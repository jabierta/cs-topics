package src.hashing;

public class DataItem {
    private Integer key;
    private Integer data;

    public DataItem(Integer key, Integer data) {
        this.key = key;
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public void setData(Integer data) {
        this.data = data;
    }
}
