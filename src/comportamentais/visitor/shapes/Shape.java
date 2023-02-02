package comportamentais.visitor.shapes;

import comportamentais.visitor.visitor.Visitor;

public interface Shape {
    void move(int x, int y);

    void draw();

    String accept(Visitor visitor);

}
