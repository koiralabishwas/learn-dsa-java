package dsa.array;

import java.util.Arrays;

public class Array {

    private int[] array;
    private int count;

    private void resizeIfRequired() {
        if (array.length == count) {
            int[] newArray = new int[count * 2];

            for (int i = 0; i < count; i++) {
                newArray[i] = array[i];
            }

            this.array = newArray;

        }
    }

    public Array(int length) {
        this.array = new int[length];
    }

    // public void insert(int item) {
    // int[] newArr = new int[array.length + 1];
    // for (int i = 0; i < this.array.length; i++) {
    // newArr[i] = this.array[i];
    // }
    // newArr[newArr.length - 1] = item;
    // this.array = newArr;
    // }

    public void insert(int item) {
        resizeIfRequired();
        array[this.count++] = item; // array[count i.e => 0] に item 入ってから count ++ になる
    }

    // public void removeAt(int index) {
    // if (index < 0 || index >= count) {
    // throw new IllegalArgumentException("invalid arg");
    // }

    // int[] newArr = new int[this.array.length - 1];
    // for (int i = 0 , j = 0 ; i < this.array.length ; i ++) {
    // if (i == index) {
    // continue;
    // }
    // newArr[j++] = this.array[i];
    // }
    // this.array = newArr;
    // }

    public void removeAt(int index) {
        // validate the index
        // shift the array to left
        // best case => o(1)
        // worst case => o(n)
        if (index < 0 || index >= this.count) {
            throw new IllegalArgumentException();
        }
        for (int i = index; i < count - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
        this.count--;
    }

    public int max() {
        // is o(n) because we have to iterate each time in worst case 
        int max = 0 ;
        for (int i = 0 ; i < count ; i ++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public Array intersect(Array otherArray) {
        Array intersection = new Array(count);
        for (int elemet : this.array) {
            if (otherArray.indexOf(elemet)>= 0) {
                intersection.insert(elemet);
            }
        }
        return intersection;

    }

    public void reverse() {
        int[] reversedArray = new int[this.count];
        for (int i = 0 ; i < count ; i++) {
            reversedArray[i] = this.array[count - 1 -i];
        }
        this.array = reversedArray;
        
    }

    // 模範解答通り
    public int indexOf(int element) {
        for (int i = 0; i < count; i++) {
            if (this.array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public void insertAt(int item , int index) {
        if (index <  0 || index > count) throw new IllegalArgumentException();

        resizeIfRequired();

        // 後ろから 与えられた index につくまえまで　一個みぎにずらしていれている
        for (int i = count - 1 ; i >= index ; i --) {
            this.array[i + 1] = array[i];
        }
        array[index] = item; // index についたら、そこに itemいれたら、それ以前のものはいじらなくて良い
        count ++;
    }

    public void print() {
        for (int i = 0; i < this.count; i++) {
            System.out.print(array[i]);
        }
    }

    public static void main(String[] args) {
        // int[] numbers = new int[3];
        // numbers[0] = 1;
        // numbers[1] = 2;
        // numbers[2] = 3;

        int[] numbers = { 1, 2, 3 };
        System.out.println(Arrays.toString(numbers));
        /// O(1) lookup time
    }

}
