package net.preoccupied.bukkit.want;


import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

import net.preoccupied.bukkit.permissions.PermissionCheck;


class ItemData {
    
    public int id;
    public List<String> aliases;

    public int type = 0;

    public String group = "undefined";
    public int stack = 1;

    public PermissionCheck permission = null;


    public ItemData(int id, List<String> aliases) {
	this.id = id;
	this.aliases = aliases;
    }


    public boolean permitted(Player p) {
	if(this.permission == null) {
	    this.permission = PermissionCheck.forNode("preoccupied.want.item." + group);
	}
	return this.permission.check(p);
    }
}


/* The end. */
