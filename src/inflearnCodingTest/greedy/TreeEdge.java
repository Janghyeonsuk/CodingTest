package inflearnCodingTest.greedy;

class TreeEdge implements Comparable<TreeEdge> {
    public int v1;
    public int v2;
    public int cost;

    public TreeEdge(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(TreeEdge o) {
        return this.cost - o.cost;
    }
}
