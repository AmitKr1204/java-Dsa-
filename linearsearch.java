public class linearsearch {
    public static void main(String[] args) {
        int[] arr = { 10, 12, 23, 34, 65, 78, 65, 98 };
        int target = 23;
        int ans = LinearSearch(arr, target);
        System.out.println(ans);
    }

    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
               // return index;
                return element;
            }
        }
        return -1;

    }
}