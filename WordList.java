import java.util.Arrays;

class WordList {
    private static final int DEFAULTSIZE = 100;// default
    private int maxWords;//size of the array
    private String[] list;
    private int length;//words are currently stored

    public WordList() {
        this.list = new String[DEFAULTSIZE];
        this.maxWords = DEFAULTSIZE;
        length = 0;
    }

    public WordList(int size_array) {
        if(size_array<0){ // check illegal entry can't be less than 1
            size_array = DEFAULTSIZE;
            this.list = new String[size_array];
            this.maxWords = size_array;
        }
        else {
            this.list = new String[size_array];
            this.maxWords = size_array;
        }
        length = 0;
    }
    public boolean addWord( String word) {
        if(maxWords > length) {
            list[length] = word;
            System.out.println("Word added to list.");
            length = length + 1;
            return true;
        }
        else {
            System.out.println("List is full, unable to add word.");
            return false;
        }
    }

    public Object findWord(String word) {
        for (int i=0;i<maxWords;i++){
            if(list[i].startsWith(word)){
                return i;
            }

        }


        return null;
    }



    @Override
    public String toString() {
        return "WordList{" +
                "maxWords=" + maxWords +
                ", list=" + Arrays.toString(list) +
                ", length=" + length +
                '}';
    }
}
