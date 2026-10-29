
import java.util.*;

class Solution {
    int LOG;
    int timer;
    int[] tin, tout, depth, parent;
    int[][] up;
    int[] bit;

    public List<Boolean> palindromePath(
            int n, int[][] edges, String s, String[] queries) {

        List<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        LOG = 1;
        while ((1 << LOG) <= n) {
            LOG++;
        }

        tin = new int[n];
        tout = new int[n];
        depth = new int[n];
        parent = new int[n];
        up = new int[LOG][n];

        Arrays.fill(parent, -1);

        int[] stack = new int[n];
        int[] order = new int[n];
        int top = 0, count = 0;

        stack[top++] = 0;
        parent[0] = 0;

        while (top > 0) {
            int u = stack[--top];

            tin[u] = ++timer;
            order[count++] = u;

            up[0][u] = parent[u];

            for (int k = 1; k < LOG; k++) {
                up[k][u] = up[k - 1][up[k - 1][u]];
            }

            for (int v : graph[u]) {
                if (v == parent[u]) {
                    continue;
                }

                parent[v] = u;
                depth[v] = depth[u] + 1;
                stack[top++] = v;
            }
        }

        for (int i = 0; i < n; i++) {
            tout[i] = tin[i];
        }

        for (int i = n - 1; i > 0; i--) {
            int u = order[i];
            tout[parent[u]] = Math.max(
                tout[parent[u]], tout[u]
            );
        }

        bit = new int[n + 2];

        char[] chars = s.toCharArray();

        for (int u = 0; u < n; u++) {
            int mask = 1 << (chars[u] - 'a');
            rangeUpdate(tin[u], tout[u], mask);
        }

        List<Boolean> result = new ArrayList<>();

        for (String query : queries) {
            String[] p = query.split(" ");

            if (p[0].equals("update")) {
                int u = Integer.parseInt(p[1]);
                char c = p[2].charAt(0);

                int oldMask = 1 << (chars[u] - 'a');
                int newMask = 1 << (c - 'a');

                rangeUpdate(tin[u], tout[u], oldMask ^ newMask);
                chars[u] = c;

            } else {
                int u = Integer.parseInt(p[1]);
                int v = Integer.parseInt(p[2]);

                int ancestor = lca(u, v);

                int mask = pointQuery(tin[u])
                         ^ pointQuery(tin[v])
                         ^ (1 << (chars[ancestor] - 'a'));

                result.add((mask & (mask - 1)) == 0);
            }
        }

        return result;
    }

    void rangeUpdate(int left, int right, int value) {
        add(left, value);
        add(right + 1, value);
    }

    void add(int index, int value) {
        for (int i = index; i < bit.length; i += i & -i) {
            bit[i] ^= value;
        }
    }

    int pointQuery(int index) {
        int result = 0;

        for (int i = index; i > 0; i -= i & -i) {
            result ^= bit[i];
        }

        return result;
    }

    boolean isAncestor(int u, int v) {
        return tin[u] <= tin[v] && tout[v] <= tout[u];
    }

    int lca(int u, int v) {
        if (isAncestor(u, v)) {
            return u;
        }

        if (isAncestor(v, u)) {
            return v;
        }

        for (int k = LOG - 1; k >= 0; k--) {
            if (!isAncestor(up[k][u], v)) {
                u = up[k][u];
            }
        }

        return parent[u];
    }
}
