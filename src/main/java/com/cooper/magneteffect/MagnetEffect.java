package com.cooper.magneteffect;

public class MagnetEffect {

	private Point anchor;

	public Point check(Point beforePoint) {
		if (anchor == null) {
			return beforePoint;
		} else {
			if (isInCircle(beforePoint)) {
				return anchor;
			}
			return beforePoint;
		}
	}

	public void addAnchor(Point anchor) {
		this.anchor = anchor;
	}

	private boolean isInCircle(Point beforePoint) {
		int distance = (int) Math.sqrt((anchor.getX() - beforePoint.getX()) * (anchor.getX() - beforePoint.getX())
				+ (anchor.getY() - beforePoint.getY()) * (anchor.getY() - beforePoint.getY()));
		return distance <= 5;
	}

}
