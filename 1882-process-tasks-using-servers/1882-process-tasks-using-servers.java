
class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {

        PriorityQueue<int[]> available = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0])
                    return Integer.compare(a[0], b[0]);
                return Integer.compare(a[1], b[1]);
            }
        );

        PriorityQueue<int[]> busy = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0])
                    return Integer.compare(a[0], b[0]);
                if (a[1] != b[1])
                    return Integer.compare(a[1], b[1]);
                return Integer.compare(a[2], b[2]);
            }
        );

        for (int i = 0; i < servers.length; i++) {
            available.offer(new int[]{servers[i], i});
        }

        int[] ans = new int[tasks.length];
        long currentTime = 0;

        for (int i = 0; i < tasks.length; i++) {

            currentTime = Math.max(currentTime, i);

            while (!busy.isEmpty() &&
                   busy.peek()[0] <= currentTime) {

                int[] s = busy.poll();

                available.offer(new int[]{s[1], s[2]});
            }

            if (available.isEmpty()) {

                currentTime = busy.peek()[0];

                while (!busy.isEmpty() &&
                       busy.peek()[0] <= currentTime) {

                    int[] s = busy.poll();

                    available.offer(new int[]{s[1], s[2]});
                }
            }

            int[] server = available.poll();

            ans[i] = server[1];

            busy.offer(new int[]{
                (int)(currentTime + tasks[i]),
                server[0],
                server[1]
            });
        }

        return ans;
    }
}
