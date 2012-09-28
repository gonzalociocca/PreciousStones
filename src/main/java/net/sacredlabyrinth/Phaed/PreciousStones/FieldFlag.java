package net.sacredlabyrinth.Phaed.PreciousStones;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author phaed
 */
public enum FieldFlag
{
    ALL,
    ALLOW_PLACE,
    ALLOW_DESTROY,
    PREVENT_FIRE,
    PREVENT_PLACE,
    PREVENT_DESTROY,
    PREVENT_VEHICLE_DESTROY,
    PREVENT_ENDERMAN_DESTROY,
    PREVENT_EXPLOSIONS,
    PREVENT_CREEPER_EXPLOSIONS,
    PREVENT_TNT_EXPLOSIONS,
    PREVENT_PVP,
    PREVENT_MOB_DAMAGE,
    PREVENT_MOB_SPAWN,
    PREVENT_ANIMAL_SPAWN,
    PREVENT_ENTRY,
    PREVENT_UNPROTECTABLE,
    PREVENT_FLOW,
    PREVENT_TELEPORT,
    PREVENT_FLIGHT,
    PROTECT_ANIMALS,
    PROTECT_MOBS,
    PROTECT_VILLAGERS,
    PROTECT_CROPS,
    ROLLBACK_EXPLOSIONS,
    REMOVE_MOB,
    HEAL,
    DAMAGE,
    REPAIR,
    FEED,
    AIR,
    BREAKABLE,
    WELCOME_MESSAGE,
    FAREWELL_MESSAGE,
    SNITCH,
    NO_CONFLICT,
    LAUNCH,
    CANNON,
    MINE,
    LIGHTNING,
    NO_OWNER,
    FORESTER,
    GRIEF_REVERT,
    GRIEF_REVERT_DROP,
    ENTRY_ALERT,
    CUBOID,
    ENABLE_ON_SRC,
    VISUALIZE_ON_SRC,
    VISUALIZE_ON_PLACE,
    KEEP_CHUNKS_LOADED,
    PLACE_GRIEF,
    TOGGLE_ON_DISABLED,
    REDEFINE_ON_DISABLED,
    MODIFY_ON_DISABLED,
    BREAKABLE_ON_DISABLED,
    NO_PLAYER_PLACE,
    APPLY_TO_REVERSE,
    APPLY_TO_ALL,
    ALLOWED_CAN_BREAK,
    SNEAKING_BYPASS,
    PLACE_DISABLED,
    PREVENT_USE,
    DYNMAP_AREA,
    DYNMAP_MARKER,
    DYNMAP_NO_TOGGLE,
    DYNMAP_DISABLED,
    CAN_CHANGE_OWNER,
    PLOT,
    POTIONS,
    NEUTRALIZE_POTIONS,
    SNEAK_TO_PLACE,
    NO_FALL_DAMAGE,
    CONFISCATE_ITEMS,
    EQUIP_ITEMS,
    ENABLE_WITH_REDSTONE,
    TRANSLOCATION,
    MASK_ON_ENABLED,
    MASK_ON_DISABLED,
    WORLDGUARD_REPELLENT,
    GROUP_ON_ENTRY,
    ENTRY_GAME_MODE,
    LEAVING_GAME_MODE,
    NO_ALLOWING,
    TELEPORT_ON_ENTRY,
    TELEPORT_ON_SNEAK,
    TELEPORT_ON_BLOCK_BREAK,
    TELEPORT_ON_BLOCK_PLACE,
    TELEPORT_ON_PVP,
    TELEPORT_ON_FIRE,
    TELEPORT_ON_SRC,
    TELEPORT_IF_HUNGRY,
    TELEPORT_IF_HURT,
    TELEPORT_DESTINATION,
    TELEPORT_BEFORE_DEATH,
    TELEPORT_EXPLOSION_EFFECT
    //TELEPORT_COST
    //TELEPORT_IF_HOLDING_ITEM
    //TELEPORT_IF_HAS_ITEM
    //TELEPORT_BACK_AFTER
    //SNEAKING_BYPASS

    ;
    private final static Map<String, FieldFlag> flags = Maps.newHashMap();

    private final static String[] unToggable = new String[]{
            "worldguard-repellent", "place-disabled", "sneaking-bypass", "breakable-on-disabled",
            "modify-on-disabled", "redefine-on-disabled", "prevent-unprotectable", "toggle-on-disabled",
            "no-conflict", "no-player-place", "apply-to-all", "apply-to-reverse", "cuboid", "all",
            "dynmap-disabled-by-default", "tekkit-block", "dynmap-no-toggle", "no-allowing"
    };

    /**
     * Whether this flag is un-toggable
     *
     * @return
     */
    public boolean isUnToggable()
    {
        String flagStr = this.toString();

        for (String flag : unToggable)
        {
            if (flag.equalsIgnoreCase(flagStr))
            {
                return true;
            }
        }

        return false;
    }

    /**
     * Returns a FieldFlag based on its flag string
     *
     * @param flagStr
     * @return
     */
    public static FieldFlag getByString(String flagStr)
    {
        return flags.get(flagStr);
    }

    /**
     * Returns the flag string for this flag
     *
     * @return
     */

    public String toString()
    {
        return this.name().replace('_', '-');
    }

    static
    {
        for (FieldFlag flag : values())
        {
            flags.put(flag.toString(), flag);
        }
    }
}
