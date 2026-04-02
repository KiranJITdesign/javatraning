import java.util.*;
//default calss for route
class Route{
    int scr,dest,distance;
    Route(int scr,int dest,int distance){
        this.scr=scr;
        this.dest=dest;
        this.distance=distance;
    }
}
public class LogisticsRouteOptimizer {
    public static void analyzeRoutes(List<Route> routes){

        int shortest=Integer.MAX_VALUE;
        int longest=Integer.MIN_VALUE;
        int totalDistance=0;
        Map<Integer,Integer> city= new HashMap<>();
        for (Route r : routes) {
            int distance=r.distance;
            shortest=Math.min(shortest, distance);
            longest=Math.max(longest, distance);
            totalDistance=totalDistance+distance;
            city.put(r.scr,city.getOrDefault(r.scr, 0)+1);
            city.put(r.dest,city.getOrDefault(r.dest, 0)+1);
        }

        double average=(double)totalDistance/routes.size();
        int aboveAverage =0;
        for (Route r : routes) {
            if (r.distance > average) {
                aboveAverage++;
            }
        }

        System.out.println("Shortest route: " + shortest);
        System.out.println("Longest route: " + longest);
        System.out.println("Total distance: " + totalDistance);
        System.out.println("Average distance: " + average);
        System.out.println("Routes above average: " + aboveAverage);
        System.out.println("City connectivity:");
        for (Integer c : city.keySet()) {
            System.out.println("City: " + c + ", --->" + city.get(c));
        }
    }

    public static void main(String[] args) {
        List<Route> route = Arrays.asList(new Route(0, 1, 10),
                                           new Route(0, 2, 15),
                                           new Route(1, 2, 15),
                                           new Route(1, 3, 30),
                                           new Route(2, 3, 20));

        analyzeRoutes(route);
    }
}
