package com.cooper.magneteffect;

import java.util.ArrayList;
import java.util.List;

public class MagnetEffect {

	private List<Point> anchors = new ArrayList<>();

	public Point check(Point beforePoint) {
		if (anchors.isEmpty()) {
			return beforePoint;
		} else {
			for (Point anchor : anchors) {
				if (isInCircle(anchor, beforePoint)) {
					return anchor;
				}
				return beforePoint;
			}
		}
		return beforePoint;
	}

	public void addAnchor(Point anchor) {
		anchors.add(anchor);
	}

	private boolean isInCircle(Point anchor, Point beforePoint) {
		int distance = (int) Math.sqrt((anchor.getX() - beforePoint.getX()) * (anchor.getX() - beforePoint.getX())
				+ (anchor.getY() - beforePoint.getY()) * (anchor.getY() - beforePoint.getY()));
		return distance <= 5;
	}

}
