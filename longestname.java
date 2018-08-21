public String findLongestName(String [] names){
    int size= names.length;
    String longestName=names[0];
    for(int i=1;i<size;i++){
    	if(longestName.length() < names[i].length()){
    	    longestName=names[i];
    	}
    }
    return longestName;
}