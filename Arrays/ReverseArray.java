class ReverseArray {

    public static void reverse(int numbers[]) {
        int s=0,e=numbers.length-1;
        while(s<e) {
            int temp = numbers[s];
            numbers[s] = numbers[e];
            numbers[e] = temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverse(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}