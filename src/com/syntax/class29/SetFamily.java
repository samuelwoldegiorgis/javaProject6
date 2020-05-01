package com.syntax.class29;

import java.util.*;

public class SetFamily {

	public static void main(String[] args) {
		//hashset does not guarantee insertion order
		Set<String> veggies = new HashSet<>();
		veggies.add("carrot");
		veggies.add("potato");
		veggies.add("cucumber");
		veggies.add("eggplant");
		veggies.add("potato");
		veggies.add("cucumber");
		veggies.add("tomato");
		System.out.println(veggies);

		//LinkedHashSet guarantee insertion order
		Set<String>fruits=new LinkedHashSet<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("kiwi");
		fruits.add("tomato");
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("tomato");
		System.out.println(fruits);

		//tree set stores objects in ascending order
		Set<Object> food=new TreeSet<>(veggies);
		//adding duplicate objects from veggies collection
		food.addAll(veggies);
		food.addAll(fruits);
		System.out.println(food);
	}
}
 30  src/com/syntax/class29/StroringDifferentObjects.java 
@@ -0,0 +1,30 @@
package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StroringDifferentObjects {

	public static void main(String[] args) {

		Set<Insurance> hset=new HashSet<>();
		hset.add(new Car("Geico", "BMW"));
		hset.add(new Pet("Progressive", "Dog"));
		hset.add(new Health("BCBS"));

		System.out.println(hset.size());

		Iterator<Insurance> it=hset.iterator();
		while(it.hasNext()) {
			//Insurance obj=new Car("Geico", "BMW")
			//we need to assing it to the variable because if we use it.next() --> moves to the next element
			Insurance obj=it.next();
			obj.getQuote();
			obj.cancelInsurance();
			obj.method();
			//obj.diplay --> won't be available to insurance type
			System.out.println("----------------------");
		}
	}

}
