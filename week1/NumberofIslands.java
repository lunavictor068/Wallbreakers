package week1;

public class NumberofIslands {

    public static void main(String[] args){
        char[][] island1 = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        char[][] island2 = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'},
                {'0','0','0','1','1'}
        };
        char[][] island3 = {
                {'0','0','0','0','0'},
                {'0','0','0','0','0'},
                {'0','0','0','0','0'},
                {'0','0','0','0','0'}
        };
        char[][] island4 = {
                {'1','0','0','0','1'},
                {'0','0','0','0','0'},
                {'0','0','0','0','0'},
                {'1','0','0','0','1'}
        };
        char[][] island5 = {};
        System.out.println(numIslands(island1));
        System.out.println(numIslands(island2));
        System.out.println(numIslands(island3));
        System.out.println(numIslands(island4));
        System.out.println(numIslands(island5));
    }

    public static int numIslands(char[][] grid) {
        if (grid.length <= 0){
            return 0;
        }
        int rowLength = grid[0].length;
        int colLength = grid.length;
        UF uf = new UF(rowLength * colLength);
        int water = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[0].length; column++) {
                if (isLand(grid[row][column])){
                    int target = (rowLength * row) + column;
                    // bottom
                    if (!(row + 1 > grid.length - 1)){
                        if (isLand(grid[row + 1][column])){
                            int bottom = (rowLength * (row + 1)) + column;
                            uf.union(target, bottom);
                        }
                    }
                    // right
                    if (!(column + 1 > grid[0].length - 1)){
                        if (isLand(grid[row][column + 1])){
                            int right = (rowLength * row) + column + 1;
                            uf.union(target, right);                        }
                    }
                }
                else {
                    water++;
                }
            }
        }
        return uf.count() - water;
    }

    public static boolean isLand(char c){
        return c == '1';
    }



    public static class UF {

        private int[] parent;  // parent[i] = parent of i
        private byte[] rank;   // rank[i] = rank of subtree rooted at i (never more than 31)
        private int count;     // number of components

        /**
         * Initializes an empty union–find data structure with {@code n} sites
         * {@code 0} through {@code n-1}. Each site is initially in its own
         * component.
         *
         * @param n the number of sites
         * @throws IllegalArgumentException if {@code n < 0}
         */
        public UF(int n) {
            if (n < 0) throw new IllegalArgumentException();
            count = n;
            parent = new int[n];
            rank = new byte[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        /**
         * Returns the component identifier for the component containing site {@code p}.
         *
         * @param p the integer representing one site
         * @return the component identifier for the component containing site {@code p}
         * @throws IllegalArgumentException unless {@code 0 <= p < n}
         */
        public int find(int p) {
            validate(p);
            while (p != parent[p]) {
                parent[p] = parent[parent[p]];    // path compression by halving
                p = parent[p];
            }
            return p;
        }

        /**
         * Returns the number of components.
         *
         * @return the number of components (between {@code 1} and {@code n})
         */
        public int count() {
            return count;
        }

        /**
         * Returns true if the the two sites are in the same component.
         *
         * @param p the integer representing one site
         * @param q the integer representing the other site
         * @return {@code true} if the two sites {@code p} and {@code q} are in the same component;
         * {@code false} otherwise
         * @throws IllegalArgumentException unless
         *                                  both {@code 0 <= p < n} and {@code 0 <= q < n}
         */
        public boolean connected(int p, int q) {
            return find(p) == find(q);
        }

        /**
         * Merges the component containing site {@code p} with the
         * the component containing site {@code q}.
         *
         * @param p the integer representing one site
         * @param q the integer representing the other site
         * @throws IllegalArgumentException unless
         *                                  both {@code 0 <= p < n} and {@code 0 <= q < n}
         */
        public void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ) return;

            // make root of smaller rank point to root of larger rank
            if (rank[rootP] < rank[rootQ]) parent[rootP] = rootQ;
            else if (rank[rootP] > rank[rootQ]) parent[rootQ] = rootP;
            else {
                parent[rootQ] = rootP;
                rank[rootP]++;
            }
            count--;
        }

        // validate that p is a valid index
        private void validate(int p) {
            int n = parent.length;
            if (p < 0 || p >= n) {
                throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n - 1));
            }
        }
    }
}
