package abstract_factory;

public class IranianGardenCreator implements GardenCreator{
    private Tree tree;
    private Flower flower;

    @Override
    public void createTree() {
    }

    @Override
    public void createFlower() {
    }

    @Override
    public FlowerType getFlowerType() {
        return null;
    }

    @Override
    public TreeType getTreeType() {
        return null;
    }

    public Tree getTree() {
        return tree;
    }

    public Flower getFlower() {
        return flower;
    }
}
