package net.lepidodendron.entity.util;

public interface IBrood {


    int getAdultAge();


    //must use to set babies in onInitialSpawn method:
    /*
    @Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setTicks(0);
		this.setAgeTicks(this.getAdultAge());
		if (Math.random() >= 0.8) {
			this.setBabies(true);
		}
		return livingdata;
	}



	ALSO NEED THIS IN onEntityUpdate:

	public void onEntityUpdate() {
		super.onEntityUpdate();
		this.setIsBaby(!(this.getAgeTicks() >= getAdultAge()));
	}


	Finally Needs these two NBT methods and this entityInit method:

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setBoolean("Babies", this.getBabies());
		compound.setBoolean("IsBaby", this.getIsBaby());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setBabies(compound.getBoolean("Babies"));
		this.setIsBaby(compound.getBoolean("IsBaby"));
	}



     */


}
