package inclass412;

import util.In;

public class DijkstraClient {
  public static void main(String[] args) {
    In in = new In("1000EWG.txt");
    WeightedDiGraph G = new WeightedDiGraph(in);
    int s = 0;

    // compute the shortest paths
    Dijkstra sp = new Dijkstra(G, 21);
//    System.out.println(sp.distTo(21));
    System.out.println(sp.distTo(68));
    System.out.println(sp.pathTo(68));

    // print shortest paths
//    for (int t = 0; t < G.V(); t++) {
//      if (sp.hasPathTo(t)) {
//        System.out.printf("%d to %d (%.2f)  ", s, t, sp.distTo(t));
//        for (DirectedEdge e : sp.pathTo(t))
//          System.out.print(e + "   ");
//        System.out.println();
//      }
////      else System.out.printf("%d to %d         no path\n", s, t);
//    }
  }
}
