class Solution {
    int[] arr;

    public String encode(List<String> strs) {

        arr = new int[strs.size()];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs.size(); i++) {

            arr[i] = strs.get(i).length();

            for (int j = 0; j < strs.get(i).length(); j++) {

                char ch = strs.get(i).charAt(j);

                sb.append((char)((ch + 1) % 256));
            }
        }

        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> ans = new ArrayList<>();

        int start = 0;

        for (int i = 0; i < arr.length; i++) {

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < arr[i]; j++) {

                char ch = str.charAt(start + j);

                sb.append((char)((ch - 1 + 256) % 256));
            }

            ans.add(sb.toString());

            start += arr[i];
        }

        return ans;
    }
}