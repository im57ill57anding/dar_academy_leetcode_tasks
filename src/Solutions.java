public class Solutions {
    static class leetcode_9 {
        public boolean isPalindrome(int x) {
            String s = Integer.toString(x);
            for (int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }

    static class leetcode_1342 {
        public int numberOfSteps(int num) {
            int cnt = 0;
            while (num > 0) {
                if (num % 2 == 0) {
                    num >>= 1;
                }
                else {
                    num --;
                }
                ++cnt;
            }
            return cnt;
        }
    }

    static class leetcode_1528 {
        public String restoreString(String s, int[] indices) {
            StringBuilder newOne = new StringBuilder(s);
            for (int i = 0; i < s.length(); ++i) {
                newOne.setCharAt(indices[i], s.charAt(i));
            }
            return newOne.toString();
        }
    }

    static class leetcode_1588 {
        public int sumOddLengthSubarrays(int[] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; ++i) {
                int cur = 0;
                for (int j = i; j < arr.length; ++j) {
                    cur += arr[j];
                    if ((j - i + 1) % 2 == 1) {
                        sum += cur;
                    }
                }
            }
            return sum;
        }
    }

    static class leetcode_1662 {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            StringBuilder s = new StringBuilder();
            StringBuilder t = new StringBuilder();
            for (String item : word1) {
                s.append(item);
            }
            for (String value : word2) {
                t.append(value);
            }
            return s.toString().equals(t.toString());
        }
    }
}
