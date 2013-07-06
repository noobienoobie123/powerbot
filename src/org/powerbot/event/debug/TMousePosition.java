package org.powerbot.event.debug;

import java.awt.Graphics;
import java.awt.Point;

import org.powerbot.event.TextPaintListener;
import org.powerbot.gui.BotChrome;
import org.powerbot.script.methods.MethodContext;
import org.powerbot.util.StringUtil;

public class TMousePosition implements TextPaintListener {
	public int draw(int idx, final Graphics render) {
		MethodContext ctx = BotChrome.getInstance().getBot().getMethodContext();
		Point p = ctx.mouse.getLocation();
		StringUtil.drawLine(render, idx++, "Mouse position: " + (int) p.getX() + "," + (int) p.getY());
		return idx;
	}
}
