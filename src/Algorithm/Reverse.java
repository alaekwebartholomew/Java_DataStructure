package Algorithm;

public class Reverse<E> {

    public E[] reverseList(E[] data){
        int firstIndex = 0;
        int lastIndex = data.length - 1;
        while (firstIndex < lastIndex){
            E temp = data[firstIndex];
            data[firstIndex++] = data[lastIndex];
            data[lastIndex--] = temp;
        }
        return data;
    }
    public static void main(String[] args) {
        String[] str = {"code", "read", "money"};
        Integer[] element = {1, 2, 3, 4, 5, 6, 7};
        Reverse<String> rev = new Reverse<>();
        String[] data = rev.reverseList(str);
        for(String value: data){
            System.out.print(value +", ");
        }

    }
}
