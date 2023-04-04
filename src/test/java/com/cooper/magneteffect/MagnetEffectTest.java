package com.cooper.magneteffect;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MagnetEffectTest {

	@Test
	void no_anchor() {
		Point expectPoint = new Point(49, 49);
		Point beforePoint = new Point(49, 49);
		
		MagnetEffect effect = new MagnetEffect();
		Point afterPoint = effect.check(beforePoint);
		
		assertEquals(expectPoint, afterPoint);
	}
	
	@Test
	void one_anchor() {
		// Example one
		Point expectPoint = new Point(50, 50);
		Point beforePoint = new Point(49, 50);
		
		MagnetEffect effect = new MagnetEffect();
		effect.addAnchor(new Point(50, 50));
		Point afterPoint = effect.check(beforePoint);
		
		assertEquals(expectPoint, afterPoint);
	}
	
	@Test
	void one_far_anchor() {
		// Example two
		Point expectPoint = new Point(50, 50);
		Point beforePoint = new Point(50, 50);
		
		MagnetEffect effect = new MagnetEffect();
		effect.addAnchor(new Point(0, 0));
		Point afterPoint = effect.check(beforePoint);
		
		assertEquals(expectPoint, afterPoint);
	}
	
	@Test
	void two_anchors_only_one_near() {
		// Example three
		Point expectPoint = new Point(100, 50);
		Point beforePoint = new Point(101, 48);
		
		MagnetEffect effect = new MagnetEffect();
		effect.addAnchor(new Point(100, 50));
		effect.addAnchor(new Point(50, 50));
		Point afterPoint = effect.check(beforePoint);
		
		assertEquals(expectPoint, afterPoint);
	}

}
