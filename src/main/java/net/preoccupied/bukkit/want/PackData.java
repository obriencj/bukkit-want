package net.preoccupied.bukkit.want;


import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

import net.preoccupied.bukkit.permissions.PermissionCheck;


/**
   @author Christopher O'Brien <obriencj@gmail.com>
 */
class PackData {
    
    public String name;
    public String title;
    public String message = null;
    public List<PackItem> items;

    public PermissionCheck permission = null;


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
	if(this.permission == null) {
	    this.permission = PermissionCheck.forNode("preoccupied.want.pack." + name);
	}
	return this.permission.check(p);
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
