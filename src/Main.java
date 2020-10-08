import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Blocks contains list of transactions and previous hash


        String[] genesisTransactions = {"Someone sent Aabiskar 2 bitcoin","Someone sent Aabiskar 8 bitcoin"};

        Block genesisBlock = new Block(0,genesisTransactions);


        //second block will need hash of the previous block(in this case genesis block)
        String[] secondTransactions = {"Aabiskar sent 2 bitcoin to someone"};
        Block secondBlock = new Block(genesisBlock.getBlockHash(),secondTransactions);


        //third block will need hash of the previous block(in this case second block)
        String[] thidTransactions = {"Aabiskar sent 3 bitcoin to someone","Someone sent 5 bitcoin to Aabiskar"};
        Block thidBlock = new Block(secondBlock.getBlockHash(),secondTransactions);


        System.out.println("Hash of genesis block: "+genesisBlock.getBlockHash());
        System.out.println("Hash of second block: "+secondBlock.getBlockHash());
        System.out.println("Hash of second block: "+thidBlock.getBlockHash());


        // if any thing on a block is changed it will change all the hash of the following blocks
    }

}
