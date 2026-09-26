class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        HashMap<String, String> map = new HashMap<>();

        for (List<String> row : knowledge) {
            map.put(row.get(0), row.get(1));
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                StringBuilder key = new StringBuilder();
                i++;

                while (s.charAt(i) != ')') {
                    key.append(s.charAt(i));
                    i++;
                }

                String value = map.get(key.toString());

                if (value == null) {
                    ans.append("?");
                } else {
                    ans.append(value);
                }

            } else {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}