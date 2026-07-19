/*
 * 332. Reconstruct Itinerary
 * Difficulty: Hard
 * Pattern: Eulerian path / DFS
 *
 * Problem:
 * You are given a list of airline tickets where tickets[i] = [fromi, toi]
 * represents the departure and arrival airports of one flight. Reconstruct the
 * itinerary in order and return it.
 *
 * All tickets belong to a man who departs from "JFK". Thus, the itinerary must
 * begin with "JFK". If there are multiple valid itineraries, return the itinerary
 * with the smallest lexical order when read as a single string.
 *
 * You may assume all tickets form at least one valid itinerary. You must use all
 * tickets exactly once.
 *
 * Example 1:
 * Input: tickets = [["MUC","LHR"],["JFK","MUC"],["SFO","SJC"],["LHR","SFO"]]
 * Output: ["JFK","MUC","LHR","SFO","SJC"]
 *
 * Example 2:
 * Input: tickets = [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
 * Output: ["JFK","ATL","JFK","SFO","ATL","SFO"]
 *
 * Constraints:
 * - 1 <= tickets.length <= 300
 * - tickets[i].length == 2
 * - fromi.length == toi.length == 3
 * - fromi and toi consist of uppercase English letters
 */
public class ReconstructItinerary {
    public java.util.List<String> findItinerary(
            java.util.List<java.util.List<String>> tickets) {
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //

    // Map<String, PriorityQueue<String>> graph = new HashMap<>();
    // for (List<String> ticket : tickets) {
    //     graph.computeIfAbsent(ticket.get(0), key -> new PriorityQueue<>()).offer(ticket.get(1));
    // }
    //
    // LinkedList<String> route = new LinkedList<>();
    // dfs("JFK", graph, route);
    // return route;
        throw new UnsupportedOperationException("Implement findItinerary");
    }

    // private void dfs(String airport, Map<String, PriorityQueue<String>> graph,
    //         LinkedList<String> route) {
    //     PriorityQueue<String> destinations = graph.get(airport);
    //     while (destinations != null && !destinations.isEmpty()) {
    //         dfs(destinations.poll(), graph, route);
    //     }
    //     route.addFirst(airport);
    // }
    

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement findItinerary and add checks.");
    }
}
