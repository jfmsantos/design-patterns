package comportamentais.visitor.visitor;

import comportamentais.visitor.shapes.Circle;
import comportamentais.visitor.shapes.CompoundShape;
import comportamentais.visitor.shapes.Dot;
import comportamentais.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
