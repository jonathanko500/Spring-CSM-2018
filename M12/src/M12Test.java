import java.util.*;

public class M12Test
{

	public static void main(String[] args)
	{
		Stack<Integer> s = new Stack<Integer>(  );

		s.push(23);

		s.push(9);

		System.out.println(s.pop(  ));    // p1

		s.push(14);

		s.push(3);

		s.push(17);

		s.push(8);

		System.out.println(s.pop(  ));     // p2

		System.out.println(s.peek(  ));    // p3
		System.out.println("///////////");
		
		System.out.println(s.size());
	}

}
