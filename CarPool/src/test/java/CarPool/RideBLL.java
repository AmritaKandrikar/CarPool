package CarPool;


public class RideBLL {

	public String SaveRide(Ride ride)
	{
		if(ride.userName.equals(" ")){
			
			return "Posting as unsuccessfull.";
		}else{
			
			return "Posting as successfull.";	
		}
		
		
	}
}
