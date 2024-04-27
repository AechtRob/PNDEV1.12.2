
package net.lepidodendron.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.AxisAlignedBB;

public class TileEntityGangtoucunia extends TileEntity implements ITickable {

	private int hidden;
	private int cluster;
	private float offset1;
	private float offset2;

	@Override
	public void update()
	{
		if (this.hidden <= 360) {
			++this.hidden; //increment the hidden tag up to 361 and stop there
		}
	}

	@Override
	public AxisAlignedBB getRenderBoundingBox() {
		return new AxisAlignedBB(pos, pos.add(1, 2, 1));
	}

	public int getHidden() {
		return this.hidden;
	}

	public int getCluster() {
		return this.cluster;
	}

	public float getOffset1() {
		return this.offset1;
	}

	public float getOffset2() {
		return this.offset2;
	}

	public void setHidden(int hidden) {
		this.hidden = hidden;
	}

	public void setCluster(int cluster) {
		this.cluster = cluster;
	}

	public void setOffset1(float offset1) {
		this.offset1 = offset1;
	}

	public void setOffset2(float offset2) {
		this.offset2 = offset2;
	}

	@Override
	public SPacketUpdateTileEntity getUpdatePacket() {
		NBTTagCompound tag = new NBTTagCompound();
		this.writeToNBT(tag);
		return new SPacketUpdateTileEntity(pos, 1, tag);
	}

	@Override
	public void onDataPacket(NetworkManager netManager, SPacketUpdateTileEntity packet) {
		readFromNBT(packet.getNbtCompound());
	}

	@Override
	public NBTTagCompound getUpdateTag() {
		return this.writeToNBT(new NBTTagCompound());
	}

	@Override
	public void handleUpdateTag(NBTTagCompound tag) {
		this.readFromNBT(tag);
	}

	@Override
	public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
		if (compound.hasKey("hidden")) {
			this.hidden = compound.getInteger("hidden");
		}
		if (compound.hasKey("cluster")) {
			this.cluster = compound.getInteger("cluster");
		}
		else {
			this.cluster = this.world.rand.nextInt(3) + 1;
		}
		if (compound.hasKey("offset1")) {
			this.offset1 = compound.getFloat("offset1");
		}
		else {
			this.offset1 = Math.max(this.world.rand.nextFloat() * 0.45F, 0.2F) * (this.world.rand.nextBoolean() ? 1F : -1F );
		}
		if (compound.hasKey("offset2")) {
			this.offset2 = compound.getFloat("offset2");
		}
		else {
			this.offset2 = Math.max(this.world.rand.nextFloat() * 0.45F, 0.2F) * (this.world.rand.nextBoolean() ? 1F : -1F );
		}
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound)
	{
		super.writeToNBT(compound);
		compound.setInteger("hidden", this.hidden);
		compound.setInteger("cluster", this.cluster);
		compound.setFloat("offset1", this.offset1);
		compound.setFloat("offset2", this.offset2);
		return compound;
	}

}