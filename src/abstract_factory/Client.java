package abstract_factory;

public class Client {
    final private GardenCreator gardenCreator;

    public Client(GardenCreator gardenCreator) {
        this.gardenCreator = gardenCreator;
    }

    public void plantTree() {
    }

    public void plantFlower() {
    }

    public FlowerType getFlowerType() {
        return null;
    }

    public TreeType getTreeType() {
        return null;
    }
}
