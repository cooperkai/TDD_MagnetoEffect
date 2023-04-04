package com.cooper.magneteffect;

public class MagnetEffect {

	private Point anchor;
	
	public Point check(Point beforePoint) {
		if (anchor == null) {
			return beforePoint;
		} else {
			if (isInCircle(anchor.getX(), beforePoint.getX(), anchor.getY(), beforePoint.getY())) {
				return anchor;
			}
			return beforePoint;
		}
	}

	public void addAnchor(Point anchor) {
		this.anchor = anchor;
	}

	private boolean isInCircle(int x, int centerX, int y, int centerY) {
		int distance = (int) Math.sqrt((x - centerX) * (x - centerX) + (y - centerY) * (y - centerY));
		return distance <= 5;
	}

}
