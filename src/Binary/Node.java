package Binary;

public class Node {

        int key;
        String name;

        Binary.Node leftChild;
        Binary.Node rightChild;

        Node(int key,String name){
            this.key = key;
            this.name = name;
        }

        public String toString(){
            return name + " has the key " + key;
        }
    }


