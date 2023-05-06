package app;

public class ConjuredUpdater implements ItemUpdater {
    public void updateItem(Item item) {
        item.sellIn--;

        if (item.quality > 0) {
            item.quality = item.quality - 2;
        }

        if (item.sellIn < 0 && item.quality > 0) {
            item.quality = item.quality - 2;
        }
    }
}