package ru.kvaytg.wintools.api;

import me.adasdead.WTools.wMouse;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public final class WinMouse {

	private WinMouse() {
		throw new AssertionError("No instances allowed");
	}

	public static void leftClick() {
		wMouse.click((short) 1);
	}

	public static void rightClick() {
		wMouse.click((short) 0);
	}

	public static Position getCursorPosition() {
		int[] getPosition = wMouse._getPosition();
		return new Position(getPosition[0], getPosition[1]);
	}

	public static void setCursorPosition(int x, int y) {
		wMouse.setPosition(x, y);
	}

	public static void setCursorPosition(@NotNull Position position) {
		setCursorPosition(position.getX(), position.getY());
	}
	
}