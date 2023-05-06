package app;

public class BackstagePassesUpdater implements ItemUpdater {
    public void updateItem(Item item) {
        item.sellIn--;

        if (item.quality < 50) {
            item.quality++;

            if (item.sellIn < 11 && item.quality < 50) {
                item.quality++;
            }

            if (item.sellIn < 6 && item.quality < 50) {
                item.quality++;
            }
        }

        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}