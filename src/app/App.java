package app;

public class App {
    /**
     * El problema es una Kata De Gilded Rose, que consiste en una tienda de objetos, donde cada objeto tiene una fecha de caducidad (sellIn) y una calidad (quality) asociadas.
     * La calidad determina la "belleza" del objeto, y puede cambiar con el tiempo. El objetivo del programa es actualizar la calidad de los objetos cada día, teniendo en cuenta sus fechas de caducidad y sus características individuales.
     * @param args
     */
    public static void main(String[] args) {
        Item[] items = new Item[] {
                new Item("Aged Brie", 2, 0),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Conjured Mana Cake", 3, 6),
                new Item("normal", 5, 10)
        };
        GildedRose app = new GildedRose(items);

        int days = 10;

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }
}
