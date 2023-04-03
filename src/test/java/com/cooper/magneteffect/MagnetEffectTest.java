package com.cooper.magneteffect;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MagnetEffectTest {

	@Test
	void test() {
		Point expectPoint = new Point(49, 49);
		Point beforePoint = new Point(49, 49);
		
		MagnetEffect effect = new MagnetEffect();
		Point afterPoint = effect.check(beforePoint);
		
		assertEquals(expectPoint, afterPoint);
	}

}
