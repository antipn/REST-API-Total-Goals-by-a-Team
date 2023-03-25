import java.util.*;

    class Solution2 {

        /*
         * Complete the 'jumpingOnClouds' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER_ARRAY c as parameter.
         */
        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(0, 0, 1, 0, 0,1,0); //4
            List<Integer> list2 = Arrays.asList(0, 0, 0, 1, 0,0); //3
            jumpingOnClouds(list);

            jumpingOnClouds(list2);

            String str = "abc";
            str = str.repeat(3);

            System.out.println(str);
        }

        public static int jumpingOnClouds(List<Integer> c) {
            // Write your code here
            int count = 0;

            for (int i = 0; i < c.size()-1;) {
                if ((i + 2 < c.size()) && (c.get(i + 2) == 0)) {
                    i = i + 2;
                } else {
                    i++;
                }
                count++;
            }
            System.out.println(count);
            return count;
        }

    }
