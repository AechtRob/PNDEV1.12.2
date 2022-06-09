package net.lepidodendron.entity;

//import trinity.util.IConstantRenderer;

import javax.annotation.Nullable;

import nc.capability.radiation.source.IRadiationSource;
import net.lepidodendron.world.gen.MeteoriteImpact;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityPrehistoricFloraMeteor extends Entity {

    public EntityPrehistoricFloraMeteor(World worldIn)
    {
        super(worldIn);
        this.preventEntitySpawning = true;
        this.isImmuneToFire = true;
        this.setSize(0.98F, 0.98F);
    }

    public EntityPrehistoricFloraMeteor(World worldIn, double x, double y, double z)
    {
        this(worldIn);
        this.setPosition(x, y, z);
        float f = (float)(Math.random() * (Math.PI * 2D));
        this.motionX = (double)(-((float)Math.sin((double)f)) * 0.5F);
        this.motionZ = (double)(-((float)Math.cos((double)f)) * 0.5F);
        this.prevPosX = x;
        this.prevPosY = y;
        this.prevPosZ = z;
    }

    protected void entityInit()
    {

    }

    /**
     * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
     * prevent them from trampling crops
     */
    protected boolean canTriggerWalking()
    {
        return false;
    }

    /**
     * Returns true if other Entities should be prevented from moving through this Entity.
     */
    public boolean canBeCollidedWith()
    {
        return !this.isDead;
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;

        if (!this.hasNoGravity())
        {
            this.motionY -= 0.03999999910593033D;
        }

        this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
        //this.motionX *= 0.9800000190734863D;
        this.motionY *= 0.9800000190734863D;
        //this.motionZ *= 0.9800000190734863D;

        if (this.onGround)
        {
        	this.setDead();
            if (!world.isRemote)
            {
            	MeteoriteImpact worldGen = new MeteoriteImpact(this.explode());
            	BlockPos pos = new BlockPos((int)posX, (int)posY, (int)posZ);
            	if (worldGen.generate(world, rand, pos)) {
            		worldGen.postImpact(world, (int)posX, (int)posY, (int)posZ);
            	}
            }
        }

        this.world.spawnParticle(EnumParticleTypes.EXPLOSION_HUGE, this.posX, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 0.0D);        
    }

    protected Explosion explode() {
		//float f = (float) (6);
		Explosion explosion = new Explosion(world, this, posX, posY, posZ, 6, true, true);
        explosion.doExplosionA();
        explosion.doExplosionB(true);
        return explosion;
	}

    public float getEyeHeight()
    {
        return 0.0F;
    }

	@Override
	protected void readEntityFromNBT(NBTTagCompound compound) {
	
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound compound) {
		
	}
}
