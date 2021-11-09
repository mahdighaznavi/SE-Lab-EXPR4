package abstract_factory;

public class JapaneseGardenCreator implements GardenCreator {
    private Tree tree;
    private Flower flower;

    public Tree getTree() {
        return tree;
    }

    public Flower getFlower() {
        return flower;
    }

    @Override
    public FlowerType getFlowerType() {
        return null;
    }

    @Override
    public TreeType getTreeType() {
        return null;
    }

    @Override
    public void createTree() {
    }

    @Override
    public void createFlower() {
    }
}
