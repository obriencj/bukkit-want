package net.preoccupied.bukkit.want;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;


/**
   @author Christopher O'Brien <obriencj@gmail.com>
 */
class PackData {
    
    public String name;
    public String title;
    public String message = null;
    public List<PackItem> items;


    public PackData(String name) {
	this.name = name;
	this.title = name;
	this.items = new ArrayList<PackItem>();
    }


    public void addItem(int id, int type, int count) {
	addItem(new PackItem(id, type, count));
    }


    public void addItem(PackItem item) {
	items.add(item);
    }


    public boolean permitted(Player p) {
	return p.hasPermission("preoccupied.want.pack." + name);
    }


    class PackItem {
	public int id;
	public int type;
	public int count;

	public PackItem(int id, int type, int count) {
	    this.id = id;
	    this.type = type;
	    this.count = count;
	}
    }

}


/* The end. */
