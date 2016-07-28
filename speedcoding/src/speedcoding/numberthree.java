package speedcoding;
//import java.util.Calendar;



public class numberthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Calendar test = Calendar.getInstance();
		String time =  test.getTime().toString();
		System.out.println( test.getTimeInMillis());
		System.out.println( time );
		System.out.println(test.getCalendarType());
		 */
		//because index starts and zero the index is one lower than the month printed on an actual date. Iterators are set to month/day -1
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }; 
		String[] months= {"January", "Feburary", "March","April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		//today is 21 06 2016 
			int year = 2016; 
			int daysIterator = 2; //weekdays today is Thursday(3)
			int daysOfMonth= 21; 
			int monthsIterator = 6;
			int passageOfTime = 0; //in days 
			long heatDeathOfUniverse = 10;
			int answer= 0;
			
			while (passageOfTime<heatDeathOfUniverse ) // get bugs when i try to do conditions of year<2016, month<4 ect ect, ballpark the time and place it as variable for now   
			{
				if (daysIterator >= 6)
				{
					daysIterator=0;
				}
				else 
				{daysIterator++;}
				
				//happy new year 
				if (monthsIterator==11 && daysOfMonth==31){
					year++;
					monthsIterator=0;
					daysOfMonth=1;
				}
					
				switch(daysOfMonth){
				case(28):
				
					if(monthsIterator==1 && year%4 !=0 )//not a leap year
					{
						monthsIterator++;
					    daysOfMonth=1;
					}
					else{
						daysOfMonth++;
					}
				break;
				case(29):
					if(monthsIterator==1 && year%4 ==0 )//leap year// but also weird years where leap is skipped. so i should look that up
					{
						monthsIterator++;
					    daysOfMonth=1;
					}
					else 
						{daysOfMonth++;}
				
					    break;
					    
				
				case(31): ///january0, march2, may4, july6, august7, october9, december11 // is there a nicer way to write this? //December case is probably not needed. 
				 if (monthsIterator == 0 ||monthsIterator == 2 ||monthsIterator == 4 || monthsIterator == 6 || monthsIterator ==7 ||monthsIterator ==9 || monthsIterator == 11)//make nice
					monthsIterator++;
					daysOfMonth=1;
					break;
				
				
				case(30): //april3 june5, September8, november10  
				 if (monthsIterator ==3 || monthsIterator == 5 || monthsIterator==8 || monthsIterator ==10)// shorter way to write this? 
				 {//make nice
					monthsIterator++;
					daysOfMonth=1;
				  }
				 else daysOfMonth++;
					break;
				
				default:
					daysOfMonth++;
					break;
				}
				
				
				System.out.println("Today is " + days[daysIterator] +" "+ daysOfMonth +" "+  months[monthsIterator]+" "+ year);
				System.out.println(answer);
				answer++;
				
				passageOfTime++;
			}
				
				
			

			

		
		//31 days
		//jaunuary 1
		//march 3
		//may 5
		//july 7
		//august8
		//october 10
		//december 12

		//30 days
		//april 4
		//june 6
		//september 9
		//november 11	
		//feburary 2 28/29
	

	}

}
