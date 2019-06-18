package com.kata.training.kata;

import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.AnyOf;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsCollectionContaining;
import org.mockito.internal.matchers.Contains;

import com.training.beans.Biscuit;
import com.training.beans.Person;

import junit.framework.TestCase;

public class BiscuitTest extends TestCase{
	  public void testEquals() {
	      Biscuit theBiscuit = new Biscuit("Ginger");
	      Biscuit myBiscuit = new Biscuit("Ginger");
	      assertThat(theBiscuit, Is.is(theBiscuit));
	      Person sara = new Person("Sara", 4);
	      Person viktor = new Person("Viktor", 40);
	      Person eva = new Person("Eva", 42);
	      Person anna = new Person("Anna", 5);
	      List<Person> collection = Arrays.asList(sara, eva, viktor, anna);
	      assertThat(collection, );

	    }
}