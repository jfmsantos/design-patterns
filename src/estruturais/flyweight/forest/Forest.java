package estruturais.flyweight.forest;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import estruturais.flyweight.trees.Tree;
import estruturais.flyweight.trees.TreeFactory;
import estruturais.flyweight.trees.TreeType;

public class Forest extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}
