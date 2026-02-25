#play sound
execute as @e[type=zoudi_chicken] at @s if block ~ ~-1 ~ #leaves run playsound entity.zoudi_chicken_yaaah master @p ~ ~ ~ 256
#give that player advancement
execute as @e[type=zoudi_chicken] at @s if block ~ ~-1 ~ #leaves run advancement grant @p only chmagic:yyyaaaaaaaahhh