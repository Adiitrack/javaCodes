// Function definition
public int dice(){
	double random=Math.random(); //retrun number between 0 to 1 but not 1
	random=random*6 ;
	random=random+1;
	int randomint=int(random)
	return(randomint);
}
public int keeprooling(){
	int dice1=dice();
	int dice2=dice();
	int dice3=dice();
	int dice4=dice();
	int dice5=dice();
	int count =1;
	while(!(dice1==dice2 && dice1==dice3 && dice1==dice4 && dice1==dice5){
		int dice1=dice();
		int dice2=dice();
		int dice3=dice();
		int dice4=dice();
		int dice5=dice();
		count+=1;
	}
	return count;
}
int count=keeprooling();