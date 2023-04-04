package com.cooper.magneteffect;

public class MagnetEffect {

	private Point anchor;
	
	public Point check(Point beforePoint) {
		if (anchor == null) {
			return beforePoint;
		} else {
			return anchor;
		}
	}

	public void addAnchor(Point anchor) {
		this.anchor = anchor;
	}

}
