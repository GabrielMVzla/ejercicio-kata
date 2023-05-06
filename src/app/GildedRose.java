package app;

import java.util.HashMap;
import java.util.Map;

/**
 * El GildedRose se deslindó de responsabilidades que no le concernían, para así poder aplicar a cada implementación su propia responsabilidad única
 */
public class GildedRose {
    Item[] items;
    Map<String, ItemUpdater> updaterMap;

    public GildedRose(Item[] items) {
        this.items = items;

        updaterMap = new HashMap<>();
        updaterMap.put("Aged Brie", new AgiedBrieUpdater());
        updaterMap.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePassesUpdater());
        updaterMap.put("Sulfuras, Hand of Ragnaros", new SulfurasUpdater());
        updaterMap.put("Conjured Mana Cake", new ConjuredUpdater());
    }
    public void updateQuality() {
        for (Item item : items) {
            ItemUpdater updater = updaterMap.getOrDefault(item.name, new DefaultUpdater());
            updater.updateItem(item);
        }
    }
}
