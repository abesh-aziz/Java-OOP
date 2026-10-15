class BusTrip{
    private String tripCode;
    private String route;
    private int fare;
    private int capacity;
    private int seatsLeft;
    int bookedseats=0;
    private static int tripCount=0;

    BusTrip(String route, int fare, int capacity){
        this.route=route;
        this.fare=fare;
        this.capacity=capacity;
        tripCount++;
        this.tripCode="BT-" + (200+tripCount); //left to right
        this.seatsLeft=capacity;

    }

    BusTrip(String route, int fare){
        this(route, fare, 40);
    }

    public static int getTripCount(){
        return tripCount;
    }

    public String getRoute(){
        return route;
    }

    public int getSeatsLeft(){
        return seatsLeft;
    }

    public int getRevenue(){
        return bookedseats*fare;

    }

    public boolean bookSeats(int count){
        if(count<=0 || count>seatsLeft){
            System.out.println("Booking failed for "+route);

            return false;
        }
        seatsLeft=seatsLeft-count;
        bookedseats=bookedseats+count;

        return true;
    }

    public void printInfo(){
        System.out.printf("%s %-12s Tk %3d seats left: %2d%n",  tripCode,route, fare, seatsLeft);
    }

    static BusTrip findByRoute(BusTrip[] trips, String route){
        for(int i=0; i<trips.length; i++){
            if(trips[i].route.equals(route)){
                trips[i].printInfo();
                return trips[i];
            }
        }
        System.out.println("No such route: "+route);
        return null;
    }
}