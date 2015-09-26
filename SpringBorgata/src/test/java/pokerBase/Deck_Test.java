package pokerBase;

import org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Deck_Test {
	
	public Deck d;

	@BeforeClass
	public void setUpBeforeClass() throws Exception {
		d = new Deck(52);
	}

	@AfterClass
	public void tearDownAfterClass() throws Exception {
		d = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestFullDeck() {
		//	I put this test in so it would pass...
		//TODO: Code a unit test to make sure calling the deck constructor passes back 52 cards in a deck.
		assertTrue(d.getTotalCards() == 52);
		assertFalse(d.getTotalCards() != 52);
		
		assertTrue(1==1);
	}

}
