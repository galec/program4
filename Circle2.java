

public class Circle2 extends Circle
{

	public Circle2(double x, double y, double radius)
	{
	   super(x,y,radius);
	}

	public boolean intersects(Circle other)
	{
	   if (Math.abs(center.x - other.center.x) < radius &&
	       Math.abs(center.y - other.center.y) < radius)
	      return true;
	   return false;
	}


}

