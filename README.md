# Death Logger Spigot Plugin
This Spigot plugin creates a log message in the server log file each time a player dies.
The message contains the name of the player, the death message and the location the player died at.
That way external tools that analyze the server log can determine that a player died and trigger other actions.
Example: An admin wants to know the location where a player died so that lost items can be recovered more easily.

The message in the server log looks like this:

`<playername> died: <deathmessage> #XPlost=<droppedxp> @[<X>,<Y>,<Z>]`
