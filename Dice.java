// Function definition
public int dice(){
	double random=Math.random(); //retrun number between 0 to 1 but not 1
	random=random*6 ;
	random=random+1;
	int randomint=int(random)
	return(randomint);
}
//Function call
int roll1(dice);