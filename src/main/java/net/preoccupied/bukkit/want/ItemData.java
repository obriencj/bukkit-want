package net.preoccupied.bukkit.want;


import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;


/**
   @author Christopher O'Brien <obriencj@gmail.com>
 */
class ItemData {
    
    public int id;
    public String group;
    public List<String> aliases;

    public int type = 0;
    public int stack = 1;


    public ItemData(int id, String group, List<String> aliases) {
	this.id = id;
	this.group = group;
	this.aliases = aliases;
    }


    public String getName() {
	return aliases.get(0);
    }


    public boolean permitted(Player p) {
	return p.hasPermission("preoccupied.want.item." + group);
    }
}


/* The end. */
