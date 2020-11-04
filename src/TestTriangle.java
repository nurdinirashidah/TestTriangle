// To design a class to describe a triangle
class Triangle
{
		// instance variables
		private int a;
		private int b;
		private int c;
		private String type;
		
		// Default constructor
		public Triangle ()
		{
				a = 1;
				b = 1;
				c = 1;
				type = "Equilateral";
		}
		
		// Other constructor
		public Triangle (int a, int b, int c, String type)
		{
			this.a = a;
			this.b = b;
			this.c = c;
			this.type = type;
		}
		
		// Copy constructor
		public Triangle (Triangle t)
		{
			this.a = t.a;
			this.b = t.b;
			this.c = t.c;
		}
		
		// What I can do to this class?
		public double area ()
		{
			double s = (a + b + c) / 2.0;
			return Math.sqrt (s * (s - a) * (s - b) * (s - c));	
		}
		
		public int perimeter ()
		{
			return a + b + c;
		}
		
		public void printInfo ()
		{
			System.out.printf ("Triangle is: %s (%d, %d, %d)%n", type, a, b, c);
			System.out.printf ("==> area is %.3f and perimeter is %d%n",
									area (), perimeter ());
									
			System.out.println ("-------------------------");
		}
		
		// Accessor methods
		public int getA ()
		{
			return a;
		}
		
		public int getB ()
		{
			return b;
		}
		
		public int getC ()
		{
			return c;
		}
		
		// Mutator methods
		public void set (int a, int b, int c)
		{
			this.a = a;
			this.b = b;
			this.c = c;
		}
			
}

class TestTriangle
{
	public static void main (String [] args)
	{
		Triangle t0 = new Triangle ();
		Triangle t1 = new Triangle (5, 5, 5, "Equilateral");
		Triangle t2 = new Triangle (5, 5, 7, "Isosceles");
		Triangle t3 = new Triangle (5, 6, 7, "Scalene");
		
		t0.printInfo ();
		t1.printInfo ();
		t2.printInfo ();
		t3.printInfo ();
		
		// Invalid data, how to handle??
		Triangle t4 = new Triangle(1, -2, 3, "Scalene");
		t4.printInfo ();
		
	}
}