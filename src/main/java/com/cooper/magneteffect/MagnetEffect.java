package com.cooper.magneteffect;

import java.util.ArrayList;
import java.util.List;

public class MagnetEffect {

	private List<Point> anchors = new ArrayList<>();

	public Point check(Point beforePoint) {
		if (anchors.isEmpty()) {
			return beforePoint;
		} else {
			int nearDistance = 0;
			Point nearestAnchor = null;
			for (Point anchor : anchors) {
				int distance = calculateDistance(anchor, beforePoint);
				
				if (distance <= 5 && nearestAnchor == null) {
					nearDistance = distance;
					nearestAnchor = anchor;
				} else {
					if (nearDistance > distance) {
						nearDistance = distance;
						nearestAnchor = anchor;
					}
				}
			}
			
			if (nearestAnchor == null) {
				return beforePoint;
			} else {
				return nearestAnchor;
			}
		}
	}

	public void addAnchor(Point anchor) {
		anchors.add(anchor);
	}

	private int calculateDistance(Point anchor, Point beforePoint) {
		return (int) Math.sqrt((anchor.getX() - beforePoint.getX()) * (anchor.getX() - beforePoint.getX())
				+ (anchor.getY() - beforePoint.getY()) * (anchor.getY() - beforePoint.getY()));
	}

}
