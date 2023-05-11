package de.timmi6790.utility.modules.packets.printer.mappers.client.play;

import java.util.Map;

import net.minecraft.network.play.client.C03PacketPlayer;

import de.timmi6790.utility.modules.packets.printer.mappers.ClientPacketMapper;


public class C04PacketPlayerPositionMapper extends ClientPacketMapper<C03PacketPlayer.C04PacketPlayerPosition>
{
	public C04PacketPlayerPositionMapper()
	{
		super(C03PacketPlayer.C04PacketPlayerPosition.class);
	}

	@Override
	public void parsePacketToMap(final C03PacketPlayer.C04PacketPlayerPosition packet, final Map<String, String> valueMap)
	{
		valueMap.put("Position", this.join(packet.getPositionX(), packet.getPositionY(), packet.getPositionZ()));
		valueMap.put("OnGround", String.valueOf(packet.isOnGround()));
	}
}
