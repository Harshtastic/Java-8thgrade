package app;

public class CalenderApp {

	public static void main(String[] args) {
		String[] nameofmonth= new String[12];
		nameofmonth[0] ="Jan";
		nameofmonth[1] ="Feb";
		nameofmonth[2] ="Mar";
		nameofmonth[3] ="Apr";
		nameofmonth[4] ="May";
		nameofmonth[5] ="june";
		nameofmonth[6] ="july";
		nameofmonth[7] ="Aug";
		nameofmonth[8] ="Sep";
		nameofmonth[9] ="Oct";
		nameofmonth[10] ="Nov";
		nameofmonth[11] ="Dec";
		//create endofmonth reference variable and array
		int[]endofmonth = new int[12];
		endofmonth[0] =31;
	    endofmonth[1] =28;
	    endofmonth[2] =31;
	    endofmonth[3] =30;
	    endofmonth[4] =31;
	    endofmonth[5] =30;
	    endofmonth[6] =31;
	    endofmonth[7] =31;
	    endofmonth[8] =30;
	    endofmonth[9] =31;
	    endofmonth[10] =30;
	    endofmonth[11] =31;
	    int numoftabs = 0;   				
		for( int m=0; m<12; m= m+1 ) {
			System.out.println();
			System.out.println(nameofmonth[m]);
			System.out.println();
			System.out.println("\tSun\tMon\tTue\tWed\tThur\tFri\tSat");
			for( int i=0; i<numoftabs; i=i+1 ) {
				System.out.print("\t");
			}
			//for (int i=1; i<32; i=i + 1 ) {
			for (int i=1; i<(endofmonth[m]+1); i=i + 1 ) {

				System.out.print( "\t"+ i  );
				//i%7
				if ( (numoftabs + i) %7==0 ) {
					System.out.println() ;	
				}		
			}//for
			numoftabs= endofmonth[m]%7;
			//System.out.println("#tabs is " + numoftabs);
			
		}//for
		

	}

}
