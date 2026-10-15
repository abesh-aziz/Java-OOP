public class BusCounter {
    public static void main(String[] args){
        int total_rev=0;
        int emptiest =0;
        BusTrip[] trips = new BusTrip[4];
        trips[0] = new BusTrip("Mirpur-DSC", 50, 30);
        trips[1] = new BusTrip("Uttara-DSC", 40, 25);
        trips[2] = new BusTrip("Gabtoli-DSC", 35);
        trips[3] = new BusTrip("Savar-DSC", 30, 20);
        trips[0].bookSeats(12);
        trips[1].bookSeats(30);
        trips[2].bookSeats(8);
        
        BusTrip busy= new BusTrip("Savar-DSC", 30, 20);
        busy.bookSeats(20);
        for(int i=0; i<trips.length;i++){
            trips[i].printInfo();
            total_rev=total_rev+trips[i].getRevenue();
        }
        System.out.println("Total Revenue: "+total_rev);
        for(int i=1; i<trips.length; i++){
            if(trips[i].getSeatsLeft()>trips[emptiest].getSeatsLeft()){
                emptiest=i;
            }
        }
        System.out.println("Most seats left: "+trips[emptiest].getRoute());
        System.out.println("trips[3] seats left: "+trips[3].getSeatsLeft());
    }
}
