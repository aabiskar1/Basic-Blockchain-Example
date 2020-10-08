import java.lang.reflect.Array;
import java.util.Arrays;

public class Block {

    private int previousHash;

    //in real block chain transactions would be its own objects
    String[] transactions;

    //each block will also have its own hash
    private int blockHash;

    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;

        //Array on which the hash will be based on
        Object[] contents={Arrays.hashCode(transactions),previousHash};
        this.blockHash = Arrays.hashCode(contents);
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }
}
