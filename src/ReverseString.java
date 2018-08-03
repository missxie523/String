public class ReverseString {
    public char[] reverseString(String s){
        char[] input = s.toCharArray();
        int left = 0, right = input.length - 1;
        while(left < right){
            swap(input, left, right);
            left++;
            right--;
        }
        return input;
    }
    private void swap(char[] input, int i, int j){
        char tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
    }
}
