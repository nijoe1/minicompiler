/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

public final class TElse extends Token
{
    public TElse()
    {
        super.setText("else");
    }

    public TElse(int line, int pos)
    {
        super.setText("else");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TElse(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTElse(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TElse text.");
    }
}
