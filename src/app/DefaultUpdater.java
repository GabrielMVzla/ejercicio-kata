package app;

public class DefaultUpdater implements ItemUpdater {
    public void updateItem(Item item) {
        item.sellIn--;

        if (item.quality > 0) {
            item.quality--;
        }

        if (item.sellIn < 0 && item.quality > 0) {
            item.quality--;
        }
    }
}
