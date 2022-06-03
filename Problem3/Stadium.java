package com.Problem3;

public enum Stadium {

	WANKHEDE_STADIUM,
	CHIDAMBARAM_STADIUM,
	M_CHINNASWAMY_STADIUM;
}

/*
Q3) Create an enum Stadium with the following names-
EDEN_GARDENS_STADIUM

WANKHEDE_STADIUM
CHIDAMBARAM_STADIUM
M_CHINNASWAMY_STADIUM

Now create a class IPL it will have a method-
homeTeamStadium(Stadium stadium) : void

inside this method switch on the Stadium enum and display the details of the Stadium.

Example:
If Stadium = EDEN_GARDENS_STADIUM then print “This is the home ground of KKR”
If Stadium = WANKHEDE_STADIUM then print “This is the home ground of Mumbai Indians”
If Stadium = CHIDAMBARAM_STADIUM then print “This is the home ground of CSK”
If Stadium = M_CHINNASWAMY_STADIUM then print “This is the home ground of RCB”

call the above homeTeamStadium method by taking the input Stadium name from the user using the
Scanner class.
*/