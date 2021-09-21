package PointsOnCircle;

class GFG
{
	public static int startAngle,endAngle,middleAngle;
	public static int count=0;
static void checkPoint(String direction, int radius, int [] x,int [] y)
{
	if(direction=="U") {
		startAngle=45;
		endAngle=135;
	}else if(direction=="D"){
		startAngle=225;
		endAngle=315;
	}else if(direction=="R"){
		startAngle=45;
		middleAngle=0;
		endAngle=315;
	}else if(direction=="L"){
		startAngle=135;
		endAngle=225;
	}
	for(int i=0;i<x.length;i++) {
		double polarradius = Math.sqrt(x[i]*x[i]+y[i]*y[i]);
		double Angle =Math.toDegrees( Math.atan2(y[i],x[i]));
		if(Angle<0) {
			Angle=Angle+360;
		}
		if(direction=="R") {
			if (Angle>=0 && Angle<=45 && Angle>=369 && Angle<=315  && polarradius<radius) {
				count++;
			}
		}else {
			if (Angle>=startAngle && Angle<=endAngle && polarradius<=radius) {
				count++;
			}
		}
	}
	System.out.println("Number Of Enemies caugth : "+count);
}


	public static void main(String arg[]){
		String direction="U";
		int radius = 5;
		int [] x = {-1,-2,4,1,3,0};
		int [] y = {5,4,3,3,1,-1};
		checkPoint(direction, radius, x,y);
	
	}
}

